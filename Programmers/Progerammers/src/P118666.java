import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
// 성격 유형 검사하기
// MBTI와 같이 성격 유형 별 점수를 더하여 MBTI를 추출해내는 문제
// 점수가 같은 경우 사전에서 먼자나오는 문자를 획득
public class P118666 {
    class Solution {
        public String solution(String[] survey, int[] choices) {
            // 결과 값을 담기위한 StringBuilder 생성
            StringBuilder sb = new StringBuilder();
            // 설문의 값을 담을 arr 배열
            int[] arr = new int [26];
            // list에 성격유형 사전순으로 넣어서 마지막 출력때 사용
            List<String[]> list = new ArrayList<>();
            list.add(new String[] {"R","T"});
            list.add(new String[] {"C","F"});
            list.add(new String[] {"J","M"});
            list.add(new String[] {"A","N"});

            // 총 설문횟수만큼 반복하는 반복문
            for(int i = 0; i<survey.length;i++){
                String str = survey[i]; // 설문 유형 값을 받아옴
                if(choices[i]<4){ // 설문 값이 4보다 작은 경우 첫번째 유형에 설문 값을 더해줌
                    arr[str.charAt(0)-'A'] +=4-choices[i];
                }else { // 설문 값이 4이상인 경우 두번쨰 유형에 설문 값을 더해줌
                    arr[str.charAt(1)-'A'] +=choices[i]-4;
                }
            }
            // list에서 유형을 사전순으로 가져옴
            for(int i = 0; i<4;i++){
                String front = list.get(i)[0];
                String back = list.get(i)[1];
                // 앞에있는 유형의 설문 값이 더 크거나 같은 경우 앞에 있는 문자를 담음
                if(arr[front.charAt(0)-'A']>=arr[back.charAt(0)-'A']){
                    sb.append(front);
                }else{ // 아닐 경우 뒤에있는 문자 담음 
                    sb.append(back);
                }
            }
            return sb.toString();
        }
    }
}
