package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alp.length;i++)
		{
			alp[i]=ch;
			ch++;
		}
		for (int i = 0; i<alp.length;i++)
		{
			System.out.println(alp[i]+" "+(int)alp[i]);
		}
}
}