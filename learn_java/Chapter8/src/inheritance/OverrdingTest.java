package inheritance;
import java.util.*;
public class OverrdingTest {

	public static void main(String[] args) {
		ArrayList<Customer> cs = new ArrayList<>();
		Customer lee = new Customer(10010,"이순신");
		Customer kim = new Customer(10020,"신사임당");
		Customer park = new GoldCustomer(10030,"김유신");
		Customer nam = new GoldCustomer(10040,"아무개");
		Customer shin = new VipCustomer(10050,"이이",100);
		cs.add(lee);
		cs.add(kim);
		cs.add(park);
		cs.add(nam);
		cs.add(shin);
		for(Customer c : cs)
			System.out.println(c.showInfor());
		int price =10000;
		System.out.println("=====할인율 및 보너스 계산");
		for(Customer c : cs)
		{
			int cost = c.carBonus(price);
			System.out.println(c.getName()+"님의 요금은 "+cost+"원 이고 보너스 포인트는"+c.getBonus()+"점 입니다.");
		}
		
	}

}
