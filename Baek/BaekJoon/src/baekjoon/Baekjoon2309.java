//일곱 난쟁이의 키의 합은 100이다
package baekjoon;
import java.util.*;
public class Baekjoon2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [9];
		for(int i=0;i<9;i++)
			arr[i] =sc.nextInt();
		Arrays.sort(arr);
		Random rd = new Random();
		
		
		while(true)
		{
			int sum=0;
			int count = 0;
			int[] ch = new int [9];
			while(count<7)
			{
				int num = rd.nextInt(9);
				if(ch[num]==0)
				{
					ch[num]++;
					count++;
					sum+=arr[num];
				}
			}
			if(sum==100)
			{
				for(int i=0;i<9;i++)
				{
					if(ch[i]==1)
					{
						System.out.println(arr[i]);
					}
				}
				break;
			}
		}
		
	}

}
