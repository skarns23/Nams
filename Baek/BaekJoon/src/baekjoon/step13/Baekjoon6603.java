package baekjoon.step13;
import java.io.*;
import java.util.*;
public class Baekjoon6603 {
	static int[] arr;
	static int N;
	static int[] result = new int [6];
	static BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void dfs(int index,int depth) throws IOException {
		if(depth == 6) {
			for(int i :result)
				bw.write(i+" ");
			bw.write("\n");
			return ;
		}
		for(int i =index; i<N;i++) {
			result[depth] = arr[i];
			dfs(i+1,depth+1);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if(N == 0)
				break;
			arr = new int[N];
			for(int i = 0; i<N;i++)
				arr[i] = Integer.parseInt(st.nextToken());
			dfs(0,0);
			bw.write("\n");
			
		}
		bw.flush();
		bw.close();
	}

}
