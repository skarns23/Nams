// https://school.programmers.co.kr/learn/courses/30/lessons/120863
// 다항식 더하기
// x와 상수로 이루어진 다항식을 계산하여 가장 짧은 수식으로 나타내시오
// 아이디어 : 공백을 제거한 뒤 +기호를 중심으로 split하여서 문자만 남긴뒤 처리하는 방식을 선택
// 문제 : +의 경우 정규 표현식에서 사용되는 문자로서 split 메서드에서 + 그대로 넣으면 실행되지 않음
// -> 특수문자 처리 [] 를 통해서 해결
public class P120863 {
    class Solution {
        public String solution(String polynomial) {
            // x항의 계수를 담을 변수 x와 정수 값을 담을 value 변수 선언
            int x = 0;
            int value = 0;
            // 결과 값을 담을 answer 변수 생성
            String answer="";
            // replace 메서드를 통해 기존의 문자열의 공백을 제거함
            String str = polynomial.replace(" ","");
            // 공백이 제거된 문자열에 split 메서드를 통해 + 기호를 기준으로 나누어줌
            String[] result = str.split("[+]");
            // 나누어진 문자들에 대해서 x가 포함된 경우와 아닌 경우로 처리
            for(String s : result){
                if(s.contains("x")){ // x가 포함됬는데 사이즈가 1인 경우 계수없이 x만 존재하므로 x계수 ++연산
                    if(s.length()==1){
                        x++;
                    }else { // x에 계수가 존재하는 경우 substring을 통해 x를 제외한 나머지를 전수로 변환하여 더해줌
                        x+=Integer.parseInt(s.substring(0,s.length()-1));
                    }
                }else { // 정수 값의 경우 변환을 통해 더함
                    value+=Integer.parseInt(s);
                }
            }
            // x 계수의 유무와 정수 값 유무에따른 결과 값 문자열 설정
            if(x==0&&value!=0){
                answer +=value;
            }else if(x!=0&&value==0){ // x 계수의 값이 1인 경우 생략해야하므로 삼항연산자를 활용하여 결과 값 생성
                answer = answer + (x==1?"x":x+"x");
            }else if(x!=0&&value!=0){// x 계수의 값이 1인 경우 생략해야하므로 삼항연산자를 활용하여 결과 값 생성
                answer = answer + (x==1?"x + ":x+"x + ");
                answer += value;
            }
            return answer;
        }
    }
}
