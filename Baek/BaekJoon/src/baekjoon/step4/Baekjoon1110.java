package baekjoon.step4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class Baekjoon1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int value = Integer.parseInt(st.nextToken());
		int tmp = value;
		int sum = 0;
		int count = 0;
		do {
			count++;
			sum = tmp%10 + tmp/10;
			tmp = tmp %10*10 + sum%10;
		}while(value !=tmp);
		bw.write(count+"\n");
		bw.flush();
	}

}
