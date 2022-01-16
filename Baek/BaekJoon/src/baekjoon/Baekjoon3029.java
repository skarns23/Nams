package baekjoon;
import java.util.Scanner;
public class Baekjoon3029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] str1 = input.split(":");
		String[] str2 = sc.nextLine().split(":");
		int diff=0;
		int[] arr = new int [3];
		int[] arr2 = new int[3];
		for(int i=0;i <3;i++)
		{
			arr[i] =Integer.parseInt(str1[i]);
			arr2[i] = Integer.parseInt(str2[i]);
		}
		int[] result = new int[3];
		if (arr2[2]>=arr[2])
		{
			result[2]=arr2[2]-arr[2];
			
			
		}
		else {
			result[2]=arr2[2]-arr[2]+60;
			if(arr2[1]!=0)
				arr2[1]--;
			else
			{
				arr2[0]--;
				if(arr2[0]<0)
					arr2[0]=23;
				arr2[1]+=59;
			}
		}
		if(arr2[1]>=arr[1])
		{
			result[1]=arr2[1]-arr[1];
		}
		else
		{
			result[1] =arr2[1]-arr[1]+60;
			arr2[0]--;
			if(arr2[0]==-1)
				arr2[0]=23;
		}
		diff=result[1]+result[2];
		if(arr2[0]>=arr[0])
			result[0] =arr2[0]-arr[0];
		else
			result[0] =arr2[0]-arr[0]+24;
		if(result[0]==0 &&diff==0)
			result[0]=24;
		System.out.printf("%02d:%02d:%02d", result[0],result[1],result[2]);
	}

}
