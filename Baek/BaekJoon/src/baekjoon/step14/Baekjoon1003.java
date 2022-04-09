package baekjoon.step14;
import java.io.*;
import java.util.*;
public class Baekjoon1003 {
	
	public static int[] arr = new int [41];
	public static void fibo() {
		
		for(int i =2;i<=40;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
	}
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		arr[1] = 1;
		fibo();
		for(int i = 0 ; i<size;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0 ) {
				bw.write("1 0\n");
			}else {
				bw.write(arr[num-1]+" "+arr[num]+"\n");
			}
		}
		bw.flush();
		
		
	}

}
