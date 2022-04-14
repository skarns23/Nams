package baekjoon.step15;

import java.util.Scanner;

public class Baekjoon11047 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int money = sc.nextInt();
		int count = 0; 
		int[] arr = new int [num];
		for(int i = 0; i<num;i++)
			arr[i] = sc.nextInt();
		while(money>0) {
			num--;
			if(num>=0&&arr[num]<=money ) {
				count += money/arr[num];
				money %=arr[num];
				
			}
		}
		System.out.println(count);
	}
}
