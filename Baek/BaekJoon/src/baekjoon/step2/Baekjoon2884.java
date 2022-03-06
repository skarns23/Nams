package baekjoon.step2;
import java.util.*;
public class Baekjoon2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b-45<0)
		{
			if (a==0)
				a=23;
			else
				a--;
			b+=15;
		}
		else
			b-=45;
		System.out.println(a+" "+b);
	}

}
