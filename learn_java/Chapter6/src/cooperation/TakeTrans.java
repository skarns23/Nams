package cooperation;
public class TakeTrans {

	public static void main(String[] args) {
		
		Student	j = new Student("James",5000);
		Student t = new Student("Tomas",15000);
		
		Bus bus100 = new Bus(100);
		j.takeBus(bus100);
		j.showInfor();
		bus100.showInfo();
		Subway gr = new Subway("2È£¼±");
		t.takeSub(gr);
		t.showInfor();
		gr.showInfor();
		Taxi taxi200 = new Taxi(200);
		t.takeTaxi(taxi200);
		t.showInfor();
		taxi200.showInfor();
	}

}
