package dp;

import java.util.Arrays;
import java.util.Scanner;

public class AnotherWay_N1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int [N+1][3];
        Arrays.fill(dp[1],1); // 2x1인 경우 안 놓는 경우, 첫번째 줄에 서는 경우, 두번째 줄에 서는 경우  1,1,1
        for(int i =2; i<=N;i++){
            // i번째 줄에 사자가 없어도 되는 경우의 수
            // 이전 줄에서 없는 경우 + 1번 라인에 있는 경우 + 2번째 줄에 있는 경우
            dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;

            // i번째 줄에 1번 라인에 서는 경우의 수
            // 이전에 서지 않는 방법의 수 + 이전 줄의 2번째 라인에 서는 경우의 수
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;

            // i번째 줄에 2번 라인에 서는 경우의 수
            // 이전에 서지 않는 방법의 수 + 이전 줄의 1번째 라인에 서는 경우의 수
            dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
        }
        System.out.println((dp[N][0]+dp[N][1]+dp[N][2])%9901);
    }
}
