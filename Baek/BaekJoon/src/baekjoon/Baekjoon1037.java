package baekjoon;
import java.util.*;
public class Baekjoon1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i =0 ;i<size;i++) {
				int num = sc.nextInt();
				if(num>max)
					max = num;
				if(num<min)
					min = num;
			}
			System.out.println(max*min);
		
	}

}
