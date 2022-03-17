package baekjoon.step12;
import java.io.*;
public class Baekjoon10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int [10001]; // ī���� ���� ���� Ƚ���� �� �迭 
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<size;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1;i<10001;i++) {
			
			while(arr[i]>0) // arr[i]�� 0�� ��� ������ �� ���� �� 
			{
				bw.write(i+"\n");
				arr[i]--;
			}
		}
		bw.flush();
		
	}

}
