package ch07;
import java.util.*;
public class TravelTest {
	
	public static void main(String[] args) {
		
		TravelCustomer lee = new TravelCustomer("이순신", 40);
		TravelCustomer kim = new TravelCustomer("김유신", 20);
		TravelCustomer hong = new TravelCustomer("홍길동", 13);
		ArrayList<TravelCustomer> list = new ArrayList<TravelCustomer>();
		list.add(lee);
		list.add(kim);
		list.add(hong);
		System.out.println("고객 명단 출력");
		list.stream().map(s->s.getName()).forEach((i)->System.out.println(i));
		
		System.out.println("총 여행 비용 출력");
		System.out.println(list.stream().mapToInt(s->s.getCost()).sum());
		
		
		System.out.println("20살 이상인 고객 정렬 후 출력");
		list.stream().filter(c->c.getAge()>=20).map(s->s.getName()).sorted().forEach(c->System.out.println(c));
	}
}
