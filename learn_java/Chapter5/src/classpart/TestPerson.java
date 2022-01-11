package classpart;

public class TestPerson {
	int age;
	String name;
	boolean marry;
	int child;
	
	public void showInfor()
	{
		String result;
		if (marry==true)
		{
			result = "±âÈ¥";
		}
		else
		{
			result = "¹ÌÈ¥";
		}
		System.out.println("³ªÀÌ" + age+"»ì ÀÌ¸§" +name+"°áÈ¥ ¿©ºÎ"+result + "ÀÚ³à ¼ö" + child);
	}
	
	public static void main(String[] args)
	{
		TestPerson p = new TestPerson();
		p.age = 40;
		p.name = "James";
		p.marry = true;
		p.child = 3;
		
		p.showInfor();
	}
}
