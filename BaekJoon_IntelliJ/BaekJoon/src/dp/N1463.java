package dp;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1463
// DP 1로 만들기
// 정수 X가 주어질 경우 해당 수에 -1, /2, /3 연산을 통해 1로 만들 때 최소의 연산 수를 구하는 문제
public class N1463 {

    public static void main(String[] args) {

        //Scanner를 활용한 입력 값 받기
        Scanner sc = new Scanner(System.in);
        // 정수 값 N
        int N = sc.nextInt();

        // 이미 1인 경우 연산하지 않음 그러므로 0 출력
        if(N==1){
            System.out.println(0);
            return ;
        }else if(N<=3){ // 정수 값이 2~3인 경우 1번의 연산으로 진행가능
            System.out.println(1);
            return ;
        }
        // 이후 인덱스를 맞춰주기 위해 입력 값 +1 크기로 배열을 생성
        int[] dp = new int [N+1];
        // dp 배열 전체를 int 자료형 중 최대 값으로 설정
        Arrays.fill(dp,Integer.MAX_VALUE);
        // N 값이 1~3일때 초기화
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        // 이후 N까지 인덱스 값을 증가시키면서 Bottom-up형식으로 탐색
        for(int i =4;i<=N;i++){
            if(i%3==0){ // 현재 인덱스가 3으로 나누어지는 경우
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
            }
            if(i%2==0){ // 현재 인덱스가 2로 나누어지는 경우
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            }
            if(dp[i-1] !=Integer.MAX_VALUE){ // 현재 인덱스 이전의 값이 변경된 경우 비교
                dp[i] = Math.min(dp[i-1]+1,dp[i]);
            }
        }
        System.out.println(dp[N]);

    }

}
