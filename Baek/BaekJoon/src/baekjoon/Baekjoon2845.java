package baekjoon;
import java.util.*;
public class Baekjoon2845 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c[] = new int[5];
		int result[] = new int[5];
		for (int i = 0 ; i < 5; i++)
		{
			c[i] = sc.nextInt();
			result[i] = c[i]-(a*b);
		}
		for (int i = 0 ; i<5; i++)
			System.out.print(result[i]+" ");
	}

}
