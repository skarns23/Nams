package baekjoon;
import java.util.*;
public class Baekjoon13297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String tmp;
		int[] arr= new int[size];
		for(int i = 0;i <size;i++)
		{
			tmp = sc.next();
			arr[i] = tmp.length();
		}
		for(int i :arr)
			System.out.println(i);
	}

}
