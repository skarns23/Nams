import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/86971
// 전력망을 둘로 나누기
// 연결된 간선들의 집합 중 하나를 제거하여, 두 전력망의 크기가 제일 작은 집합으로 만들 것
public class P86971 {
    static class Solution {
        public int solution(int n, int[][] wires) {
            // 간선들의 집합을 담아 놓을 Map 자료구조 선언
            Map<Integer,List<Integer>> map = new HashMap<>();
            // 초기 정답 값의 크기는 최대 값인 N으로 설정
            int answer = n;
            // 각 전력망에 대한 초기화
            for(int i=1;i<=n;i++){
                map.put(i,new ArrayList<>());
            }
            // 연결된 전력망에 대해 서로를 연결시켜줌 
            for(int i=0;i<wires.length;i++){
                map.get(wires[i][0]).add(wires[i][1]);
                map.get(wires[i][1]).add(wires[i][0]);
            }
            
            // 이후 각 간선에 대하여 제거한 뒤 ,전력망의 크기 차이를 계산하여 최소 값으로 갱신 
            for(int i=0;i<wires.length;i++){
                int resultA = Math.abs(bfs(wires[i][0],wires[i][1],map,n));
                int resultB = n-resultA;
                answer = Math.min(Math.abs(resultA-resultB),answer);
            }

            return answer;
        }
        
        // 시작점(start)와 종료지점(end)에 대해 간선을 끊은 뒤, 시작점에 대한 전력망의 크기를 반환하는 함수 
        public static int bfs(int start,int end, Map<Integer,List<Integer>> map,int n){
            // 방문 여부를 판단하기 위한 boolean형 배열 
            boolean[] visited = new boolean[n+1];
            
            // 주어진 간선 start-end에 대해 연결을 끊는 과정 
            map.get(start).remove((Object)end);
            map.get(end).remove((Object)start);
            
            // start와 연결된 집합의 크기를 담을 변수 count  
            int count = 0;
            
            // BFS와 동일하게 구현하기 위해 Queue를 활용 
            Queue<Integer> que = new LinkedList<>();
            
            // Queue에 시작점에 대한 정보를 넣어주며, 방문 여부를 true로 변환
            que.add(start);
            visited[start] = true;
            
            // Queue가 비게 되는 경우 start와 연결된 집합의 크기를 구하는 반복문 
            while(!que.isEmpty()){
                int pos = que.poll();
                count++;
                // Queue에서 뽑은 위치에서 연결된 간선에 대해 방문 여부를 체크
                // 방문하지 않은 경우 Queue에 넣어 추가적인 탐색을 진행하며, 방문 여부를 업데이트 함 
                for(int idx : map.get(pos)){
                    if(visited[idx]) continue;
                    que.add(idx);
                    visited[idx] = true;
                }
            }
            // 끊었던 간선을 다시 연결하는 작업
            map.get(start).add(end);
            map.get(end).add(start);
            return count;
        }



    }
}
