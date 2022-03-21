package baekjoon.step14;
import java.io.*;
import java.util.*;
public class Baekjoon15651 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static int n;
	static int m;
	
	public static void dfs(int index) throws IOException{
		if(m==index) {
			for(int i:arr) {
				bw.write(i+" ");
			}
			bw.write("\n");
			return ;
		}
		for(int i =1 ;i<=n;i++) {
			arr[index] = i;
			dfs(index+1);
		}
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(0);
		bw.flush();
	}

}
