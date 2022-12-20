import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/1844
// 게임 맵 최단거리
// 0,0 에서부터 배열의 끝까지 갈 수 있는 최소값을 찾는 문제
// 아이디어 : BFS 사용해서 갈 수 있는 경로를 표시
public class P1844 {
    class Solution {
         int xLen;
         int yLen;
        public int solution(int[][] maps) {
            // 2차원 배열의 행 및 열의 길이를 변수에 담음
            xLen = maps.length;
            yLen = maps[0].length;
            // BFS 활용할 정수배열의 Queue 생성
            Queue<Integer[]> que = new LinkedList<>();
            // 시작점의 x,y, value 값을 배열로 담아 넣어줌
            que.add(new Integer[]{0,0,maps[0][0]});
            // 이후 방문하지 못하도록 -1로 값을 변경
            maps[0][0] = -1;

            // 좌우상하 값 탐색을 위한 이차원 배열 index
            int[][] index = {{0,1},{0,-1},{1,0},{-1,0}};
            //갈 수 있는 경로를 다 간경우 탐색을 종료
            while(!que.isEmpty()){
                // 맨 앞에있는 배열을 뽑아옴
                Integer[] arr = que.poll();
                for(int i = 0 ;i<4;i++){
                    // 좌우상하 이동시의 x,y 축의 값
                    int nextX = arr[0]+index[i][0];
                    int nextY = arr[1]+index[i][1];

                    // 이동할 x,y의 값이 유효하고 갈 수 있는 경로 중 방문하지 않은 곳인지 판단
                    if(posCheck(nextX,nextY)&&(maps[nextX][nextY]==1)){
                            // 갈 수 있는 경우 값 해당 위치의 값갱싱민 que에 넣어 해당 위치에서 이동할 수 있도록 설정
                            maps[nextX][nextY] = arr[2]+1;
                            que.add(new Integer[]{nextX,nextY,maps[nextX][nextY]});
                        }
                    }
                }

            // 도달하지 못한 경우 -1로 초기화
            return maps[xLen-1][yLen-1]==1? -1 : maps[xLen-1][yLen-1];
        }

        // 위치값의 유효성 검증 메서드
        public boolean posCheck(int x, int y){
            if((0<= x&& x<xLen)&&(0<=y&&y<yLen)){
                return true;
            }
            return false;
        }

    }
}
