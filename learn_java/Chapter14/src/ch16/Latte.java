package ch16;

public class Latte extends Decorator {
	
	public Latte(Coffee coffee) {
		// 상위 클래스인 Decorator에 default constructor가 없으므로 생성자를 명시해야함
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}
	
}
