package bfs;

import java.io.*;
import java.util.*;

public class N24444 {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] result;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        result = new int[N+1];
        result[R] = 1;
        for(int i =0;i<=N;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0 ;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            list.get(pre).add(next);
            list.get(next).add(pre);
        }

        for(int i=1;i<=N;i++){
            Collections.sort(list.get(i));
        }
        bfs(R);
        for(int i = 1; i< result.length;i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
    }

    public static void bfs(int start){
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        int count = 1;
        result[start] = count++;
        while(!que.isEmpty()){
            int go = que.poll();
            for(int i=0;i<list.get(go).size();i++){
                int next = list.get(go).get(i);
                if(result[next]==0){
                    que.add(next);
                    result[next] = count++;
                }
            }
        }
    }

}
