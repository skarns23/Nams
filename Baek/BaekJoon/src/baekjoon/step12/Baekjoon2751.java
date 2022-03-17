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
		//Arrays.sort(arr); Arrays.sort는  dual-pivot Quicksort 알고리즘  평균 시간복잡도 nlogn이나, 최악의 경우 n^2
		Collections.sort(list);
		//Collections.sort의 경우에는 병합정렬과 삽입정렬을 활용한 TimeSort이므로 시간복잡도에서 자유로움
		for(long i : list)
			bw.write(i+"\n");
		bw.flush();
	}
	
	

}
