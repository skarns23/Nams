// https://school.programmers.co.kr/learn/courses/30/lessons/43163
// 단어 변환 (DFS/BFS)
// 시작 단어에서 부터 목표단어까지 주어진 단어 및 조건을 활용하여 변환 횟수를 구하는 문제
// DFS를 활용하여 첫 단어에서부터 변경가능한 경우에대해 파고들어가는 형식으로 문제를 해결
public class P43163 {
    static class Solution {

        // 문자열의 방문여부를 저장하는 boolean 배열
        public static boolean visited[];

        // 초기 결과값으로 target 문자열과 begin 문자열이 같아지는 경우 갱신
        public static int result=0;

        public int solution(String begin, String target, String[] words) {
            // visited[] 배열의 길이를 문자열 배열읙 길이와 같게 초기화 시켜줌
            visited = new boolean[words.length];

            // dfs 진행
            dfs(begin,target,words,0);
            return result;
        }

        // DFS 시작문자열 타겟문자열, 방문가능한 문자열 배열, DFS의 깊이 값을 파라미터로 받음
        public void dfs(String begin, String target ,String[] words, int depth){
            // 시작문자열과 target문자열과 같은 경우 완성까지 걸린 변환 횟수 업데이트
            // 만약 다앙햔 횟수로 성공하는 방법이 있다면 Math.min 함수를 활용하여 비교한 뒤 갱신해야할 것으로 예측
            if(begin.equals(target)){
                result = depth;
                return ;
            }
            // 탐색하는 depth가 문자열 배열의 크기를 넘어서면 return을 통해 중단 시킴
            if(depth>= words.length){
                return ;
            }

            for(int i = 0; i<words.length;i++){
                // 해당 문자열을 방문하지 않은 경우
                if(!visited[i]){
                    // 시작문자열과 현재 위치의 문자열 배열과 다른 문자의 갯수를 구함
                    int diff = 0;
                    for(int j=0;j<words[i].length();j++){
                        if(begin.charAt(j)!=words[i].charAt(j)){
                            diff++;
                        }
                        // 다른 문자의 수가 1개를 넘는 순간 탐색할 필요가 없어짐으로 for문 종료
                        if(diff>1){
                            break;
                        }
                    }
                    // 다른 문자가 1개인 경우 시작 문자열을 변경하여 dfs 재 진행
                    if(diff==1){

                        visited[i] = true;
                        dfs(words[i],target,words,depth+1);
                        visited[i] = false;
                    }
                }
            }
        }
    }
}
