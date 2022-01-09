package baekjoon;
import java.util.*;

public class Baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		int arr[] = new int [count];
		for(int i =0; i<count;i++)
			arr[i] = sc.nextInt();
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[count-1]);
		
		
	}

}
