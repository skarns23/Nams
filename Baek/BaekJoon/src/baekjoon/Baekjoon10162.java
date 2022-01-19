package baekjoon;
import java.util.*;
public class Baekjoon10162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		if(size%10!=0)
			System.out.println("-1");
		else
		{
			int sec_60 = 6;
			int sec_10 = size/10;
			int sec_5m = 30;
			if((sec_10/sec_5m)>0)
			{
				sec_5m =sec_10/sec_5m;
				sec_10-=(sec_5m*30);
			}
			else
				sec_5m=0;
			if((sec_10/sec_60)>0)
			{
				sec_60=sec_10/sec_60;
				sec_10-=(sec_60*6);
			}
			else
				sec_60 =0;
			
			System.out.println(sec_5m+" "+sec_60+" "+sec_10);
		}
		
	}

}
