package dp;


import java.io.*;
import java.util.*;
// https://www.acmicpc.net/problem/1932
// 정수 삼각형
public class N1932 {


    public static void main(String[] args) throws IOException {

        // 입출력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 삼각형 변의 길이
        int N = Integer.parseInt(br.readLine());

        // 값을 담을 배열 arr
        int[][] arr = new int [N][];

        // 해당 위치의 최소 값을 담을 dp 배열
        int[][] dp = new int [N][];

        // 2차원 배열의 길이를 다르게 하기위한 각 층의 길이 변수로 활용한 len
        int len = 1;

        // 배열 초기화
        for(int i =0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new int [len];
            dp[i] = new int [len];
            for(int j =0;j<len;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            len++;

        }

        // 제일 상단에 있는 값은 자신의 값이 최대 값이므로 초기화
        dp[0][0] = arr[0][0];
        for(int depth = 0;depth<N-1;depth++){ // 층을 나타낼 depth
            for(int index = 0;index<dp[depth].length;index++){ // 해당 층에서 이동하기위한 for문
                for(int nextIndex = index;nextIndex<=index+1;nextIndex++){ // 아래 층의 왼쪽과 아래쪽의 값을 변경하기위한 for문
                    if(arr[depth+1][nextIndex]+dp[depth][index]>dp[depth+1][nextIndex]){ // 이전에 있던 최대 값보다 새로운 값이 더 큰 경우
                        dp[depth+1][nextIndex] = arr[depth+1][nextIndex]+dp[depth][index]; // 값을 변경
                    }
                }
            }

        }

        // Arrays.sort 함수를 통해 제일 하단의 값을 정렬한 후 가장 큰 값을 출력
        Arrays.sort(dp[N-1]);
        bw.write(dp[N-1][N-1]+"");
        bw.flush();

    }
}
