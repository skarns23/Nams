package baekjoon.step12;
import java.io.*;
import java.util.*;
public class Baekjoon1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		
		String[] s = new String[size];
		for(int i = 0 ; i<size;i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() ==o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
			
		});
		
		for(int i = 0; i<size;i++) {
			if(i>0 && s[i].equals(s[i-1]))
				continue;
			else
			bw.write(s[i]+"\n");
		}
		bw.flush();
	}
}