package baekjoon.step10;

import java.util.Scanner;

public class Baekjoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int level = 2;
		if(size ==0 ) {
			System.out.println(0);
		}
		else if(size == 1) {
			System.out.println(1);
		}
		else
		{
			System.out.println(solution(0,1,size,2));
		}
	}
	public static int solution(int fir,int sec, int point,int level) {
		int b = fir+sec;
		if(point == level) {
			return b;
		}
		
		return solution(sec,b,point,++level);
	}
	
}
