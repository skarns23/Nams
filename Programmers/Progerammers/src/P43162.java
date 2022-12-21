import  java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/43162
// 네트워크
// 네트워크와 같이 서로 연결된 네트워크들의 집합은 하나의 네트워크로 본다,  총 네트워크의 개수를 반환하시오
// 아이디어 : 오른쪽으로 우선 탐색하여, 같은 네트워크 상에 있는 경우 count 값을 통해 같은 네트워크임을 알림
//           이후 찾은 동일한 네트워크의 x와 y값을 바꿔 해당  행을 탐색
// 이처럼 진행하여 모든 행을 탐색한 후 종료
public class P43162 {
    class Solution {
        public int solution(int n, int[][] computers) {
            int count = 0;

            for(int i = 0;i<n;i++){
                Queue<Integer[]> que = new LinkedList<>();
                for(int j =0;j<n;j++){
                    if(computers[i][j]==1){
                        que.add(new Integer[]{j,i,count});
                        computers[i][j]=count;
                        computers[j][i] =count;
                    }
                }
                if(!que.isEmpty()){
                    count--;
                    while(!que.isEmpty()){
                        Integer[] arr = que.poll();
                        for(int col = 0;col<n;col++){
                            if(computers[arr[0]][col]==1){
                                que.add(new Integer[]{col,arr[0],count});
                                computers[arr[0]][col] = count;
                                computers[col][arr[0]] = count;
                            }
                        }
                    }

                }
            }
            return count*(-1);
        }
    }
}
