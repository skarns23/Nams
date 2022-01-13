package baekjoon;
import java.util.*;
public class Baekjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr =new int [10];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a*b*c;
		while (result>0)
		{
			arr[result%10]++;
			result/=10;
		}
		for (int i=0;i<10;i++)
			System.out.println(arr[i]);
	}

}
