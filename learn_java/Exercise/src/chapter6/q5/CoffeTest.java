package chapter6.q5;
import java.util.Scanner;
public class CoffeTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ù���� ����� �̸��� �������� �Է����ּ���");
		String name1 = sc.next();
		int money1 = sc.nextInt();
		Person lee = new Person(money1,name1);
		System.out.println("�ι��� ����� �̸��� �������� �Է����ּ���");
		String name2 = sc.next();
		int money2 = sc.nextInt();
		Person kim = new Person(money2,name2);
		
		Cafe star = new Cafe("��");
		Cafe bean = new Cafe("��");
		System.out.println(lee.getName()+"���� ���� ��������"+lee.getMoney()+"�� �Դϴ�.");
		System.out.println(kim.getName()+"���� ���� ��������"+kim.getMoney()+"�� �Դϴ�.");
		lee.takeCoffe(bean, 4500);
		kim.takeCoffe(star, 4000);
	}

}
