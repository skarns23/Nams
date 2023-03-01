import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/131704
// 택배상자 문제
// 주어진 순서에 맞춰 나열할 수 있는 최대의 수를 구하는 문제
public class P131704 {
    class Solution {
        public int solution(int[] order) {
            // 만들 수 있는 최대 경우의 수
            int answer = 0;
            // 컨테이너 벨트에 존재하는 박스에서 위치가 맞지 않으면 담아 놓을 스택
            Stack<Integer> stack = new Stack<>();

            // 주어진 박스의 순서 order에 가리킬 index 값
            int idx = 0;

            // 오름차순으로 정렬되어 나오는 박스 값을 나타낼 정수형 변수
            int val = 1;

            // 1개의 박스를 넣어줌
            stack.push(val);

            // stack이 비면 종료되고, 박스 값 혹은 order를 가리키는 index 변수가 해당 길이를 초과하는 경우 종료
            while(!stack.isEmpty()&&val<=order.length&&idx <order.length){
                // 스택에 최상위에 담겨있는 값이 주어진 순서와 같은 경우
                if(stack.peek()==order[idx]){
                    // 해당 스택의 값을 뽑아냄
                    stack.pop();
                    // 정상적으로 담을 수 있는 경우 이므로 idx와 정답 값 증가
                    idx++;
                    answer++;
                    // 처음에 담겨있는 값인 1이 order에 처음에 바로 등장하는 경우 스택이 비어있는 상태로 종료되기때문에
                    // pop 한뒤 비어있다면 push 해주는 로직 생성
                    if(stack.isEmpty()) stack.push(++val);

                    // 주어진 순서의 값보다 작은 경우 컨테이너 벨트의 상자를 sub 컨테이너에 다시 담아줌
                }else if(stack.peek()<order[idx]){
                    stack.push(++val);
                }else {
                    // 현재 스택의 최상위 값이 주어진 순서보다 값이 크다면
                    // 해당 더이상 해당 순서를 맞출수 없음으로 종료 
                    break;
                }
            }
            return answer;
        }
    }
}
