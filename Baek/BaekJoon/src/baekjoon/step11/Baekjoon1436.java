package baekjoon.step11;
import java.io.*;
import java.util.*;
public class Baekjoon1436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = Integer.parseInt(br.readLine());
		System.out.println(solution(input));

		
	}
	
	public static int solution(int num) {
		int count =0;
		int k = 665;
		while(true) {
			String s = Integer.toString(k);
			if(s.contains("666"))
				count++;
			if(count==num)
				break;
			k++;
		}
		return k;
	}

}
