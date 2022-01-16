package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Baekjoon1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> input_list = new ArrayList<Integer>();
		int num = sc.nextInt();
		while(num>0)
		{
			
			input_list.add(num%10);
			num/=10;
		}
		Collections.sort(input_list);
		for (int i = input_list.size()-1 ; i>=0;i--)
		{
			System.out.print(input_list.get(i));
		}
		
	}

}
