package ifexample;

public class Switchcase {

	public static void main(String[] args) {
		
	
		for (int i = 2; i <10; i++)
		{
			if(i %2 ==1)
				continue;
			for (int k =1; k<10;k++)
			{
				
				System.out.println(i +"X" + k +"=" +i*k);
			}
		}
	}

}
