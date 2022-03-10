package baekjoon.step7;
import java.io.*;
import java.util.*;

public class Baekjoon1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr =new int [26];
		String s = br.readLine().toUpperCase();
		for(int i = 0 ; i<s.length();i++) {
			arr[s.charAt(i)-'A']++;
		}
		int max = 0 ;
		int index = 0;
		boolean result = true;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;
				result = true;
			}
			else if (arr[i]==max) {
				result = false;
			}
		}
		if(result == true) {
			bw.write((index+'A'));
		}
		else
			bw.write("?");
		bw.flush();
	}

}
