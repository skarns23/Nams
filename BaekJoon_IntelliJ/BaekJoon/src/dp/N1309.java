package dp;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1309
// 동물원 문제
// 2xN  동물원 우리가 있을 때, 사자를 배치하는 방법의 수를 구하는 문제
// 사자는 가로, 세로로 붙어있을 수 없음, 0마리 배치도 1가지의 경우로 처리
public class N1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int [N+1];
        dp[0] = 1;
        // N = 1 일때 3가지, N = 2일때 7가지의 경우를 가짐 이후
        // N = N-1 *2 + N -2 의 점화식을 가짐
        if(N>=1)
            dp[1] = 3;
        for(int i =2;i<=N;i++){
            dp[i] = (dp[i-1] *2 +dp[i-2])%9901;
        }
        System.out.println(dp[N]);
    }
}
