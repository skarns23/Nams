package scheduler;

public class Priority implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("등급이 높은 고객의 전화를 먼저 받습니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 skill이 가장 높은 상담원에게 우선 배분합니다.");
	}

}
