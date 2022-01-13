package baekjoon;
import java.util.*;

public class Baekjoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for(int i=0;i<9;i++)
			arr[i]=sc.nextInt();
		int max_value = arr[0];
		int max_index = 0;
		for(int i=1;i<9;i++)
		{
			if(max_value<arr[i])
			{
				max_value = arr[i];
				max_index = i;
			}
		}
		System.out.println(max_value);
		System.out.println(max_index+1);
	}

}
