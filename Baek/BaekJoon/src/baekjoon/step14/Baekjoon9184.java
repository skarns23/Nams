package baekjoon.step14;
import java.io.*;
import java.util.*;
public class Baekjoon9184 {
	
	static int[][][] result = new int [51][51][51];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int recursion(int a, int b,int c ) {
		if(a<=0 || b <=0 ||c <=0)
			return 1;
		if( a>20 || b >20 || c >20)
			return recursion(20,20,20);
		else if(result[a][b][c] !=0)
			return result[a][b][c];
		else if(a< b && b<c) {
			return result[a][b][c] = recursion(a,b,c-1) +recursion(a,b-1,c-1) - recursion(a,b-1,c);
		}
		else
		{
			return result[a][b][c] =recursion(a-1,b,c)+recursion(a-1,b-1,c)+recursion(a-1,b,c-1)-recursion(a-1,b-1,c-1);
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int a,b,c;
		while(true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			if(a==-1 &&b==-1 &&c== -1)
				break;
			String s = "w("+a+", "+b+", "+c+") = ";
			bw.write(s+recursion(a,b,c)+"\n");
		}
		bw.flush();
	}

}
