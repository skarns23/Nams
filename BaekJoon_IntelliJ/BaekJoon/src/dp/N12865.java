package dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N12865 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] dp = new int [K+1];
        int[][] arr = new int [N][2];
        StringTokenizer st;
        for(int i = 0 ;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(o1,o2)->{
            return o1[0]-o2[0];
        });
        for(int i = 0 ;i<N;i++){
            if(arr[i][0]<=K){
                if(arr[i][0]<=2){
                    dp[arr[i][0]] = Math.max(dp[arr[i][0]],arr[i][1]);
                }
                for(int x = 1; x<=((arr[i][0]-1)/2);x++){
                    dp[arr[i][0]] = Math.max(dp[arr[i][0]-x]+dp[x],arr[i][1]);
                }
            }
        }
        for(int i =1;i<=(K-1)/2;i++){
            dp[K] = Math.max(dp[K-i]+dp[i],dp[K]);
        }
        System.out.println(dp[K]);

    }
}
