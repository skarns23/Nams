package baekjoon.step13;
import java.io.*;
import java.util.*;
public class Baekjoon15649 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static boolean[] visited;
	static int n,m;
	
	public static void dfs(int index) throws IOException {
		if(index ==m ) {
			for(int i: arr) {
				bw.write(i+" ");
			}
			bw.write("\n");
			return ;
		}
		for(int i =1; i<=n;i++) {
			if(!visited[i]) { // 방문하지 않은 노드의 경우  방문한 표시를 남기고 추가한 뒤 dfs 실행
				visited[i] = true; 
				arr[index] = i;
				dfs(index+1);
				visited[i] = false; // 백트래킹을 위해 방문 표시를 삭제
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m]; // 결과 값을 담을 배열
		visited = new boolean[n+1]; // 방문했는 지 체크할 배열
		dfs(0);
		bw.flush();
	}
		
		
		

}
