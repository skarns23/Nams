package dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/11054
// 가장 긴 바이토닉 부분 수열
// 바이토닉 수열이란 현재 인덱스의 값을 기준으로 좌측은 오름차순, 우측은 내림차순인 수열이다.
public class N11054 {

    public static void main(String[] args) throws IOException {
        // 입력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배열의 길이
        int N = Integer.parseInt(br.readLine());

        // 값을 담을 arr 배열
        int[] arr = new int [N];
        //현재 인덱스 기준 좌측으로 가장 긴 작은 수열의 길이를 담을 dp 배열
        int[] dp = new int [N];
        // 현재 인덱스 기준 우측으로 가장 긴 작은 수열의 길이를 담을 dp 배열
        int[] dp2 = new int [N];
        StringTokenizer st  =new StringTokenizer(br.readLine());
        // arr 배열 값 초기화
        for(int i = 0 ;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 현재 인덱스에서 증가하는 부분 수열의 최대 길이를 구하는 반복문
        for(int i=0;i<N;i++){ // 0~N-1
            dp[i] = 1;
            for(int j=0;j<i;j++){ // 0~i 기준 인덱스까지
                if(arr[i]>arr[j]&&dp[i]<dp[j]+1){// 현재 인덱스의 값보다 작은데 증가하는 부분수열의 길이가 긴 경우
                    dp[i] = dp[j]+1;
                }
            }


        }
        // 현재 인덱스에서 작아지는 부분 수열의 최대 길이를 구하는 반복문
        for(int i =N-1;i>=0;i--){ // N-1 ~ 0
            dp2[i] = 1;
            for(int j =i;j<N;j++){ // i ~ N-1 기준 인덱스 우측 탐색
                if(arr[i]>arr[j]&&dp2[i]<dp2[j]+1){ //기준 인덱스의 값보다 작은데 부분 수열의 길이가 긴 경우
                    dp2[i] = dp2[j]+1;
                }
            }
        }
        int max =0;
        for(int i =0;i<N;i++){
            max = Math.max(dp[i]+dp2[i]-1,max);
        }

        bw.write(max+"");
        bw.flush();
    }
}
