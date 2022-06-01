package dev_matching_2021;

import java.util.LinkedList;
import java.util.Queue;

public class Lv2_Matrix {
    class Solution {
        public int[] solution(int rows, int cols, int[][] queries) {
            int[] answer = new int [queries.length];
            Queue<Integer> que = new LinkedList<>();
            int value = 1;
            int[][] arr = new int[rows][cols];
            for(int i = 0 ;i <rows;i++) { //rows * cols 크기의 행렬 생성
                for(int j = 0; j<cols;j++) {
                    arr[i][j] = value;
                    value++;
                }
            }
            for(int i =0; i<queries.length;i++) {
                int x1 = queries[i][0]-1;
                int y1 = queries[i][1]-1;
                int x2 = queries[i][2]-1;
                int y2 = queries[i][3]-1;
                int x, y;
                int min = Integer.MAX_VALUE;
                int[][] arr2 = arr.clone();
                x = x1; y = y1+1; //시계방향으로 돌기
                que.add(arr[x1][y1]); // 시작점 value que에 넣음
                while(!(x ==x1 &&y == y1)){ //처음 위치로 돌아오기전까지 반복
                    que.add(arr[x][y]); // 이동한 위치 값 넣어줌
                    if(x==x1 &&y<y2)
                        y++;
                    else if(y==y2 &&x<x2)
                        x++;
                    else if(x==x2&&y>y1)
                        y--;
                    else if(y==y1 &&x>x1)
                        x--;


                }
                y++;
                while(!que.isEmpty()) {
                    int v = que.poll();
                    if(v <min)
                        min = v;
                    arr[x][y] = v;
                    if(x==x1 &&y<y2)
                        y++;
                    else if(y==y2 &&x<x2)
                        x++;
                    else if(x==x2&&y>y1)
                        y--;
                    else if(y==y1 &&x>x1)
                        x--;
                }
                answer[i] = min;
            }
            return answer;
        }
    }
}
