package dp;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1912
// DP 연속합 문제
public class N1912 {

    public static void main(String[] args) throws IOException {
        //입출력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 정수의 개수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N]; // 정수를 담을 배열
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N]; // 각 위치에서 최고 값을 담을 배열
        int max = dp[0] = arr[0]; // 0번째 위치는 이전의 숫자가 없으므로 자신이 최고값

        //Bottom-Top 방식으로 구현
        // 이전 까지 온 최대값과 현재 값을 더하는 것과 현재 위치의 값중 큰 것을 현재의 위치의 최대값으로 설정
        for(int i=1;i<N;i++){
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            if(max<dp[i]){ // 이후 그 값이 max값보다 크다면 max값 갱신
                max = dp[i];
            }
        }
        bw.write(max+"");
        bw.flush();
    }
}
