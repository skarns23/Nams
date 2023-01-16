import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/131130
// 혼자 놀기의 달인, 완전탐색
// A그룹에 대한 모든 경우와 그에 따른 B 그룹을 재귀함수를 이용하여 찾음
public class P131130 {
    static class Solution {
        // 카드 인덱스 방문 여부를 저장하는 boolean 배열
        static boolean[] visited;
        // 최고 점수 값을 담는 변수 result
        static int result = 0;
        // A 그룹의 값을 담는 int 자료형 변수
        static int first_value = 0;
        // B 그룹의 값을 담는 int 자료형 변수
        static int second_value = 0;
        public int solution(int[] cards) {
            // 첫번째 카드부터 A 그룹 탐색
            for(int i=0;i<cards.length;i++){
                // 방문 여부를 판단하는 visited 배열 크기 초기화
                visited = new boolean[cards.length];
                // 첫 시작 노드의 경우 방문으로 적용
                visited[i] = true;
                // 이후, 이동할 위치는 인덱스의 cards 배열 값
                int index = cards[i]-1;
                // A 그룹의 방문한 노드의 값을 1로 초기화
                first_value = 1;

                // 같은 노드를 다시 방문하는 경우 종료
                while(!visited[index]){
                    // A 그룹의 수 늘려줌
                    first_value++;
                    // 현재 노드에 대해 방문으로 상태 변경
                    visited[index] = true;
                    // 해당 위치의 cards 배열의 값을 인덱스로 변경하여 이동하도록 해줌
                    index = cards[index]-1;
                }

                // 찾은 A 그룹과 달리 방문하지 않은 노드들에 대해 시작하는 경우
                for(int j=0;j<cards.length;j++){
                    // B 그룹의 크기는 0으로 초기화
                    second_value = 0;
                    // 방문하지 않은 노드 존재 시, 재귀함수를 통해 탐색
                    if(!visited[j]){
                        first_dfs(cards,first_value,j);
                    }
                }
            }
            return result;
        }

        // B 그룹의 크기를 찾아내는 재귀함수
        public static void first_dfs(int[] cards, int depth,int index){
            // A 그룹과 B 그룹의 크기가 전체 노드의 수와 동일한 경우, 결과 값 갱신 후 종료
            if(depth==cards.length){
                result = Math.max(first_value*second_value,result);
                return ;
            }

            // 다음으로 이동하는 노드가 방문하지 않은 노드인 경우
            if(!visited[index]){
                // 해당 노드, 상태 값 변경 및 B 그룹 크기 변수 값 증가
                visited[index] = true;
                second_value++;
                // 이후 재귀함수를 통해, 재탐색
                first_dfs(cards,depth+1,cards[index]-1);

            }else{
                // 다음 이동하는 노드가 방문한 노드인 경우, 결과 값 변경
                result = Math.max(first_value*second_value,result);
                return ;
            }
        }


    }
}

