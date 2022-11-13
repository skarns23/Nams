// https://school.programmers.co.kr/learn/courses/30/lessons/131701
// 연속 부분 수 합의 개수
// 길이별 연속된 부분 수열의 합이 안겹치게 몇개나 나오는지를 찾아내는 문제
// 길이별 블록을 만들어 첫 합을 구한 뒤, 블록을 뒤로 옮기면서 맨 앞의 값을 뺴고, 맨 뒤의 값을 넣어주면 블록의 합을 구해서 넣어줌\
import java.util.*;
public class P131701 {
    class Solution {
        public int solution(int[] elements) {
            // 만들어진 부분 수열의 중첩을 허용하지 않음으로 Set 사용
            Set<Integer> set = new HashSet<>();
            // Len 은 부분 수열의 깅리를 의미함  len의 범위는 1 ~ elements 배열의 길이까지
            int len = 1;
            // len 이 elements 배열의 길이의 부분 수열까지만 탐색하도록
            while(len<=elements.length){
                // sum 은 len 길이 블록의 총합
                int sum = 0;
                // start 는 블록의 시작 위치를 의미 초기 값은 0
                int start = 0;
                // end 는 블록의 마지막 인덱스 +1 위치를 가리킴
                int end = len;
                // 첫 블록의 총합을 구하는 반복문
                for(int i = 0 ;i<end;i++){
                    sum +=elements[i];
                }
                // 블록의 첫 인덱스가 모든 배열의 원소를 탐색할 떄 까지만 반복하도록하는 while문
                while(start<elements.length){
                    // set에 블록의 총합 값을 넣어줌
                    set.add(sum);
                    // 이후 첫 인덱스의 값을 뺴고
                    sum-= elements[start];
                    start++;
                    // 마지막 인덱스의 유효성을 검사한 뒤 마지막 인덱스의 값을 넣어줌
                    end = end%elements.length==0?0:end;
                    sum +=elements[end];
                    end++;
                }
                // 정해진 블록의 크기에대해 모두 탐색하여, 블록의 크기를 증가시켜줌
                len++;

            }
            // set에 담겨있는 수의 개수로 결과 값 반환 
            return set.size();
        }
    }
}
