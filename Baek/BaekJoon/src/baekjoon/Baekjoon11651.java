package baekjoon;
import java.util.*;
public class Baekjoon11651 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [][]arr = new int[num][2];
		for(int i =0; i<num;i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,(o1,o2)->{
			if(o1[1] == o2[1])
				return o1[0] -o2[0];
			else
				return o1[1] -o2[1];
		});
		for(int i =0 ; i< num; i ++)
			System.out.println(arr[i][0]+" "+arr[i][1]);
		
	}

}
