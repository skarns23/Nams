import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12913
// 땅따먹기
// DP를 활용하여 점수의 최대 값을 구하는 문제
public class P12913 {
    static class Solution {
        // DP 배열을 통해 해당 위치에서 가질 수 있는 최대 값을 저장하는 2차원 DP 배열 선언
        public static int[][] dp;
        int solution(int[][] land) {
            // DP배열을 넘어온 land 배열 크기와 동일하게 선언
            dp = new int[land.length][4];

            // 첫번째 행에 대한, 값 초기화
            for(int i=0;i<4;i++){
                dp[0][i] = land[0][i];
            }

            // 행 단위로, 각 열에 대한 최대 값을 갖는 경우를 탐색
            for(int i=1;i<dp.length;i++){

                // 기준이 되는 열을 지정할 반복문 및 idx 변수
                for(int idx=0;idx<4;idx++){

                    // 해당 열에서 갖는 최대 값을 저장할 변수
                    int max_val = 0;

                    // 다른 열들에 대해 탐색하는 반복문
                    for(int j=0;j<4;j++){
                        // 같은 열인 경우 뛰어 넘도록 함
                        if(idx==j) continue;
                        // 이후, 현재 행, idx 위치의 값에 대해 최대 값을 구하는 과정
                        max_val = Math.max(dp[i-1][j]+land[i][idx],max_val);
                    }
                    dp[i][idx] = max_val;
                }
            }
            // 마지막 행, sort를 진행하여 제일 큰 값이 마지막열에 위치하도록 함
            Arrays.sort(dp[land.length-1]);

            // 이후 마지막 열을 return
            return dp[land.length-1][3];
        }
    }
}
