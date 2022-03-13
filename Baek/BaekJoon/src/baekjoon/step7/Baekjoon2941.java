package baekjoon.step7;
import java.io.*;
import java.util.*;
public class Baekjoon2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int count =0;
		for(int i =0; i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'c':
				if(i+1 <s.length() && (s.charAt(i+1)=='=' || s.charAt(i+1)=='-')) {
					count++;
					i++;
				}
				else
					count++;
				break;
			case 'd':
				if(i+1<s.length() &&s.charAt(i+1)=='-') {
					count++;
					i++;
				}
				else if(i+2<s.length() && s.charAt(i+1)=='z' &&s.charAt(i+2)=='=') {
					count++;
					i+=2;
				}
				else
					count++;
				break;
			case 'l':
				if(i+1<s.length() &&s.charAt(i+1)=='j') {
					count++;
					i++;
				}
				else
					count++;
				break;
			case 'n':
				if(i+1<s.length() &&s.charAt(i+1)=='j') {
					count++;
					i++;
				}
				else
					count++;
				break;
			case 's':
				if(i+1<s.length() &&s.charAt(i+1)=='=') {
					count++;
					i++;
				}
				else
					count++;
				break;
			case 'z':
				if(i+1<s.length() &&s.charAt(i+1)=='=') {
					count++;
					i++;
				}
				else
					count++;
				break;
			default:
				count++;
				break;
			}
		}
		bw.write(count+"\n");
		bw.flush();
	}

}
