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
		System.out.println(Number+"�� �ý��� ž�°� ����"+count+"���̰�, ������"+money+"���Դϴ�.");
	}
	
}
