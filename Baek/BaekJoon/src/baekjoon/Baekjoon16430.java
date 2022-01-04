package baekjoon;
import java.util.*;
public class Baekjoon16430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b-a;
		for (int i = 0 ; i <3;i++)
		{
			if (c%2==0 && b%2==0)
			{
				c/=2;
				b/=2;
			}
			else if (c%3==0 && b%3==0)
			{
				c/=3;
				b/=3;
			}
		}
		System.out.print(c+" ");
		System.out.print(b);
		sc.close();
	}

}
