package bfs;

import java.io.*;
import java.util.*;

public class N2667 {
    static int level = 2;
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        for(int i = 0 ;i<N;i++){
            String str = br.readLine();
            for(int j =0;j<N;j++){
                arr[i][j] = Integer.parseInt(str.charAt(j)+"");
            }
        }

        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                if(arr[i][j]==1){
                    arr[i][j]=level;
                    bfs(i,j,N,arr);
                }
            }
        }
        bw.write(level-2+"\n");
        Collections.sort(result);
        result.forEach(item -> {
            try {
                bw.write(item+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();

    }
    public static void bfs(int x, int y,int N,int[][] arr){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x,y});
        int[] nextX = new int []{1,0,-1,0};
        int[] nextY = new int []{0,-1,0,1};
        int count =0;
        while(!que.isEmpty()){
            count++;
            int[] temp = que.poll();
            for(int i =0;i<4;i++){
                int preX = temp[0]+nextX[i];
                int preY = temp[1]+nextY[i];
                if((0<=preX&&preX<N)&&(0<=preY&&preY<N)&&(arr[preX][preY]==1)){
                    arr[preX][preY] = level;
                    que.add(new int[]{preX,preY});
                }
            }
        }
        level++;
        result.add(count);
    }
}
