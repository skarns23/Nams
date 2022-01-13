package baekjoon;
import java.util.*;
public class Baekjoon1371 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int[] alp = new int[26];
		int max =0;
		while (sc.hasNextLine()) // 다음줄이 존재하는지 여부를 boolean값으로 반환 함 EOF와 같은 역할
		{
			str =sc.nextLine();
			for (int i=0;i<str.length();i++)
			{
				if(str.charAt(i) !=' ')
				{
					alp[str.charAt(i)-97]++;
					if (max<alp[str.charAt(i)-97])
						max = alp[str.charAt(i)-97];
				}
			}
		}
		for(int i=0;i<26;i++)
		{
			if(alp[i]==max)
				System.out.print((char)(i+97));
		}
		sc.close();
	}

}
