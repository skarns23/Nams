package baekjoon.step8;

import java.util.Scanner;

public class Baekjoon1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int result = 0;
		int count = 0;
		if(b>=c) {
			System.out.println("-1");
		}
		else if(c-b ==1) {
			System.out.println(a+1);
		}
		else {
		while(result<=a) {
			result +=c-b;
			count++;
		}
		System.out.println(count);
		}
		
	}

}
