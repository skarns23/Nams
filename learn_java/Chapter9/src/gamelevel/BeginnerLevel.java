package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Jump를 할 줄 모릅니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Trun할 줄 모릅니다.");
	}

	@Override
	public void showMessage() {
		System.out.println("초보자 레벨입니다.");
	}

	
}
