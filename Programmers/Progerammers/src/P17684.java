import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/17684
// 압축 (18년도 3차 카카오 블라인드)
// 주어진 문자열을 조건에 따라 압축하는 문제
public class P17684 {
    class Solution {
        public int[] solution(String msg) {
            // 결과에 따른 문자열의 위치 값을 담을 Integer List
            List<Integer> result = new ArrayList<>();
            // 문자열을 담을 String List
            List<String> list = new ArrayList<>();

            // 기본 알파벳을 담는 과정
            for(int i=0;i<26;i++)
                list.add(String.valueOf((char)('A'+i)));

            // substring 시 활용할 시작 인덱스와 종료 인덱스
            int start = 0;
            int end = 1;
            // 종료 지점이 문자열의 길이와 같을 때 까지 반복문이 돌도록 구현
            for(;end<=msg.length();end++){
                // 지정된 문자열을 substring을 진행
                String sub = msg.substring(start,end);
                // 지정된 문자열이 list에 존재하는 경우 넘어감
                if(list.contains(sub)){
                    continue;
                }
                // 존재하지 않는 경우, 이전 종료지점 이전까지 substring 한 값에 대해 문자열 배열의 index 값 + 1을 진행하여 담아줌
                result.add(list.indexOf(msg.substring(start,end-1))+1);

                // sub에 해당하는 문자가 list에 존재하지 않음으로 담아줌
                list.add(sub);
                // 이후 end 위치를 앞으로 한칸 당겨 정상동작 되도록 구현
                end--;
                start = end;

            }
            // 최종적으로 마무리가 되고난 후, 마지막 문자열에 대한 인덱스 값이 담기지 않았음으로 담아줌
            result.add(list.indexOf(msg.substring(start,end-1))+1);
            // 배열로 만들어 결과 값으로 반환
            int[] answer = new int[result.size()];
            for(int i=0;i<answer.length;i++)
                answer[i] = result.get(i);

            return answer;
        }
    }
}
