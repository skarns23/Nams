package baekjoon.step8;

import java.util.Scanner;

public class Baekjoon2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		int input  = sc.nextInt();
		
		int count = 0;
		int num = 1;
		while( num + 6*count <input) {
			if(input ==1) {
				System.out.println(++count);
				break;
			}
			num  = num +6*count;
			count++;
		}
		System.out.println(++count);
	}

}
