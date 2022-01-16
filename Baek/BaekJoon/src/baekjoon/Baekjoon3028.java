package baekjoon;
import java.util.Scanner;
public class Baekjoon3028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int now = 1;
		String input = sc.next();
		
		for (int i = 0 ; i<input.length();i++)
		{
			char k = input.charAt(i);
			if(k =='A')
				{
				if(now==1)
					now =2;
				else if(now==2)
					now=1;
				}
			else if(k =='B')
			{
				if (now==2)
					now =3;
				else if(now==3)
					now =2;
			}
			else if(k =='C')
			{
				if(now ==3)
					now =1;
				else if(now ==1)
					now =3;
			}
		}
		System.out.println(now);
		}
		
	}

