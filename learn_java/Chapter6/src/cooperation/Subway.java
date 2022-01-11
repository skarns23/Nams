package cooperation;

public class Subway {
	String subNumber;
	int money;
	int passengerCount;
	
	
	public Subway(String subNumber)
	{
		this.subNumber = subNumber;
	}
	public void takeSub(int money)
	{
		this.money +=money;
		this.passengerCount++;
	}
	public void showInfor()
	{
		System.out.println(this.subNumber + "의 승객은"+this.passengerCount+"명이고, 수입은"+this.money+"원입니다.");
	}
}
