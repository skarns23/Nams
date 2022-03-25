package baekjoon.step13;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Baekjoon15650 {
	
	static int n;
	static int m;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static boolean[] visited;

	public static void dfs(int index) throws IOException {
		if(index == m) {
			for(int i :arr) {
				bw.write(i+" ");
			}
			bw.write("\n");
			return;
		}
		else {
		for(int i = 1; i<=n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = i;
				dfs(index+1);
				for(int j = i+1;j<=n;j++) //자신보다 큰 값들을 false로 처리하면 자신을 방문하지 않음 
					visited[j]=false;
				
				}
			}
	
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		visited = new boolean [n+1];
		dfs(0);
		bw.flush();
	}

}
