package ch16;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopaAmericano();
		etiopiaCoffee.brewing();
		System.out.println();
		
		Coffee etiopiaLatte  = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		System.out.println();
		
		Coffee mocha = new Mocha(new Latte(new EtiopaAmericano()));
		mocha.brewing();
		System.out.println();
		
		Coffee keya = new WhippingCream(new Latte(new KeyaAmericano()));
		keya.brewing();
		System.out.println();
		}
}
