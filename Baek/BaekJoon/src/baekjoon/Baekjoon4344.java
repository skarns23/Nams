package baekjoon;
import java.util.*;
public class Baekjoon4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] result = new double[num];
		for (int i=0; i<num;i++)
		{
			int sum=0;
			int count=0;
			int[] arr = new int[sc.nextInt()];
			for (int j = 0;j<arr.length;j++)
				{
				arr[j] = sc.nextInt();
				sum +=arr[j];
				}
			result[i] = sum/arr.length;
			for (int j=0;j<arr.length;j++)
			{
				if(arr[j]>result[i])
					count++;
			}
			result[i] = (double)count/(double)arr.length*100;
		}
		for (int i =0; i<num;i++)
		{
			String temp = String.format("%.3f", result[i]);
			System.out.println(temp+"%");
		}
		
	}

}
