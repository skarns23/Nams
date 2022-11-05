// https://school.programmers.co.kr/learn/courses/30/lessons/120808#qna
// 분수의 덧셈
// 분자 분모가 나란히 2개 주어질 때 두 분수의 합을 기약분수로 나타내는 문제
public class P120808 {
    class Solution {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            // 분모와 분자를 구하기위한 변수를 설정 분모의 경우 두수의 곱
            // 분자의  분수 1의 분자 * 분수2의 분모 와 같은 형태로 구함
            int bottom = num1 * num2;
            int top = num1*denum2 + num2 * denum1;
            // 최대 공약수를 구할 maxMod
            int maxMod = 1;
            // 나눠줄 변수 mod
            int mod = 2;
            // 이후 나누는 값이 분모와 분자보다 작은 경우 까지만 반복문을 돌림
            while(mod<=top && mod<=bottom){
                if(top%mod == 0 &&bottom%mod ==0){
                    maxMod = mod;
                }
                mod ++;
            }
            // 배열에 담아서 반환
            int[] answer = {(top/maxMod),(bottom/maxMod)};
            return answer;
        }
    }
}
