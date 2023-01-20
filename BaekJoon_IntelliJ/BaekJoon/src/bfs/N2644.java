package bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class N2644 {
    static boolean[] visited;
    static int result;
    static int N;
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        result = -1;
        visited = new boolean[N+1];
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int find_first = Integer.parseInt(st.nextToken());
        int find_second = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int nodes = Integer.parseInt(st.nextToken());
        Map<Integer, List<Integer>>  map = new HashMap<>();
        for(int i =1;i<=N;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i =0;i<nodes;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map.get(start).add(end);
            map.get(end).add(start);
        }
        dfs(0,map,find_first,find_second,0);
        bw.write(result+"");
        bw.flush();

    }

    public static void dfs(int depth, Map<Integer,List<Integer>> map, int start,int goal, int count){
        if(start==goal){
            result = count;
            return ;
        }
        if(depth == N){
            return ;
        }

        for(int val : map.get(start)){
            if(visited[val]) continue;
            visited[val] = true;
            dfs(depth+1,map,val,goal,count+1);
            visited[val] = false;
        }
    }
}
