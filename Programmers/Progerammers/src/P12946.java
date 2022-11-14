// https://school.programmers.co.kr/learn/courses/30/lessons/12946
// 하노이탑 문제
// 하노이탑을 이동하며 판을 이동시키는 순서를 출력하라
public class P12946 {
    static class Solution {
        // 결과 값을 담을 2차원 배열 선언
        static int[][] arr;
        // 인덱스를 나타내는 변수 count 선언 넣는 경우 ++count를 통해 증가시킨 후 넣어주기떄문에 -1부터 시작
        int count = -1;
        // 하노이탑 최소 이동의 수를 구하는 변수와 arr 배열 초기화
        public int[][] solution(int n) {
            int num = (int)(Math.pow(2,n))-1;
            arr = new int [num][2];
            // 하노이 탑의 봉을 1 2 3으로 나타냄
            hanoi(1,2,3,n);
            return arr;
        }
        // 하노이 탑의 경우 판의 수와 시작, 중간, 끝 봉이 있으며
        // 처음 n-1개까지는 시작봉에서 도착 봉을 거쳐 중간 봉으로 이동 시킨다
        // 맨 마지막판을 끝 봉으로 옮긴 후
        // 다시 n-1개의 판을 중간 봉에서 시작봉을 거쳐 끝봉으로 가도록 한다.
        public void hanoi(int start, int mid, int end, int n){
            // n-1개의 판을 이동시킨 경우
            if(n==1){
                arr[++count][0] = start;
                arr[count][1] = end;
                return;
            }
            hanoi(start,end,mid,n-1);
            arr[++count][0] = start;
            arr[count][1] = end;
            hanoi(mid,start,end,n-1);
        }
    }

}
