import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120923?language=java
// 연속된 수의 합
// 연속된 수의 개수를 입력받아, 연속된 수의 합이 목표 값이되는 경우를 찾는 문제
// 아이디어 : 연속된 수의 크기만큼 list에 넣은 후 총 합과 목표 값의 크기를 비교하여 앞으로 혹은 뒤로 이동하며 목표 값을 맞춤
class Solution {
    public int[] solution(int num, int total) {
        // 연속된 수를 담을 list 생성
        List<Integer> list = new LinkedList<>();
        // 연속된 수의 총합을 담아놓을 변수 sum
        int sum = 0;
        // 연속된 수를 list에 넣으면서 총합을 구하기위해 sum 변수에 더해줌
        for(int i = 1;i<=num;i++) {
            list.add(i);
            sum += i;
        }
        // 총합과 목표 값이 같은 경우 종료 아닌 경우 반복되도록 while 문을 설정
        while(sum!=total){
            // 총합이 목표값 보다 작은 경우 오른쪽으로 이동하며 맨 앞의 값을 총합에서 제외
            // 맨 마지막으로 들어노는 값을 총합에 더해줌
            if(sum<total){
                int next = list.get(list.size()-1)+1;
                sum -=list.remove(0);
                sum +=next;
                list.add(next);
            }else { // 총합이 목표값 보다 큰 경우 왼쪽으로 이동하며 총합을 줄여야함
                // list 맨뒤의 값 제거 및 sum 에서 빼줌
                // 이후 list 맨 앞에값 -1한 value를 list 맨 앞에 넣어줌
                int next = list.get(0) -1;
                sum -= list.remove(list.size()-1);
                sum +=next;
                list.add(0,next);
            }
        }
        // stream의 경우 시간이 오래걸림으로 사용하지 않음
        //int[] answer = list.stream().mapToInt(i->i).toArray();

        int[] answer = new int[list.size()];
        for(int i =0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}