import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12978
// 배달
// BFS/DFS 문제
// 1번 집을 기준으로 DFS를 진행해서 각 노드면 최소 값을 구함
public class P12978 {

    static class Solution {
        // 특정 집을 기준으로 연결되는 여러 노드들을 저장해야하므로 Map 내부에 Value를 List로 선언
        static Map<Integer,List<Node>> map = new HashMap<>();
        // 방문 여부를 판단하는 배열 visited
        static boolean[] visited;
        // 각 마을(노드)별 도착할 수 있는 최소 값을 저장하는 정수 배열 arr
        static int[] arr;

        public int solution(int N, int[][] road, int K) {
            // 총 방문할 수 있는 집의 수를 담을 변수 result
            int result =0;

            // visited, arr 배열 크기 선언
            visited = new boolean[N+1];
            arr = new int[N+1];

            // arr 배열의 값 초기화, 최대 값으로 설정한 뒤, Math.min 연산을 통해 값 변경
            Arrays.fill(arr,500000);
            // 시작 마을의 경우 값을 가지지 않으므로 0으로 초기화
            arr[1] =0;

            // map key, value 초기화
            for(int i=1;i<N+1;i++){
                map.put(i,new ArrayList<>());
            }
            // map 마을에 대한 정보가 서로 연결되도록 양쪽에 넣어줌
            for(int i =0;i<road.length;i++){
                map.get(road[i][0]).add(new Node(road[i][1],road[i][2]));
                map.get(road[i][1]).add(new Node(road[i][0],road[i][2]));
            }
            // 1번 마을부터 0이라는 가중치를 가지고, dfs 진행
            dfs(1,0,K);
            for(int i : arr){
                if(i<=K)
                    result++;
            }
            return result;
        }

        // DFS 함수
        // 파라미터 : 현재 위치 값인 index, 거리 값(가중치) count, K는 임계값
        public static void dfs(int index,int count,int K){
            // 한계 값을 넘어선 경우, 해당 DFS 함수는 종료 이전 depth( 이전 마을로 되돌아감)
            if(count>K){
                return ;
            }

            // 해당 마을과 연결된 마을들에 대한 반복문
            for(Node a : map.get(index)){
                // 이전에 방문한 마을인 경우 패스
                if(visited[a.point])continue;
                // 방문하지 않은 경우, 해당 마을 방문여부 true 로 변경 후 마을에 방문
                visited[a.point] = true;
                // 방문한 현재 마을에 대해 최소 값 비교
                arr[a.point] = Math.min(a.value+count,arr[a.point]);
                // 이후 해당 마을에 대해 변한 가중치와 함께 DFS 진행
                dfs(a.point,a.value+count,K);
                // DFS 종료 후, 해당 마을을 방문하지 않은 상태로 변경
                visited[a.point] = false;

            }
        }

        // 마을 경로에 대한 정보를 담는 Node 클래스
        class Node {
            // 연결된 마을
            int point;
            // 가중치
            int value;
            public Node(int point,int value){
                this.point = point;
                this.value = value;
            }
        }
    }
}
