package baekjoon.step2;
import java.util.*;
public class Baekjoon2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		min +=time;
		hour+=min/60;
		min %=60;
		if(hour>=24) {
			hour %=24;
		}
		System.out.println(hour+" "+min);
		
		
	}

}
