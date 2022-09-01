package dp;

import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1149
// RGB거리 구하기 문제
public class N1149 {

    public static void main(String[] args) throws IOException {
        //입출력을 위한 초기설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //총 집의 수
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int [num][3]; // RGB 값을 담을 배열
        int[][] dp = new int[num][3]; // 각 경로의 최소 비용을 담을 dp 배열

        for(int i=0; i<num;i++){ // StringTokenizer를 활용한 arr배열 초기화
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //Top-bottom 형식으로 구현을 위한 dp배열 초기화
        for(int i =0 ;i<3;i++){
            dp[0][i] = arr[0][i];
        }
        int min = Integer.MAX_VALUE;


        for(int x = 1; x<num;x++) { // 각 x번째 집을 나타내기위한 for문
            for (int i = 0; i < 3; i++) { // RGB를 나타내기 위한 for문
                for (int j = 0; j < 3; j++) { //이전까지의 비용 중 최소 비용을 찾는 for문
                    if(i!=j &&min>dp[x-1][j]){ // 같은 색이 아닌 것 중 최소 비용을 min 변수에 삽입
                        min = dp[x-1][j];
                    }
                }
                dp[x][i] = min + arr[x][i]; // x,i위치에서의 최소 비용
                min = Integer.MAX_VALUE;
            }
        }
        
        // 마지막 집 중 최소 비용인 경우를 찾음
        int result = Math.min(Math.min(dp[num-1][0],dp[num-1][1]),dp[num-1][2]);
        bw.write(result+"");
        bw.flush();

    }
}

