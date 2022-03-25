package ch07;
import java.util.*;
public class TravelTest {
	
	public static void main(String[] args) {
		
		TravelCustomer lee = new TravelCustomer("�̼���", 40);
		TravelCustomer kim = new TravelCustomer("������", 20);
		TravelCustomer hong = new TravelCustomer("ȫ�浿", 13);
		ArrayList<TravelCustomer> list = new ArrayList<TravelCustomer>();
		list.add(lee);
		list.add(kim);
		list.add(hong);
		System.out.println("�� ��� ���");
		list.stream().map(s->s.getName()).forEach((i)->System.out.println(i));
		
		System.out.println("�� ���� ��� ���");
		System.out.println(list.stream().mapToInt(s->s.getCost()).sum());
		
		
		System.out.println("20�� �̻��� �� ���� �� ���");
		list.stream().filter(c->c.getAge()>=20).map(s->s.getName()).sorted().forEach(c->System.out.println(c));
	}
}
