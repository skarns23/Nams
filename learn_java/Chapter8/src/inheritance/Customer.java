package inheritance;

public class Customer {

	protected int id;
	protected String name;
	protected String grade;
	int bonus;
	double per;
	
	public Customer(int id, String name)
	{
		this.id = id;
		this.name =name;
		this.grade = "Silver";
		this.per = 0.01;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}

	public int carBonus(int price)
	{
		this.bonus += price*this.per;
		return price;
	}
	public String showInfor()
	{
		return this.name + "님의 등급은 "+this.grade+"이고 보너스 포인트는 "+this.bonus+"입니다."; 
	}
}
