package baekjoon;
import java.util.*;
class Sort
{
	public void sorting(int[] arr)
	{
		for (int i = 0 ; i<3;i++)
		{
			int temp = arr[i];
			int min_index = i;
			for (int j = i+1;j<3;j++)
			{
				if(temp >arr[j])
				{
					temp = arr[j];
					min_index = j;
							
				}
				}
			if (i != min_index)
			{
				arr[min_index] = arr[i];
				arr[i] =temp;
				
			}
			System.out.print(arr[i]+" ");
		}
	}
}
public class Baekjoon2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [3];
		for (int i =0; i<3;i++)
			arr[i]=sc.nextInt();
		Sort srt = new Sort();
		srt.sorting(arr);
		
	}

}
