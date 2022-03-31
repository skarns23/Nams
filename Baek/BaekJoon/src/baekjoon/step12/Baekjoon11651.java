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
		// Comparator는 인터페이스로 compare함수가 선언되어 있다. 
		// Arrays.sort에서도 이함수를 재정의 하여 사용하는게 가능한데 이를 통해서 이차원 배열에 대한 정렬을 진행한다
		// Comparator은 두 매개 변수 객체를 비교하기 위해 사용
		// Comparable은 자기 자신과 매개변수 객체를 비교하는데 사용
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
