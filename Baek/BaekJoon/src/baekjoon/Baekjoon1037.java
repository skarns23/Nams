package baekjoon;
import java.util.*;
public class Baekjoon1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int result;
		int[] arr = new int [size];
		if (size==1)
			result=size*size;
		else
		{
			for(int i=0;i<size;i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		Arrays.sort(arr);
		result =arr[0]*arr[arr.length-1];
		System.out.println(result);
	}

}
