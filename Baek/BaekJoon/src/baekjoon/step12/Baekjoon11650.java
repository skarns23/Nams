package baekjoon.step12;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[][] arr = new int [size][2];
		StringTokenizer st;
		for(int i = 0;i <size;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, (v1,v2)->{ //Compartor 재정의를 통해 2차원 배열 정렬
			if(v1[0] == v2[0]) {
				return v1[1] -v2[1];
				}
			else
			{
				return v1[0] - v2[0];
			}
		
		
		});
		for(int i =0;i <size;i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.flush();
	
	}

}
