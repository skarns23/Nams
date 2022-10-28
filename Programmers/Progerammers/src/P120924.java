// https://school.programmers.co.kr/learn/courses/30/lessons/120924
// 다음에 올 숫자
// 등비 수열 혹은 등차 수열이 배열로 주어짐 이후 마지막 수 다음에 올 값을 반환 
public class P120924 {
    class Solution {
        public int solution(int[] common) {
            // 배열의 길이를 중간으로 앞뒤로 계산하여 등차 혹은 등비를 구함 
            int max_len = common.length;
            int len = common.length /2;
            double op =0;
            double answer =0;
            // 중간에 위치한 값의 앞뒤로의 차이가 같은 경우 -> 등차 수열인 경우 마지막에 등차 값을 더해줌
            if(common[len]-common[len-1]==common[len+1]-common[len]){
                op = common[len]-common[len-1];
                answer = (double)common[max_len-1]+op;
            }
            // 등비 수열인 경우 마지막 값에 등비를 곱해서 반환 해당 문제에서 0번쨰항이 0인 경우 나눠주면 Exception 발생하므로 주의 
            else if(common[len]/common[len-1]==common[len+1]/common[len]){
                op = common[len]/common[len-1];
                answer = (double)common[max_len-1]*op;
            }
            return (int)answer;



        }
    }
}
