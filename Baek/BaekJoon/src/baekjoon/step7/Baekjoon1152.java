package baekjoon.step7;
import java.io.*;
public class Baekjoon1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().toLowerCase();
		int count = 0;
		for(int i = 0 ; i<s.length();i++) {
			if(s.charAt(i)==' ' &&i !=0) {
				if(s.charAt(i-1)>='a' &&s.charAt(i-1)<='z')
					count++;
			}
			if(s.charAt(i)>='a' &&s.charAt(i)<='z' &&i==s.length()-1) {
				count++;
			}
		}
		bw.write(count+"\n");
		bw.flush();
	}

}
