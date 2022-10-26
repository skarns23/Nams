// https://school.programmers.co.kr/learn/courses/30/lessons/132267
// 콜라 문제
// a개의 병을 주면 b개의 병을 받는 상점에서 n개의 병을 갖고있을때 받을 수 있는 최대병의 수는 ?
public class P132267 {
    class Solution {
        public int solution(int a, int b, int n) {
            // a병을 주면 b병을 받음 n/a 후 나온 몫에 b를 곱해서 받는 병의 수에 더함
            // 또한 그 값과 나머지 후 남은 병 n%a 연산 결과를 합해 들고있는 병의 수 갱신
            int answer = 0;
            int last = 0;
            while((n/a)>0){
                answer +=  (n/a)*b;
                n = n%a + (n/a)*b;
            }

            return answer;
        }
    }
}
