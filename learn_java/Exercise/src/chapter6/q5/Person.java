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
			System.out.println(this.getName()+"�Կ��� "+cafe.getName()+"ī�信�� �Ƹ޸�ī�븦 �Ⱦҽ��ϴ�.");
			this.money-=pay;
			}
			else
				System.out.println(this.getName() +"���� �������� "+(pay-this.money)+"�� �����մϴ�.");
			break;
		case Menu.LATTE:
			if((this.money -pay)>0)
			{	
			cafe.setIncmoe(pay);
			System.out.println(this.getName()+"�Կ��� "+cafe.getName()+"ī�信�� �󶼸� �Ⱦҽ��ϴ�.");
			}
			else
				System.out.println(this.getName() +"���� �������� "+(pay-this.money)+"�� �����մϴ�.");
			
		}
		System.out.println(cafe.getName()+"ī���� �� ������"+cafe.getIncome()+"�� �Դϴ�.");
	}
	
}
