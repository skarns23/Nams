package baekjoon;
import java.util.*;
import java.math.*;
public class Baekjoon1271 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(); //10 ^1000�� ���� ū ���� �����⶧���� Biginteger�� ����ؾ��Ѵ�.
		BigInteger b = sc.nextBigInteger();
		sc.close();
		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}

}
