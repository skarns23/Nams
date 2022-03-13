package baekjoon.step7;
import java.io.*;
import java.util.*;
public class Baekjoon1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int count = 0 ; 
		while(size-->0) {
			int[] arr = new int [26];
			String s = br.readLine();
			char fir = s.charAt(0);
			arr[fir-'a'] = 1;
			boolean result = true;
			for(int i =1; i<s.length();i++) {
				if(arr[s.charAt(i)-'a'] == 0 && s.charAt(i)!=fir) {
					arr[s.charAt(i)-'a'] = 1;
					fir = s.charAt(i);
				}
				else if(s.charAt(i)!=fir && arr[s.charAt(i)-'a']==1) {
					result = false;
					break;
				}
			}
			if(result)
				count++;
		}
		bw.write(count+"\n");
		bw.flush();
		
	}
	

}
