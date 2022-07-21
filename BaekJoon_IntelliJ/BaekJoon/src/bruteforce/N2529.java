package bruteforce;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class N2529 {
    static ArrayList<String> ans = new ArrayList<>();

    public static char[] arr_char;
    public static boolean[] visited = new boolean[10];
    public static int N;
    public static void dfs(int depth){
        if(depth == N+1){
            String str="";
            for(int i :result)
                str+=String.valueOf(i);
            ans.add(str);
            return ;
        }
        for(int i = 9;i>=0;i--){
            if(depth==0){
                result[depth] = i;
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
                continue;
            }
            if(visited[i])
                continue;
            result[depth] = i;
            if(arr_char[depth-1]=='<'){
                if(result[depth-1]<result[depth]){
                    visited[i] = true;
                    dfs(depth+1);
                }else
                    continue;
            }else{
                if(result[depth-1]>result[depth]){
                    visited[i] = true;
                    dfs(depth+1);
                }else
                    continue;
            }
            visited[i] = false;
        }
    }
    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr_char = new char[N];
        result = new int[N+1];
        String str=  br.readLine();
        for(int i = 0 ; i<N;i++){
            arr_char[i] = str.charAt(i*2);
        }
        dfs(0);
        System.out.println(ans.get(0));
        System.out.println(ans.get(ans.size()-1));
    }
}
