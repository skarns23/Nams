package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N3055 {
    public static String[][] arr;
    public static boolean[][] visited;
    public static int answer = 0;
    public static int[][] idx = new int [][]{{0,1},{1,0},{0,-1},{-1,0}};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        visited = new boolean[R][C];
        arr = new String[R][C];
        Queue<int[]> rain = new LinkedList<>();
        Queue<int[]> dochi = new LinkedList<>();
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                String point = str.charAt(j)+"";
                arr[i][j] = point;
                if(point.equals("S")) dochi.add(new int[]{i,j,0});
                else if(point.equals("*")) rain.add(new int[]{i,j,-1});
            }
        }
        bfsForN3055(rain,dochi);
        bw.write(answer==0?"KAKTUS":String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static void bfsForN3055(Queue<int[]> rain,Queue<int[]> dochi){
        int pre=0;
        rain = forRain(rain);
        while(!dochi.isEmpty()){
            int[] ddochi = dochi.poll();
                if(pre!=ddochi[2]){
                    rain = forRain(rain);
                    pre=ddochi[2];
                }


                visited[ddochi[0]][ddochi[1]] = true;
                for(int i=0;i<idx.length;i++){
                int nextX = ddochi[0] + idx[i][0];
                int nextY = ddochi[1] + idx[i][1];
                if((0<=nextX &&nextX<arr.length) &&(0<=nextY&&nextY<arr[0].length)){
                    if(arr[nextX][nextY].equals(".")&&!visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        arr[nextX][nextY] = "S";
                        arr[ddochi[0]][ddochi[1]]=".";
                        dochi.add(new int[]{nextX, nextY, ddochi[2]+1});
                    }else if(arr[nextX][nextY].equals("D")){
                        answer = ddochi[2]+1;
                        return;
                    }
                }

            }

        }
    }

    public static Queue<int[]> forRain(Queue<int[]> rains){
        Queue<int[]> result = new LinkedList<>();
        String str = "*";
        while(!rains.isEmpty()){
            int[] temp = rains.poll();
            for(int i=0;i<idx.length;i++){
                int nextX = temp[0] + idx[i][0];
                int nextY = temp[1] + idx[i][1];

                if(((0<=nextX &&nextX<arr.length) &&(0<=nextY&&nextY<arr[0].length))&&(arr[nextX][nextY]).equals(".")){
                    arr[nextX][nextY] = str;
                    result.add(new int[]{nextX,nextY,-1});
                }
            }
        }
        return result;
    }
}
