import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120956
// 옹알이 (1)
// 아기가 말할 수 있는 단어들로만 조합된 문자열의 수를 찾아 반환하시오
// 아이디어 : 앞부분부터 뒤에 인덱스를 늘리며 substring을 진행 ->
// substring한 문자열을 말할 수 있는 단어들이 담긴 set 배열에 포함되는 지 여부 판단
// 가능하면 앞의 인덱스를 뒤의 인덱스로 바꿔줌
// 이처럼 앞에서부터 앞에서부터 뒤의 인덱스까지의 단어가 포함되면 인덱스를 변경해주면서 진행함
// 그런데 뒤의 인덱스가 마지막위치에 도달했는데 포함되지 않았다면 그 단어는 말할 수 없는 것이 포함되어있으므로 false로 선언함
public class P120956 {
    class Solution {
        public int solution(String[] babbling) {
            // 말할 수 있는 문자열의 수를 카운트하는 answer
            int answer = 0;
            // 말할 수 있는 단어들을 담을 set
            Set<String> set = new HashSet<>();
            set.add("aya");set.add("ye");set.add("woo");
            set.add("ma");
            // 문자열 배열을 for-each 문을 통해서 반복함
            for(String s: babbling){
                // substring을 하기위한 앞의 인덱스와 끝의 인덱스 변수 start와 end
                int start = 0;
                // substring결과를 처음부터 갖기위해 end는 1로설정
                int end = 1;
                // sunbstring 한 문자열을 담을 문자열 변수 value 선언
                String value = "";
                // flag 변수는 true 값을 준뒤 말할 수 없는 단어이면 false로 바꿔서 결과 값에 담지않음
                boolean flag = true;
                // 앞과 뒤를 가리키는 인덱스가 유효한 인덱스 값을 가질때까지만 반복하도록 조건 설정
                while(start<s.length() && end<=s.length()){

                    value = s.substring(start,end);
                    // sunstring 한 문자열이 말할 수 있는 단어인 경우 해당 위치 다음부터 substring 다시 진행
                    if(set.contains(value)){
                        start = end;
                    }
                    // 말할 수 있는 단어 중간이나 시작에 이상한 알파벳이 들어가면 말을 할 수 없게되면서
                    // set에 포함되지 않는 문자열을 계속 substring 하며 가장끝까지옴
                    // 그래서 set에 포함되지 않는데 뒤를 가리키는 인덱스가 마지막 지점에오면 말을 할 수 없는 상태 이므로 false로 변경
                    else if(end==s.length()){
                        flag = false;
                    }
                    // 뒤를 가리키는 인덱스 위치를 한칸씩 옮겨줌
                    end++;

                }
                // 말을 할 수있는 경우  
                if(flag){
                    answer++;
                }




            }
            return answer;
        }
    }
}
