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
		Arrays.sort(arr,(v1,v2)->{
			if(v1[1] == v2[1]) {
				return v1[0] -v2[0];
			}
			else
				return v1[1] - v2[1];
		});
		for(int i = 0;i <size;i++)
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		bw.flush();
 	}

}
