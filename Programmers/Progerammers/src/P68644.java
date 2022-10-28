import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
// 두 개 뽑아서 더하기
// 정수 배열을 입력받아 두 수의 합으로 만들어지는 수들을 반환하는 문제
public class P68644 {

    class Solution {
        public int[] solution(int[] numbers) {
            // 중복젝를 위해 Set 자료구조 활용 
            Set<Integer> set = new HashSet<>();
            // 선택정렬과 같이 모든 경우의 수를 2중 for문을 통해 구함 
            for(int i =0; i<numbers.length-1;i++){
                for(int j=i+1;j<numbers.length;j++){
                    set.add(numbers[i]+numbers[j]);
                }
            }
            // 이후 set으로 distinct 처리된 값을 list로 변환 
            List<Integer> list = new ArrayList<>();
            for(int i :set){
                list.add(i);
            }
            // list 오름차순 정렬 
            Collections.sort(list);
            // strema을 활용하여 Integer을 int 형태로 변경 후 배열로 변환화여 반환
            int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        }
    }
}
