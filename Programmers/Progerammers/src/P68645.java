import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/68645
// 삼각 달팽이
// 주어진 크기의 삼각형을 반 시계방향으로 가며, 숫자르 채워 넣은 뒤 1차원 배열로 만들어 반환하는 문제
// 이동하는 방식이 3가지, 아래로 내려가는 형태, 오른쪽으로 이동, 위로 이동이 있음
// 해당 이동하는 방향에 대해 배열에 값을 넣어 놓고 이동하도록 하였으며, 3방향 모두 이동할 곳이 없는 경우 종료되도록 설정
public class P68645 {
    static class Solution {
        public static int[][] arr;
        public int[] solution(int n) {
            int size = 0;
            arr = new int [n][];
            for(int i=0;i<n;i++){
                arr[i] = new int[i+1];
                size +=(i+1);
            }
            int idxX = 0;
            int idxY = 0;
            int val = 1;
            boolean flag = true;
            int dir = 0;
            int[][] directs= new int [][]{{1,0},{0,1},{-1,-1}};
            arr[0][0] = val;
            int count =0;
            while(count<3){
                if(check(idxX+directs[dir][0],idxY+directs[dir][1])){
                    idxX +=directs[dir][0];
                    idxY +=directs[dir][1];
                    arr[idxX][idxY] = ++val;
                    count = 0;
                }else {
                    dir++;
                    dir %= 3;
                    count++;
                }
            }
            int[] answer = new int[size];
            int idx =0;
            for(int i=0;i<arr.length;i++){
                for(int j : arr[i]){
                    answer[idx] = j;
                    idx++;
                }
            }

            return answer;
        }

        public static boolean check(int x,int y){
            if((0<=x&&x<arr.length)&&(0<=y &&y<arr[x].length)&&(arr[x][y]==0)){
                return true;
            }
            return false;
        }
    }
}
