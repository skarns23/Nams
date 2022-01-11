package cooperation;

public class Taxi {

	int Number;
	String Name;
	int money;
	int count;
	
	public Taxi(int Number)
	{
		this.Number =Number;
	}
	public void takeTaxi(int money)
	{	
		this.money +=money;
		this.count++;
	
	}
	public void showInfor()
	{
		System.out.println(Number+"번 택시의 탑승객 수는"+count+"명이고, 수입은"+money+"원입니다.");
	}
	
}
