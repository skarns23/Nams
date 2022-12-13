
// https://school.programmers.co.kr/learn/courses/30/lessons/12900
// 2 x n 타일링
// 2 x n 크기의 사각형을 2 x 1 타일로 채울 수 있는 방법의 수를 구하는 문제
// 풀이 : 해당 문제의 경우 어려운 문제처럼 보이나 1에서부터 시작하는 피보나치 수열임을 인지하고 풀면 쉬움

public class P12900 {
    class Solution {
        public int solution(int n) {
            //  2 x 1 , 2 x 2 크기의 사각형의 각자 n의 값과 동일한 방법의 수를 가짐
            if(n<=2){
                return n;
            }
            // 1부터 시작하는 피보나치 수 구현을 위한 dp
            int[] dp =  new int[n+1];
            // 초기값 설정
            dp[1] = 1; dp[2] = 2;
            // 이후 피보나치 수열을 통해 2 x n 크기를 만드는 방법의 수를 계산
            for(int i =3;i<=n;i++)
                dp[i] = (dp[i-1] + dp[i-2])%1000000007;

            return dp[n];
        }
    }
}
