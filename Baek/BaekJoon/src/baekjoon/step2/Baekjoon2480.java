package baekjoon.step2;
import java.util.*;
public class Baekjoon2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		int[] result = new int[7];
		int max = 0;
		int index = 0;
		for(int i =0;i <3;i++) {
			int v= sc.nextInt();
			result[v]++;
		}
		
		for(int i = 1 ; i<result.length;i++ ) {
			if(max<=result[i]) {
				index = i;
				max = result[i];
			}
		}
		int ans=  0;
		switch (max) {
		case 3:
			ans = 10000+(index)*1000;
			break;
		case 2:
			ans = 1000+(index)*100;
			break;
		case 1:
			ans = index *100;
			break;
		}
		System.out.println(ans);
	}

}
