package dp;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11726
// 2xn 타일링
// 1x2 타일과 2x1 타일으로 2xn 직사각형을 채울 수 있는 방법의 수 구하기
public class N11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dp = new long [N+1];
        // 2x1 크기인 경우 2x1 타일 하나로만 만들 수 있음
        dp[1] = 1L;

        // N이 2보다 큰 경우 2x2 직사각형의 경우 1x2 짜리 2개, 2x1짜리 2개로 만들 수 있음
        if(N>=2)
            dp[2] =2L;
        // 이후 직사각형의 크기에 따른 타일의 개수는 
        // 이전 -1 크기 직사각형의 타일 수 + -2 크기 직사각형의 타일 수로 정의됨
        // -1 직사각형의 타일에 2x1개짜리 타일을 붙여 만드는 경우
        // -2 직사각형의 타일에 2x2 크기의 타일을 붙여 만드는 경우가 합해지기 때문
        for(int i=3;i<=N;i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        System.out.print(dp[N]%10007);
    }
}
