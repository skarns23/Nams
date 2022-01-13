package cooperation;

public class Student {


	public String name;
	public int money;
	
	public Student(String name,int money)
	{
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus)
	{
		bus.take(1000);
		this.money -=1000;
	}
	public void takeSub(Subway sub)
	{
		sub.takeSub(1500);
		this.money-=1500;
	}
	public void takeTaxi(Taxi tax)
	{
		tax.takeTaxi(10000);
		this.money-=10000;
	}
	public void showInfor()
	{
		System.out.println(name +"´ÔÀÇ ³²Àº µ·Àº"+this.money+"¿ø ÀÔ´Ï´Ù.");
	}
}

