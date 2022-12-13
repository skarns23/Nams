// https://school.programmers.co.kr/learn/courses/30/lessons/140108
// 문자열 나누기 문제
// 2중 반복문을 활용
public class P14018 {
    class Solution {
        // 시작지점과 마지막 지점을 필요해
        public int solution(String s) {
            int answer = 0;
            int start = 0;
            int end = 0;
            int count = 0;
            // 시작할 떄의 문자와 뒤로 탐색하는 문자가 같은 경우 count 값을 플러스
            // 다른 경우 마이너스 하여서 0이 되면 시작문자와 아닌 문자의 갯수가 같은 경우이므로 정답값 추가
            while(start<s.length() && end<s.length()){
                if(s.charAt(start)==s.charAt(end)){
                    count++;
                }else {
                    count--;
                }

                if(count==0){
                    answer++;
                    start = end+1;
                    end++;
                    continue;
                }
                end++;
            }
            if(count!=0){
                answer++;
            }
            return answer;
        }
    }
}
