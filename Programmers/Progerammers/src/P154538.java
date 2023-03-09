import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/154538
// 숫자 변환하기
// 자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.
// x에 n을 더합니다
// x에 2를 곱합니다.
// x에 3을 곱합니다.
// target 값을 만들 수 있는 최소 연산 수를 구하시오.
public class P154538 {
    static class Solution {
        // 각 index에 도달할 수 있는 최소 연산수를 저장할 배열 dp
        public static int[] dp;
        public int solution(int x, int y, int n) {
            // dp 배열의 목표 위치 값인 y까지 도달할 수 있도록 y+1 크기로 배열 생성
            dp = new int[y+1];

            // dp 배열의 각 index별 최소 연산수를 저장하기 위해, 모든 index의 값을 int 최대 값으로 초기화
            Arrays.fill(dp,Integer.MAX_VALUE);

            // 시작 위치인 x의 경우 이동하지 않았음으로 0으로 설정
            dp[x] = 0;

            // 이동한 인덱스를 저장할 List 선언
            List<Integer> list = new LinkedList<>();

            // 초기 시작 index를 넣어 줌
            list.add(x);
            int idx=0;

            // 이동할 index가 존재하지 않는 경우 종료하도록 설정
            while(!list.isEmpty()){
                // 이동할 index를 뽑아서 변수에 담아줌
                idx = list.remove(0);
                
                // 이후 이동할 수 있는 index 값 설정
                int pidx = idx + n;
                int didx = idx * 2;
                int tidx = idx * 3;

                // index 값 유효성 여부 판단 후, 최소 값으로 갱신 가능한 경우 이동하고 list에 index 넣어줌
                if(pidx<=y &&(dp[idx]+1<dp[pidx])){
                    dp[pidx] = dp[idx] +1;
                    list.add(pidx);
                }
                if(didx<=y&&(dp[idx]+1<dp[didx])){
                    dp[didx] = dp[idx] +1;
                    list.add(didx);
                }
                if(tidx<=y&&(dp[idx]+1<dp[tidx])){
                    dp[tidx] = dp[idx] +1;
                    list.add(tidx);
                }
            }


            return dp[y]==Integer.MAX_VALUE? -1 : dp[y];
        }
    }
}
