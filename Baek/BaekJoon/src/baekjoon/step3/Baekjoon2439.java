package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon2439 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		String s = "*";
		for(int i =1;i <size+1;i++) {
			for(int j = size;j>i;j--) {
				bw.write(" ");
			}
			bw.write(s+"\n");
			s+="*";
		}
		bw.flush();
	}

}
