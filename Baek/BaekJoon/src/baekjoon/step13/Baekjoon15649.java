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
			if(!visited[i]) { // �湮���� ���� ����� ���  �湮�� ǥ�ø� ����� �߰��� �� dfs ����
				visited[i] = true; 
				arr[index] = i;
				dfs(index+1);
				visited[i] = false; // ��Ʈ��ŷ�� ���� �湮 ǥ�ø� ����
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m]; // ��� ���� ���� �迭
		visited = new boolean[n+1]; // �湮�ߴ� �� üũ�� �迭
		dfs(0);
		bw.flush();
	}
		
		
		

}
