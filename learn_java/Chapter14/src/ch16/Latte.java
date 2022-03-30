package ch16;

public class Latte extends Decorator {
	
	public Latte(Coffee coffee) {
		// ���� Ŭ������ Decorator�� default constructor�� �����Ƿ� �����ڸ� ����ؾ���
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}
	
}
