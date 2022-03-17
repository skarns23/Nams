package baekjoon.step12;
import java.io.*;
import java.util.*;

public class Baekjoon1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[] arr = new int [s.length()];
		for(int i = 0 ; i<s.length();i++) {
			arr[i] =s.charAt(i)-'0'; // �ش� ������� char -> int�� �ٲٴ� ��İ�
			// Character Ŭ������ getNumbericValue �޼ҵ带 ���ؼ��� ����
		}
		Arrays.sort(arr);
		for(int i =s.length()-1;i>=0;i--) {
			bw.write(arr[i]+"");
		}
		
		bw.flush();
	}

}
