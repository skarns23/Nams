package baekjoon.step13;
import java.io.*;
import java.util.*;
public class Baekjoon14889 {
	
	static int[][] S;
	static int N;
	static int [] star;
	static int [] link;
	static int min_val = Integer.MAX_VALUE;
	public static void dfs(int start, int depth) {
		if(depth == N/2) {
			int k = 0;
			int inx = 0;
			for(int i =0; i<N;i++) {
				if(k<N/2&&star[k]==i ) {
					k++;
					continue;
				}
				else
				{
					link[inx] = i;
					inx++;
				}
			}
			int sum_star = 0;
			int sum_link = 0;
			for(int i = 0 ; i<N/2-1;i++) {
				for(int j =i+1;j<N/2;j++) {
					sum_star+=S[star[i]][star[j]]+S[star[j]][star[i]];
				}
			}
			for(int i = 0 ; i<N/2-1;i++) {
				for(int j =i+1;j<N/2;j++) {
					sum_link+=S[link[i]][link[j]]+S[link[j]][link[i]];
				}
			}
			min_val = Math.min(min_val, Math.abs(sum_star-sum_link));
			return ;
		}
		for(int i =start; i<N;i++) {
			star[depth] = i;
			dfs(i+1,depth+1);
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		S = new int [N][N];
		for(int i =0; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N;j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		link = new int [N/2];
		star = new int [N/2];
		dfs(0,0);
		System.out.println(min_val);
	}
}
