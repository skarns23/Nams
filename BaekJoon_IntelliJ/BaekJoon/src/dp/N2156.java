package dp;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

// https://www.acmicpc.net/problem/2156
// 포도주 시식
// 3개의 잔을 연속으로 먹지않고 최대한 많은 포도주를 먹는 경우의 수를 구하는 문제
public class N2156 {

    public static void main(String[] args) throws IOException {

        // 입출력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 배열의 크기 N
        int N = Integer.parseInt(br.readLine());
        // 배열의 값을 담을 arr
        int[] arr = new int[N+1];
        // 현재 위치에서 최대 길이를 담을 배열
        int[] dp = new int[N+1];
        // arr 배열 초기화
        for(int i=1;i<=N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(N==1){
            bw.write(arr[1]+"");
        }else if(N==2){
            bw.write((arr[1]+arr[2])+"");
        }else {
            // 현재 인덱스가 필수적으로 들어갈 필요가 없기때문에 이전 인덱스 및 1칸, 2칸 떨어진뒤에서 오는 경우에 대해 모두 조사
            dp[1] = arr[1];
            dp[2] = arr[1] + arr[2];
            for (int i = 3; i <= N; i++) {
                dp[i] = Math.max(dp[i-1],Math.max(dp[i - 2] + arr[i], arr[i - 1] + dp[i - 3] + arr[i]));
            }

            Arrays.sort(dp);
            bw.write(dp[N] + "");
        }
        bw.flush();
    }
}
