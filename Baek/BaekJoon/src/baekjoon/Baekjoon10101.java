package baekjoon;
import java.util.Scanner;

class Tri
{
	int[] arr;
	int sum;
	public Tri(int x, int y,int z)
	{
		this.arr = new int[] {x,y,z};
		this.sum = x+y+z;
	}
	public String solution(int same)
	{
		
		String str = "Error";
		if(same==3 &&arr[0]==60)
			str= "Equilateral";
		else if (same==1 &&this.sum==180)
			str= "Isosceles";
		else if (same==0 && this.sum==180)
			str= "Scalene";
		else if(this.sum!=180)
			str= "Error";
		
		return str;
		
	}
	public int same()
	{
		int count=0;
		for (int i=0;i<2;i++)
		{
			for(int j= i+1;j<3;j++)
			{
				if(this.arr[i]==this.arr[j])
					count++;
			}
		}
		return count;
	}
}
public class Baekjoon10101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tri tr = new Tri(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(tr.solution(tr.same()));
	}

}
