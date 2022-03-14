package baekjoon.step10;
import java.util.Scanner;

public class Baekjoon10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int size = sc.nextInt();
		long result = 1;
		System.out.println(solution(result,size));
		
	}
	
	public static long solution(long result, int size) {
		if(size <= 1) {
			return result;
		}
		
		result *=size;
		return solution(result,--size);
	}

}
