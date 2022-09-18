package bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class N14501 {
    static int N;
    static int max = 0;
    static int[][] arr;
    public static void dfs(int index,int sum){
        if(index>=N){
            max = Math.max(sum,max);
            return ;
        }
        for(int i=index;i<N;i++){
            if(i+arr[i][0]<N+1){
                dfs(i+arr[i][0],sum+arr[i][1]);
            }
        }
        max = Math.max(sum,max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        StringTokenizer st;
        for(int i = 0 ;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        bw.write(max+"");
        bw.flush();
    }
}
