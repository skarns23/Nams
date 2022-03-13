package baekjoon.step7;
import java.io.*;
import java.util.*;
import java.io.IOException;
public class Baekjoon5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int count = 0 ;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)>='A' &&s.charAt(i)<='C' ) {
				count +=2;
			}
			else if(s.charAt(i)<='F') {
				count+=3;
			}
			else if(s.charAt(i)<='I')
				count+=4;
			else if(s.charAt(i)<='L')
				count+=5;
			else if(s.charAt(i)<='O')
				count+=6;
			else if(s.charAt(i)<='S')
				count+=7;
			
			else if(s.charAt(i)<='V')
				count+=8;
			
			else if(s.charAt(i)<='Z')
				count+=9;
			else 
				count+=1;
			count+=1;
			
		}
		bw.write(count+"\n");
		bw.flush();
		
	}

}
