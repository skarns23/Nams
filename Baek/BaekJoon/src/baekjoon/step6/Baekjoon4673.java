package baekjoon.step6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Baekjoon4673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int [10001];
		for(int i = 1; i < 10001;i++) {
			solution(arr,i);
		}
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]==0) {
				bw.write(i+"\n");
			}
			
		}
		bw.flush();
	}
	public static void solution(int[] arr,int num) {
		int box = num;
		while(num != 0) {
			box = box +num%10;
			num/=10;
		}
		if(box<=10000 && arr[box]==0) {
			arr[box]++;
			solution(arr,box);
		}
	}

}
