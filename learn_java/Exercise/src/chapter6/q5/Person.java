package chapter6.q5;

public class Person {
	private int money;
	private String name;
	public Person(int money,String name)
	{
		this.money = money;
		this.name = name;
	}
	public int getMoney()
	{
		return this.money;
	}
	public String getName()
	{
		return this.name;
	}
	public void takeCoffe(Cafe cafe,int pay)
	{
		switch (pay)
		{
		case Menu.AMERICANO:
			if((this.money -pay)>0)
			{	
			cafe.setIncmoe(pay);	
			System.out.println(this.getName()+"님에게 "+cafe.getName()+"카페에서 아메리카노를 팔았습니다.");
			this.money-=pay;
			}
			else
				System.out.println(this.getName() +"님의 소지금이 "+(pay-this.money)+"원 부족합니다.");
			break;
		case Menu.LATTE:
			if((this.money -pay)>0)
			{	
			cafe.setIncmoe(pay);
			System.out.println(this.getName()+"님에게 "+cafe.getName()+"카페에서 라떼를 팔았습니다.");
			}
			else
				System.out.println(this.getName() +"님의 소지금이 "+(pay-this.money)+"원 부족합니다.");
			
		}
		System.out.println(cafe.getName()+"카페의 총 수입은"+cafe.getIncome()+"원 입니다.");
	}
	
}
