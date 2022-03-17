package baekjoon.step12;
import java.io.*;
import java.util.*;
import java.io.IOException;
public class Baekjoon2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<size;i++) {
			list.add(Integer.parseInt(br.readLine()));
			
		}
		//Arrays.sort(arr); Arrays.sort��  dual-pivot Quicksort �˰���  ��� �ð����⵵ nlogn�̳�, �־��� ��� n^2
		Collections.sort(list);
		//Collections.sort�� ��쿡�� �������İ� ���������� Ȱ���� TimeSort�̹Ƿ� �ð����⵵���� �����ο�
		for(long i : list)
			bw.write(i+"\n");
		bw.flush();
	}
	
	

}
