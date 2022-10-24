import java.util.LinkedList;
import java.util.Queue;
// https://school.programmers.co.kr/learn/courses/30/lessons/120866
// 안전지대 문제
// 지뢰찾기와 같이 지뢰가 주어졌을떄 안전한 지대가 얼마나 있는지 맞추는 문제
public class P120866 {

    // BFS와 같이 생각했으나 그냥 2중 for문으로 돌려도 더 쉬웠을거같다.
    static class Solution {
        // 위험지대의 수를 세는 count
        static int count = 0;

        // 배열을 복사하여쓰기위한 arr 2차원 배열
        static int[][] arr;
        // BFS 구현을 위한 Queue
        static Queue<Index> que = new LinkedList<>();
        // 2차원 배열의 길이 len
        static int len;
        public int solution(int[][] board) {
            len = board.length;
            arr = new int [len][len];
            // 배열 복사 밑 위치 값이 1인 경우 que에 담아줌
            for(int i = 0;i<len;i++){
                for(int j =0;j<len;j++){
                    if(board[i][j]==1){
                        arr[i][j] = 1;
                        que.add(new Index(i,j));
                        count++;
                    }
                }
            }
            bfs();

            // 종료 후 전체 배열의 크기에서 위험지대의 수를 뺴서 반환
            return len*len-count;
        }
        static void bfs(){
            // 8방향 탐색을 위한 인덱스 이것도 2차원배열하나로 하는게 좋을거같음
            int[] indexX = {-1,-1,-1,0,1,1,1,0};
            int[] indexY = {-1,0,1,1,1,0,-1,-1};
            // que에 들어있는 1값이 모두 사라질때까지 실행
            while(!que.isEmpty()){
                // Index 인스턴스는 지뢰의 위치값을 갖고있음
                Index ind = que.poll();
                for(int i = 0 ; i<8;i++){ // 8방향 탐색
                    int nextX = ind.x+indexX[i]; // 다음의 X 위치
                    int nextY = ind.y+indexY[i]; // 다음의 Y 위치
                    // X, Y의 범위가 정상범주인 경우
                    if((0<=nextX&&nextX<len)&&(0<=nextY&&nextY<len)){
                        // 해당 위치의 값이 0이면 위험지대이므로 2로 변경 후 count의 수를 늘려줌
                        if(arr[nextX][nextY]==0){
                            arr[nextX][nextY]=2;
                            count++;
                        }
                        // 전체가 위험지대인 경우 break를 통해서 미리 멈춤
                        if(len*len-count==0){
                            break;
                        }
                    }
                }
            }
        }


        // 지로의 위치를 갖는 Index 클래스
        class Index{
            int x; // x는 행
            int y; // y는 열
            public Index(int x,int y){
                this.x = x;
                this.y = y;
            }
        }
    }
}
