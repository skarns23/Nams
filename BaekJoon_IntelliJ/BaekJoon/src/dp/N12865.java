package dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12865
// 평범한 배낭
// 나눠지지 않는 물건들을 가치와 무게에 따라 가방에 담을 수 있는 최대 무게로 담을 경우 최대 가치를 출력하는 문제
public class N12865 {

    public static void main(String[] args) throws IOException {
        // 입출력 초기설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N과 K를 받기위함
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        // 각 무게에서 최대 값을 담을 dp 배열
        int[] dp = new int [K+1];
        // 무게와 가치를 담을 arr 배열
        int[][] arr = new int [N+1][2];
        StringTokenizer st;
        // arr 배열 초기화
        for(int i = 1 ;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // Bottom-Up 형식으로 구현 순차적으로 물건들에 대해 dp 배열 설정
        // 배낭에 담을 수 있는 무게일 경우 dp[최대 무게(j) - 자기 무게]의 최대 가치 값 + 자신의 가치 값
        // 그리고 이전에 설정된 가치 값에 대해 큰 값으로 초기화
        for(int i = 1;i<=N;i++){
            for(int j = K; j-arr[i][0]>=0;j--){
                dp[j] = Math.max(dp[j],dp[j-arr[i][0]]+arr[i][1]);
            }
        }
        bw.write(dp[K]+"");
        bw.flush();
    }
}
