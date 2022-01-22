package inheritance;
import java.util.*;
public class OverrdingTest {

	public static void main(String[] args) {
		ArrayList<Customer> cs = new ArrayList<>();
		Customer lee = new Customer(10010,"�̼���");
		Customer kim = new Customer(10020,"�Ż��Ӵ�");
		Customer park = new GoldCustomer(10030,"������");
		Customer nam = new GoldCustomer(10040,"�ƹ���");
		Customer shin = new VipCustomer(10050,"����",100);
		cs.add(lee);
		cs.add(kim);
		cs.add(park);
		cs.add(nam);
		cs.add(shin);
		for(Customer c : cs)
			System.out.println(c.showInfor());
		int price =10000;
		System.out.println("=====������ �� ���ʽ� ���");
		for(Customer c : cs)
		{
			int cost = c.carBonus(price);
			System.out.println(c.getName()+"���� ����� "+cost+"�� �̰� ���ʽ� ����Ʈ��"+c.getBonus()+"�� �Դϴ�.");
		}
		
	}

}
