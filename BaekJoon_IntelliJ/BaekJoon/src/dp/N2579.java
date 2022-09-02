package dp;

import java.io.*;

// https://www.acmicpc.net/problem/2579
// 계단 오르기
// 해당 문제의 경우 연속 세칸이상 밟지 못한다는 제약 조건 어려웠음
public class N2579 {

    public static void main(String[] args) throws IOException {
        // 입출력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 계단의 수
        int N = Integer.parseInt(br.readLine());
        // 계단의 위치를 맞춰주기 위해 N+1의 크기로 설정
        int[] arr = new int [N+1];
        int[] dp  = new int [N+1];
        // 배열 초기화
        for(int i = 1;i<N+1;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        //bottom-up 형식으로 구현을 위한 dp배열 초기화
        dp[1] = arr[1];
        // 계단의 수가 2보다 큰 경우 2번 계단의 최대 값은 1+2번째 계단이므로 초기화
        if(N>=2){
            dp[2] = arr[1]+arr[2];
        }
        for(int i = 3 ;i<N+1;i++){ // 두칸 뒤에 있는 경우는 바로 비교하면 되며, 직전의 계단은 연속되지 않기 위해 세칸뒤의 최대 값과 더해서 해야함
            dp[i] = Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i];
        }
        bw.write(dp[N]+"");
        bw.flush();
    }
}
