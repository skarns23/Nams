package baekjoon;
import java.util.Scanner;
import java.math.BigInteger;
public class Baekjoon2935 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		String b = sc.next();
		char d = b.charAt(0);
		BigInteger c = sc.nextBigInteger();
		if (d=='+')
			System.out.print(a.add(c));
		else
			System.out.print(a.multiply(c));
	}

}
