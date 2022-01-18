package inheritance;

public class VipCustomer extends Customer{
	private double salePer;
	private int agentId;
	
	public VipCustomer()
	{
		grade = "VIP";
		per = 0.05;
		salePer = 0.1;
	}
	public int getAgetID()
	{
		return this.agentId;
	}
	
}
