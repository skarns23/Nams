package baekjoon.step3;

import java.util.Scanner;

public class Baekjoon8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		for(int i = 1; i <n+1;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
