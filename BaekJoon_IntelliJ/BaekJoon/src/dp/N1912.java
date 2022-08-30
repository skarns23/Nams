package dp;

import java.io.*;
import java.util.StringTokenizer;

public class N1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N];
        int max = dp[0] = arr[0];

        for(int i=1;i<N;i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            if(max<dp[i]){
                max = dp[i];
            }
        }
        bw.write(max+"");
        bw.flush();
    }
}
