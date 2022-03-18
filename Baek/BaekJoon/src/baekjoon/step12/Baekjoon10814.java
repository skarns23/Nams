package baekjoon.step12;
import java.io.*;
import java.util.*;

public class Baekjoon10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		String[][] arr = new String[size][2];
		for(int i = 0; i<size;i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = s[0];
			arr[i][1] = s[1];
		}
		Arrays.sort(arr,new Comparator<String[]>() { //���̰� ���� ��� ���� ������� �����ϴ� ���� ���̿� ���� ���ĸ� ���ָ� �˾Ƽ� �ȴ�.

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				
			}
			
		});

		for(int i = 0; i<size;i++) {
			bw.write(arr[i][0] +" "+arr[i][1]+"\n");
		}
		bw.flush();
		
	
		
	}
}
