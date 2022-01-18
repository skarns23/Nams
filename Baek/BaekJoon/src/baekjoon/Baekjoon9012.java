package baekjoon;
import java.util.*;
public class Baekjoon9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stk = new Stack<String>();
		int size =sc.nextInt();
		String[] result = new String[size];
		for(int i=0;i<size;i++)
		{
			String str = sc.next();
			for(int j =0;j<str.length();j++)
			{
				if(str.charAt(j)=='(')
				{
					stk.push("(");
				}
				else if(!stk.isEmpty())
				{
					if(str.charAt(j)==')' &&stk.peek()=="(")
						stk.pop();
				}
				else
				{
					stk.push(")");
				}
			}
			if(stk.size()==0)
				result[i]="YES";
			else
				result[i] ="NO";
			stk.clear();
		}
		for(String a :result)
			System.out.println(a);
	}
	
	

}


