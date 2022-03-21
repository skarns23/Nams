package baekjoon.step14;
import java.io.*;
import java.util.*;
public class Baekjoon15652 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;
	static int n;
	static int m;
	
	public static void dfs(int index,int level) throws IOException{
		if(m==index) {
			for(int i:arr) {
				bw.write(i+" ");
			}
			bw.write("\n");
			return ;
		}
		for(int i =level ;i<=n;i++) {
			arr[index] = i;
			dfs(index+1,i);
		}
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int [m];
		dfs(0,1);
		bw.flush();
	}

}
