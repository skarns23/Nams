package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class N16234 {
    public static Map<Integer, List<Node>> map = new HashMap<>();
    public static int[][] arr;

    public static int[][] idx = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public static int[][] areas;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int level = 0;
        boolean flag = true;
        arr = new int[N][N];
        areas = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while(flag){
            level++;
            flag = false;

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    for(int k=0;k<idx.length;k++){
                        int nextX = i+idx[k][0];
                        int nextY = j+idx[k][1];
                        if((0<=nextX&&nextX<arr.length)&&
                                (0<=nextY&&nextY<arr.length)&&
                                areas[nextX][nextY]==0&&areas[i][j]==0
                                ){
                            int diff = Math.abs(arr[i][j]-arr[nextX][nextY]);
                            if((L<=diff&&diff<=R)) {
                                if (bfs(L, R, arr, i, j, level)) flag = true;
                            }
                        }

                    }
                }
            }
            if(!flag){
                level--;
                break;
            }
            areas = new int[arr.length][arr.length];


        }
        System.out.println(level);

    }


    public static boolean bfs(int L,int R,int[][] arr,int startX,int startY,int level){

        boolean result = false;
        Queue<Node> que = new LinkedList<>();
        List<Node> list = new ArrayList<>();
        que.add(new Node(startX,startY,arr[startX][startY]));
        int sum =arr[startX][startY];
        list.add(new Node(startX,startY,arr[startX][startY]));
        areas[startX][startY] =level;
        while(!que.isEmpty()){
            Node node = que.poll();
            for(int i=0;i<idx.length;i++){
                int nextX = idx[i][0]+node.x;
                int nextY = idx[i][1]+node.y;
                if((0<=nextX&&nextX<arr.length)&&(0<=nextY&&nextY<arr.length)&&areas[nextX][nextY]==0){
                    int diff = Math.abs(arr[node.x][node.y]-arr[nextX][nextY]);
                    if((L<=diff&&diff<=R)) {
                        areas[nextX][nextY] =level;
                        sum += arr[nextX][nextY];
                        que.add(new Node(nextX,nextY,arr[nextX][nextY]));
                        list.add(new Node(nextX,nextY,arr[nextX][nextY]));
                        result = true;
                    }

                }
            }
        }

        if(result){
            int newPeople = (int)(Math.floor(sum / list.size()));
            for(Node n : list){
                arr[n.x][n.y] = newPeople;
            }
        }


        return  result;
    }

    public static class Node{
        int x;
        int y;
        int people;
        public Node(int x,int y,int people){
            this.x = x;
            this.y = y;
            this.people = people;
        }
    }

}
