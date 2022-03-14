package baekjoon.step11;
import java.io.*;
import java.util.*;
public class Baekjoon2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int[] arr = new int [num];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<num;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int value = 0;
		for(int i =0; i<num-2;i++) {
			
			for(int j = i+1;j<num-1;j++)
			{
				for(int k =j+1;k<num;k++) {
					if(arr[i]+arr[j]+arr[k]<=max && value<arr[i]+arr[j]+arr[k]  )
						value = arr[i]+arr[j]+arr[k];
						
				}
			}
		}
		bw.write(value+"");
		bw.flush();
	}

}
