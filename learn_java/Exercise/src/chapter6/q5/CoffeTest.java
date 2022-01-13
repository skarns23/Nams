package chapter6.q5;
import java.util.Scanner;
public class CoffeTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("첫번쨰 사람의 이름과 소지금을 입력해주세요");
		String name1 = sc.next();
		int money1 = sc.nextInt();
		Person lee = new Person(money1,name1);
		System.out.println("두번쨰 사람의 이름과 소지금을 입력해주세요");
		String name2 = sc.next();
		int money2 = sc.nextInt();
		Person kim = new Person(money2,name2);
		
		Cafe star = new Cafe("별");
		Cafe bean = new Cafe("콩");
		System.out.println(lee.getName()+"님의 현재 소지금은"+lee.getMoney()+"원 입니다.");
		System.out.println(kim.getName()+"님의 현재 소지금은"+kim.getMoney()+"원 입니다.");
		lee.takeCoffe(bean, 4500);
		kim.takeCoffe(star, 4000);
	}

}
