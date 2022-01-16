package baekjoon;
import java.util.Scanner;
public class Baekjoon1032 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		String[] str = new String[size];
		for(int i = 0; i<size;i++)
		{
			str[i]  =sc.next();
		}
		char[] result = new char[str[0].length()];
		for( int i = 0 ; i<str[0].length();i++)
		{
			char c = str[0].charAt(i);
			for(int j=0; j<size;j++)
			{
				if(c!=str[j].charAt(i))
				{
					result[i]='?';
					break;
				}
				
				if(j==size-1)
					result[i]=c;
			}
			System.out.print(result[i]);
		}
		
	}

}
