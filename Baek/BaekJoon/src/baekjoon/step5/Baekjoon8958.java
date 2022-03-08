package baekjoon.step5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int[] result = new int [size];
		for(int i = 0; i<size;i++) {
			int sum = 0;
			int point =1;
			String s =  br.readLine();
			for(int j = 0; j<s.length();j++) {
				if(s.charAt(j)=='O') {
					sum +=point;
					point++;
				}
				else
					point = 1;
			}
			result[i] = sum;
		}
		for(int i : result)
			System.out.println(i);
	}

}
