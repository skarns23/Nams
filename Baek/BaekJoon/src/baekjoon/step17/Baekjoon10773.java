package baekjoon.step17;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int in;
		int sum = 0;
		for(int i = 0;i<size;i++) {
			in = sc.nextInt();
			if(in==0)
				stack.pop();
			else {
				stack.push(in);
				
			}
		}
		while(!stack.isEmpty()) {
			sum +=stack.pop();
		}
		System.out.println(sum);
	}

}
