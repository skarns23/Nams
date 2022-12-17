import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/49993
// 스킬트리
// 스킬트리의 경우 주어진 순서가 있다 해당 순서를 지키고, 스킬을 배운 경우의 수를 구하라
// 아이디어 : 스택에 스킬트리의 값을 역순으로 넣은 뒤, 사용자가 배운 스킬 순서를 stack에 포함여부와 peek 값과 비교
// 포함되어있는데 peek 값이 아닌 경우 스킬트리의 순서를 지키지 않은 것이므로 false를 반환하여 결과값에 추가하지 않음
public class P49993 {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            // 결과 값을 담을 변수 answer
            int answer = 0;
            // 사용자의 스킬 순서만큼 반복하는 for문
            for(String str : skill_trees){
                // 스킬트리의 순서를 지켰는지 여부를 판단할 flag 변수
                boolean flag = true;
                // 스킬트리를 역순으로 stack에 넣어 사용자의 스킬순서와 비교
                Stack<Character> stack = new Stack<>();
                // 스킬트리를 스택에 역순으로 넣는 과정
                for(int j = skill.length()-1;j>=0;j--)stack.push(skill.charAt(j));

                // 사용자의 스킬순서를 앞에서부터 한 문자씩 확인하는 반복문
                for(int i =0;i<str.length();i++){
                    char c = str.charAt(i);
                    // 해당 문자가 stack에 포함된 경우
                    if(stack.contains(c)){
                        // stack의 최상단의 값과 다른 경우 스킬트리 순서에 위배
                        // flag 변수 false로 변경 후 반복문 종료
                        if(stack.peek()!=c){
                            flag = false;
                            break;
                        }else {
                            // 포함되어있고, 최상위 값과 같은 경우 스킬트리 순서를 지키고 있음
                            // 그러므로 최상단의 값을 pop하여 제거해줌
                            stack.pop();
                        }
                    }
                }
                // 스킬트리 지켰는지 여부에 따라 결과 값 추가 
                if(flag) answer++;

            }

            return answer;
        }
    }
}
