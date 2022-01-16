package baekjoon;
import java.util.*;
public class Baekjoon1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr =new String[size];
		for(int i =0; i <size;i++)
			arr[i] = sc.next();
		
		Arrays.sort(arr, new Comparator<String>() {
		@Override
		public int compare(String s1, String s2)
		{
			if (s1.length() ==s2.length())
				return s1.compareTo(s2); //compareTo ~~ 메소드는 둘을 비교하여 오름차순 정렬 해줌
			else
				return s1.length() - s2.length();
		}
		
		});
		System.out.println(arr[0]);
		
		for(int i = 1 ; i<size;i++)
		{	
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		}
}
}
