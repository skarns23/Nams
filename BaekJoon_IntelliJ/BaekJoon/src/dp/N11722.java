package baek.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11722
// 가장 긴 감소하는 부분 수열 문제
// 해당 문제의 경우 가장 긴 증가하는 부분 수열 문제 해결법을 활용하여 해결 
public class N11722 {
	public static void main(String[] args) throws Exception {
		// 입출력을 위한 설정 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 수열의 길이 값 할당 
		int N = Integer.parseInt(br.readLine());
		
		// 수열의 값을 담을 arr 배열과 각 인덱스에서 갖는 감소하는 부분 수열의 길이를 담을 dp 배열 
		int[] arr = new int [N];
		int[] dp = new int [N];
		// 모든 감소하는 부분 수열의 최소 길이는 1 (자기자신)이므로 초기화
		Arrays.fill(dp, 1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		// StringTokenizer를 활용한 arr 배열 초기화
		for(int i = 0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 전체 인덱스를 도는 for문 기준으로 사용될 인덱스 지정 
		for(int i = 0 ; i<N;i++) {
			// i (기준 인덱스)의 전에 있는 값을 탐색할 for문
			// 해당 반복문의 경우 비교 인덱스의 값이 기준 인덱스의 값보다 큰 경우 수열의 길이를 비교하여 저장
			for(int j =0;j<i;j++) {
				if(arr[i]<arr[j]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
		}
		// 수열의 최대 길이를 찾기위해 sort 진행 
		Arrays.sort(dp);
		bw.write(dp[N-1]+"");
		bw.flush();
	}
}
