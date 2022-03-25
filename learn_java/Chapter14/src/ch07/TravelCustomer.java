package ch07;

public class TravelCustomer {

	public String name;
	public int age;
	public int cost;
	
	public TravelCustomer(String nm, int age) {
		this.name = nm;
		this.age = age;
		if(age >=15) {
			this.cost = 100;
		}
		else
			this.cost = 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "name : "+ name+" age : "+age+" price : "+cost;
	}
}
