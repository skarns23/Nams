package baekjoon.step3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Baekjoon11022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer  st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		
		for(int i =0; i<size;i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		bw.write(("Case #")+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");	
		}
		bw.flush();
	}

}
