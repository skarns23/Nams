package baekjoon;
import java.util.Scanner;
public class Baekjoon2914 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		a =	sc.nextInt();
		b = sc.nextInt();
		
		if(a==1)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println(a*(b-1)+1);
		}
	}

}
