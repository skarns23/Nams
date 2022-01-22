package inheritance;

public class GoldCustomer extends Customer {
	
	double salePer;
	
	public GoldCustomer(int id, String name)
	{
		super(id, name);
		this.grade = "GOLD";
		per = 0.02;
		salePer = 0.1;
	}
	@Override
	public int carBonus(int price) {
		this.bonus += price*this.per;
		return price - (int)(price*salePer);
	}
		
}
