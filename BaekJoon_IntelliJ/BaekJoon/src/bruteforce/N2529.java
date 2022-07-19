package bruteforce;

import java.io.*;

public class N2529 {
    public static char[] arr_char;
    public static boolean[] visited = new boolean[10];
    public static int N;
    public static void dfs(int depth){
        if(depth == N+1){

            return ;
        }
        for(int i = 9;i>=0;i--){
            if(visited[i])
                continue;
            result[depth] = i;
            if(depth != 0){

            }
        }
    }
    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr_char = new char[N];
        result = new int[N+1];

    }
}
