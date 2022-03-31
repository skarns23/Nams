package baekjoon.step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;
public class Baekjoon11651_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[][] arr = new int [size][2];
		StringTokenizer st;
		
		for(int i = 0; i<size;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0]  = Integer.parseInt(st.nextToken());
			arr[i][1]  = Integer.parseInt(st.nextToken());
			
		}
		// Arrays.sort
		Arrays.sort(arr, (a1,a2)->{
			if(a1[1]==a2[1]) {
				return a1[0]-a2[0];
			}
			else
				return a1[1]-a2[1];
				
		});
		
		for(int i = 0 ;i <size;i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.flush();
		bw.close();
		
		
		
	}

}
