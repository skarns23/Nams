package baekjoon.step15;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1931 {
	
	public static int[][] arr; 
	public static int num;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		arr = new int [num][2];
		for(int i = 0 ; i<num;i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,(o1,o2)->{
			if(o1[1] ==o2[1])
				return o1[0]-o2[0];
			return o1[1] - o2[1];
		});
		/*
		 * for(int i = 0;i<num;i++) System.out.println(arr[i][0] +" "+arr[i][1]);
		 */
		int count = 1;
		int use_index = 0;
		for(int i = 1 ; i<num;i++) {
			if(arr[use_index][1]>arr[i][0])
				continue;
			count++;
			use_index = i;
			/*
			 * if(arr[use_index][1] ==arr[use_index][0]) count++;
			 */
		}
		System.out.println(count);
		
	
	}

}
