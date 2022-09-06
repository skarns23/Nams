package dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11053
// 가장 긴 증가하는 부분 수열
// 증가하는 순서대로 부분 수여을 나타냈을때 최장 길이를 도출하는 문제
public class N11053 {

    public static void main(String[] args) throws IOException {
        // 입출력을 위한 초기설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배열의 길이 N
        int N = Integer.parseInt(br.readLine());

        // 배열의 값을 담을 arr과 인덱스 위치에서 최대 길이를 담을 dp 배열
        int[] arr = new int [N+1];
        int[] dp = new int [N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        //arr배열 초기화
        for(int i =1;i <=N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1~N 까지 탐색하는 반복문
        for(int i = 1; i<=N;i++){
            dp[i]= 1;
            // 1 ~ i 위치까지 탐색하여 현재 위치 값보다 작은데 배열의 길이가 더 큰 경우
            for(int j = 1;j<=N;j++){
                if(arr[i]>arr[j] &&dp[i]<dp[j]+1){
                    // 현재 위치 최대 길이를 dp[j]+1로 초기화
                    dp[i] =dp[j]+1;
                }
            }
        }
        Arrays.sort(dp);
        bw.write(dp[N]+"");
        bw.flush();
    }
}
