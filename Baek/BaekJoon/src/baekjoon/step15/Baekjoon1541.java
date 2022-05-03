package baekjoon.step15;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("-"); // -단위로 나눈뒤 다 더하고 처음 값에서 나머지를 다 뻄
		ArrayList<Integer> Ilist = new ArrayList<Integer>();
		for(int i = 0;i<str.length;i++) {
			String[] c = str[i].split("\\+");
			int sum = 0 ; 
			for(int k =0; k<c.length;k++) {
				sum += Integer.parseInt(c[k]);
			}
			Ilist.add(sum);
		}
		int result = Ilist.remove(0);
		for(int i :Ilist) {
			result -=i;
		}
		System.out.println(result);
	}

}
