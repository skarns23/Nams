package baekjoon.step13;

import java.util.Scanner;

public class Baekjoon14888 {
	
	static int N;
	static int [] arr ;
	static int [] func = new int [4];
	static int max_val = Integer.MIN_VALUE;
	static int min_val = Integer.MAX_VALUE;
	
	public static void solution(int num, int depth) {
		if(depth == N) {
			min_val = Math.min(num, min_val);
			max_val = Math.max(num, max_val); 
		}
		
		for(int i = 0 ; i<4;i++) {
			if(func[i] >0) {
				func[i]--;
				switch (i) {
				case 0:
					solution(num+arr[depth],depth+1);
					break;
				case 1:
					solution(num-arr[depth],depth+1);
					break;
				case 2:
					solution(num*arr[depth],depth+1);
					break;
				case 3:
					solution((int)num/arr[depth],depth+1);
					break;
				}
				func[i]++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int [N];
		for(int i = 0 ; i<N;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i<4;i++) {
			func[i] = sc.nextInt();
		}
		solution(arr[0],1);
		System.out.println(max_val);
		System.out.println(min_val);
	}

}
