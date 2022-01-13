package chapter6.q5;

public class Cafe {
	private String cafe_name;
	private int income;
	public Cafe(String name)
	{
		this.cafe_name = name;
	}
	public int getIncome()
	{
		return this.income;
	}
	public void setIncmoe(int money)
	{
		this.income+=money;
	}
	public String getName()
	{
		return this.cafe_name;
	}
}
