package baekjoon.step11;
import java.io.*;
public class Baekjoon2231 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int i = 0;
		for(; i<num;i++) {
			int sum = i;
			int k = i;
			while(k>0) {
				sum+=k%10;
				k /=10;
			}
			if(sum == num) {
				bw.write(i+"");
				bw.flush();
				return;
			}
		}
		bw.write(0+"");
		bw.flush();
		
	}

}
