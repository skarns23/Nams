import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/92335
// k진수에서 소수개수 구하기
// 해당 문제의 경우 N이라는 10진수를 K진수로 바꾼 후, 주어진 조건에 맞는 소수를 찾는 문제이다
// 처음 아이디어 : Stack을 활용하여, K진수로 바꾼 값을 담은 뒤, 정해진 범위의 소수를 배열형태로 만들어 놓아 해당 위치 값을 통해 판단할려했음
// 문제점       : 특정 값을 K진수로 만든 값 자체가 너무 커서 범위를 초과가 가능
// 아이디어 변경 : Stack에서 StringBuilder를 활용 / 소수 여부 판단의 경우 넘어오는 값에 대해서, isPrime이라는 함수를 통해 직접 확인
public class P92335 {
    static class Solution {
        public int solution(int n, int k) {
            // 조건에 부합하는 소수의 개수를 담는 정수형 변수 answer
            int answer = 0;

            // N을 K진수로 바꾼 값을 담아줄 StringBuilder 선언
            StringBuilder sb = new StringBuilder();

            // N을 K진수 형태로 변경 시키기 위해, 0보다 큰 상태일떄까지만 나눗셈과 모듈레이터 연산을 통해, K진수 값 생성
            while(n>=1){
                sb.append(String.valueOf(n%k));
                n /= k;
            }

            // 완성된, K진수의 경우 앞에서부터 채워져있어 StringBuilder의 reverse() 메서드를 활용, 이후,split을 통해 0을 기준으로 뗴어줌
            String[] sArr = sb.reverse().toString().split("0");

            // 공백이 나타나는 경우가 아니라면, isPrime 메서드를 통해 소수 여부 판단
            for(String s : sArr){
                if(s.length()==0) continue;
                if(isPrime(Long.parseLong(s))){
                    answer++;
                }
            }
            return answer;
        }

        /*
        * 소수 여부를 판단하는 메서드
        * K진수의 값이 int형을 넘어설 수 있음으로 long 자료형으로 선언
        * 모든 경우에 대해, 검사할 필요없이 해당 값에 제곱근까지만 확인하면 모든 경우에 대해 확인 가능
        * */
        public static boolean isPrime(long num){
            if(num==1) return false;
            for(long i=2;i<=Math.sqrt(num);i++){
                if(num%i==0) return false;
            }
            return true;
        }
    }
}
