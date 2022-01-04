package baekjoon;
import java.util.*;
public class Beakjoon3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for (int i = 0 ; i<6;i++)
		{
			arr[i] = sc.nextInt();
		}
		int cut[] = new int[] {1,1,2,2,2,8};
		for (int i = 0; i < 6; i++)
			System.out.print(cut[i]-arr[i]+" ");
	}

}
