package baekjoon.step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i< size; i++) {
			int x = sc.nextInt();
			int y= sc.nextInt();
			list.add(x+y);
		}
		for(int k :list) {
			System.out.println(k);
		}
	}
}
