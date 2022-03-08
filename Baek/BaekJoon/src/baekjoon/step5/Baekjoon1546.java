package baekjoon.step5;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int [size];
		for(int i = 0 ; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		double sum = 0;
		Arrays.sort(arr);
		for(int i = 0; i<size;i++) {
			sum+=(double)arr[i]/(double)arr[size-1]*100;
		}
		System.out.println((double)sum/size);
	}

}
