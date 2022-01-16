package baekjoon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Baekjoon1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] arr1 =  new int[size1];
		for(int i =0; i<size1;i++)
			arr1[i] = sc.nextInt();
		int size2 = sc.nextInt();
		int[] arr2 = new int [size2];
		for( int i=0;i<size2;i++)
			arr2[i] = sc.nextInt();
		Baekjoon1920 bk = new Baekjoon1920();
		Arrays.sort(arr1);
		for(int i :arr2)
		{
			System.out.println(bk.binary(arr1, i));
		}
	}
	public int binary(int[] arr, int key)
	{
		int high = arr.length-1;
		int low = 0;
		int mid = (high+low)/2;
		while(low<=high)
		{
			if(arr[mid]==key)
				return 1;
			if(key>arr[mid])
				{
				low=mid+1;
				mid = (low+high)/2;
				}
			if (key<arr[mid])
			{
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		return 0;
	}

}
