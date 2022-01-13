package staticex;

public class Student3 {
	int st_id;
	private static int base_num = 10000;
	String st_name;
	int card_num;
	public Student3(String name)
	{
		this.st_name = name;
		base_num++;
		this.st_id = base_num;
		this.card_num = this.st_id+100;
	}
	
}
