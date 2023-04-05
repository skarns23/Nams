import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.FileInputStream;

public class test {

        public static void main(String args[]) throws Exception {
            //System.setIn(new FileInputStream("C:\sample_input.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st  =new StringTokenizer(br.readLine());

            int T = Integer.parseInt(st.nextToken());
            for(int i=0;i <T;i++){
                int answer= 0;
                Map<Integer, List<Integer>> map = new HashMap<>();
                st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int[] arr = new int [N+1];
                int K = Integer.parseInt(st.nextToken());
                for(int j=0;j<N-1;j++){
                    st = new StringTokenizer(br.readLine());
                    int start = Integer.parseInt(st.nextToken());
                    int end = Integer.parseInt(st.nextToken());

                    if(!map.containsKey(start)) map.put(start,new ArrayList<>());
                    if(!map.containsKey(end)) map.put(end,new ArrayList<>());
                    map.get(start).add(end);
                    map.get(end).add(start);
                }
                st = new StringTokenizer(br.readLine());
                for(int k=1;k<=N;k++){
                    arr[k] = Integer.parseInt(st.nextToken());
                }
                for(int start=1;start<=N;start++){
                    answer += bfs(map,start,K,N,arr);
                }
                System.out.println(answer);
            }

        }
        public static int bfs(Map<Integer,List<Integer>> map, int start, int K,int N,int[] arr){
            Queue<int[]> que = new LinkedList<>();
            boolean[] visited = new boolean[N+1];
            int result =arr[start]==1?1 : 0;
            que.add(new int[]{start,0});
            visited[start] = true;

            while(!que.isEmpty()){
                int[] pos = que.poll();
                for(int next : map.get(pos[0])){
                    if(!visited[next]&&pos[1]+1<=K){
                        visited[next] = true;
                        if(arr[next]==1) result++;
                        que.add(new int[]{next,pos[1]+1});

                    }
                }
            }
            return result;
        }


}
