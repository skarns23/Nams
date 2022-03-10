package baekjoon.step7;
import java.io.*;
import java.util.*;
public class Baekjoon10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] arr = new int [26];
		for(int i= 0 ; i<arr.length;i++) {
			arr[i] = -1;
		}
		for(int i = 0 ; i <s.length();i++) {
			if(arr[s.charAt(i)-'a']==-1) {
				arr[s.charAt(i)-'a'] = i;
			}
			
		}
		for(int i :arr)
			bw.write(i+" ");
		bw.flush();
	}

}
