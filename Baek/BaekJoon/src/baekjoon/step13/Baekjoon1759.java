package baekjoon.step13;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Baekjoon1759 {

	static String[] str;
	static int L;
	static int C;
	static String[] result;
	static boolean flas = false;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void dfs(int index, int depth) throws IOException {
		if(depth==L) {
			String s = String.join("", result);
			if(s.contains("a") ||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
				int count = 0 ; 
				for(int i =0  ; i<s.length();i++) {
					if((s.charAt(i)!='a') &&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
						count++;
				}
				if(count>=2)
					bw.write(s+"\n");
			}
			return ;
		}
		for(int i=  index ; i<C;i++) {
			result[depth] = str[i];
			
			dfs(i+1,depth+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		str = br.readLine().split(" ");
		
		Arrays.sort(str);
		result = new String [L];
		dfs(0,0);
		bw.flush();
	}

}
