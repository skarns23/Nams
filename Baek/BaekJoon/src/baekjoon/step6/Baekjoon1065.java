package baekjoon.step6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int k = solution(max);
		bw.write(k+"\n");
		bw.flush();
	}
	
	public static int solution (int num) {
		int result = 0;
		int a,b,c;
		for(int i = 1; i<num+1;i++) {
			if(i<100) {
				result++;
			}
			else
			{
				a = i%10;
				b = i/10%10;
				c = i/100;
				if(c-b == b-a) {
					result++;
				}
			}
		}
		
	
		return result;
	}

}
