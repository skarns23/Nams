package baekjoon;
import java.util.*;
public class Baekjoon11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int [size][2];
		for(int i =0; i< size;i++)
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc. nextInt();
		}
		Arrays.sort(arr, (o1,o2)->    //Arrays.sort�� Compactor�� ���� �����Ǹ� ���� ���� Ǯ��, Compactor�� ���� ���� �� �ʿ�
		{
			if (o1[0]==o2[0])
				return o1[1] - o2[1];
			else
				return o1[0] - o2[0];
		});
		for (int i = 0 ; i< size; i++)
		{
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	
	}

}
