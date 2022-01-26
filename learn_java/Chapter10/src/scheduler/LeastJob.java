package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상당 전화를 순서대로 대기열에서 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담업무가 없는 상담원에게 할당합니다.");
	}

}
