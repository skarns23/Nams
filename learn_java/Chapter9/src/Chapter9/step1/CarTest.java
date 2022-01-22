package Chapter9.step1;

public class CarTest {
	public static void main(String[] args)
	{
		Bus bus = new Bus();
		AutoCar autoCar =new AutoCar();
		bus.run();
		autoCar.run();
		bus.refule();
		autoCar.refule();
		bus.takePassenger();
		autoCar.load();
		bus.stop();
		autoCar.stop();
	}
}
