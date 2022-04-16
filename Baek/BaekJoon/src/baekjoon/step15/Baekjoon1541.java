package baekjoon.step15;

import java.util.Scanner;

public class Baekjoon1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		String[] str = s.split("-|\\+");
		for(String k : str)
			System.out.println(k);
	}

}
