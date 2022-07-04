package prefixsum;

import java.io.*;
import java.util.StringTokenizer;

public class N11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] dp = new int [N+1][N+1];
        for(int i = 1; i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N;j++){
                dp[i][j] = dp[i][j-1] +Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int sum = 0;
            if(x1==x2 &&y1==y2){
                bw.write(dp[x1][y1]-dp[x1][y1-1]+"\n");
                continue;
            }
            for(int row = x1; row<=x2;row++){
                sum += dp[row][y2] - dp[row][y1-1];
            }
            bw.write(sum+"\n");

        }
        bw.flush();

    }
}
