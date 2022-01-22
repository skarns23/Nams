package inheritance;

public class VipCustomer extends Customer{
	private double salePer;
	private int agentId;
	
	public VipCustomer(int id, String name, int agetnId)
	{
		super(id,name);
		grade = "VIP";
		per = 0.05;
		salePer = 0.1;
		this.agentId = agetnId;
	}
	public int getAgetID()
	{
		return this.agentId;
	}
	public int carBonus(int price)
	{
		this.bonus += price*this.per;
		return price - (int)(price*salePer);
	}
}
