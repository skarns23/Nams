package baekjoon;
import java.util.*;
public class Baekjoon1212 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int result = Integer.parseUnsignedInt(a,8);
		String a2 = Integer.toBinaryString(result);
		System.out.println(a2);
		sc.close();
	}
}
