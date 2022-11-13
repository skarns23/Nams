// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 푸드 파이트 대회
// 같은 칼로리의 음식을 둘 다 공정하게 나눠먹을 수 있는 형태로 나눠주는 문제
// 음식 종류의 수를 둘로 나누어 버림 연산을 하면 둘 다 공정하게 먹을 수 있음
// 이후 해당 칼로리에 대해 repeat 연산을 통해 문자열로 만들어줌
public class P134240 {
    class Solution {

        public String solution(int[] food) {
            // StringBuilder 사용하여 메모리 줄이기
            StringBuilder sb = new StringBuilder();
            // 음식의 개수를 2로 나눈뒤 버림 연산을 통해 둘다 공정하게 먹도록 하고
            // repeat 메서드를 통해 문자열을 반복하여 넣어줌
            for(int i =1;i<food.length;i++){
                int value = (int)Math.floor(food[i]/2);
                sb.append(String.valueOf(i).repeat(value));
            }
            // 중간에 도달한 경우 물인 0을 추가
            sb.append("0");
            // 1번 사람에 대한 문자열을 만든뒤 역순으로 StringBuilder에 넣어 대칭되도록 해줌
            String str = sb.toString();
            for(int i = str.length()-2;i>=0;i--){
                sb.append(str.charAt(i)+"");
            }
            return sb.toString();
        }
    }
}
