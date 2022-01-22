package Chapter9.step1;

public class Bus extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refule() {
		// TODO Auto-generated method stub
		System.out.println("천연 가스를 충전합니다..");
	}

	public void takePassenger()
	{
		System.out.println("승객을 버스에 태웁니다.");
	}
	
	
}
