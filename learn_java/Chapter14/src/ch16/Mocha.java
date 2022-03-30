package ch16;

public class Mocha extends Decorator {
	
	Coffee coffee;
	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha syrup ");
	}
}
