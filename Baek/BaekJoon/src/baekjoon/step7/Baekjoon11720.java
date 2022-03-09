package baekjoon.step7;

import java.io.*;
import java.util.*;

public class Baekjoon11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		int sum = 0;
		for(int i = 0 ; i<size;i++) {
			sum+=s.charAt(i)-48;
		}
		bw.write(sum+"\n");
		bw.flush();
	}

}
