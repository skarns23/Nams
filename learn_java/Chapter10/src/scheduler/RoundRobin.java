package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상당 전화를 순서대로 대기열에서 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}

}
