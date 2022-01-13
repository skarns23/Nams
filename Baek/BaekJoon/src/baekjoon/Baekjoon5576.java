package baekjoon;
import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon5576 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int[] a =new int[10];
		int[] b= new int[10];
		insert(a,sc);
		insert(b,sc);
		Arrays.sort(a);
		Arrays.sort(b);
		int sum_a=0;
		int sum_b=0;
		for(int i=0;i<3;i++)
		{
			sum_a +=a[9-i];
			sum_b +=b[9-i];
		}
		System.out.println(sum_a);
		System.out.println(sum_b);
	}
	public static void insert(int[] arr,Scanner sc)
	{
		for(int i =0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

}
