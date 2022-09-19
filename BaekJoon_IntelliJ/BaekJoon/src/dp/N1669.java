package dp;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1699
// 제곱수의 합 문제
// 모든 수는 제곱 수의 합으로 나타낼 수 있음, 수가 주어질때 제곱 수의 합 중 최소의 수 값을 구하시오
public class N1669 {
    static int[] dp;
    public static void main(String[] args) {
        // 입출력을 위한 초기 설정
        Scanner sc = new Scanner(System.in);

        // 합에 필요한 최소 항의 수를 찾기위한 수
        int N = sc.nextInt();
        // 각 값에서 최소 항의 수를 담을 dp 배열
        dp = new int [N+1];

        // 전체 값을 최대 값으로 초기화 후 0번째 인덱스의 값만 0으로 변경하여
        // 최소 값을 구하기 편리하게 합니다.
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        // Bottom-up 형식으로 구현
        for(int i = 1;i<=N;i++){
            int sqrt = (int)Math.sqrt(i); // i에 들어갈 수 있는 최대 제곱 수?
            /*
            * i가 18일때 최소 항의 수는 최대 제곱근인 4를 활용
            * dp[18-16]+1, dp[18-9]+1, dp[18-4]+1, dp[18-1]+1 값 중 하나가 됨
            * +1은 제곲한 항을 추가 해주는 것
            * */
            for(int j =sqrt;j>0;j--){ 
                int pow = j*j;
                dp[i] = Math.min(dp[i-pow]+1,dp[i]);
            }
        }
        System.out.println(dp[N]);

    }

}
