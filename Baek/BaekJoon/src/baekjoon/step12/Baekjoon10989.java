package baekjoon.step12;
import java.io.*;
public class Baekjoon10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int [10001]; // 카운팅 정렬 값의 횟수를 셀 배열 
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<size;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1;i<10001;i++) {
			
			while(arr[i]>0) // arr[i]가 0인 경우 등장한 적 없는 수 
			{
				bw.write(i+"\n");
				arr[i]--;
			}
		}
		bw.flush();
		
	}

}
