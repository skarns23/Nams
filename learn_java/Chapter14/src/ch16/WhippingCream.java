package ch16;

public class WhippingCream extends Decorator{

	Coffee coffee;
	
	public WhippingCream(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Whipping Cream ");
	}
}
