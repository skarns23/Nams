package baekjoon;
import java.util.*;
public class Baekjoon10814 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, String> input = new LinkedHashMap<>();
		for(int i =0; i<sc.nextInt();i++)
		{
			int id = sc.nextInt();
			String name = sc.next();
			input.put(id, name);
		}
		for(int i =0; i<input.size()-1;i++)
		{
		 
			for(int k=i+1;k<input.size();k++)
			{
				
			}
		}
	}
}
