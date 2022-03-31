package baekjoon.step12;
import java.io.*;
import java.util.*;
public class Baekjoon11651 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int size= Integer.parseInt(br.readLine());
		
		int[][] arr = new int [size][2];
		
		for(int i =0 ; i<size;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		// Comparator�� �������̽��� compare�Լ��� ����Ǿ� �ִ�. 
		// Arrays.sort������ ���Լ��� ������ �Ͽ� ����ϴ°� �����ѵ� �̸� ���ؼ� ������ �迭�� ���� ������ �����Ѵ�
		// Comparator�� �� �Ű� ���� ��ü�� ���ϱ� ���� ���
		// Comparable�� �ڱ� �ڽŰ� �Ű����� ��ü�� ���ϴµ� ���
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1])
					return Integer.compare(o1[0], o2[0]);
				else 
					return Integer.compare(o1[1], o2[1]);
			}});
		
		
		for(int i = 0;i <size;i++)
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		bw.flush();
 	}

}
