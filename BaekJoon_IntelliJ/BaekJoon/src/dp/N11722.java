package baek.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N11722 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		int[] dp = new int [N];
		Arrays.fill(dp, 1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i<N;i++) {
			for(int j =0;j<i;j++) {
				if(arr[i]<arr[j]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
		}
		Arrays.sort(dp);
		bw.write(dp[N-1]+"");
		bw.flush();
	}
}
