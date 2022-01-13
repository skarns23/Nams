package baekjoon;
import java.util.*;
public class Baekjoon11718 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			if(str.isEmpty() ||str.length()>100)
				break;
			else
			{
				System.out.println(str);
			}
		}
	}
}