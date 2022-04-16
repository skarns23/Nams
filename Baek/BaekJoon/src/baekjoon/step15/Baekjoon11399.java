package baekjoon.step15;
import java.util.*;
import java.io.*;
public class Baekjoon11399 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st =  new StringTokenizer(br.readLine());
		int [] arr = new int [size];
		for(int i = 0 ; i<size;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int sum = arr[0];
		for(int i = 1 ; i <size;i++) {
			
			arr[i] = arr[i] +arr[i-1];
			sum += arr[i];
		}
		bw.write(sum+"\n");
		bw.flush();
		bw.close();
		
			
			
	}

}
