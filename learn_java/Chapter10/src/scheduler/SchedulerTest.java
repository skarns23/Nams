package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		// R,L,P
		System.out.println("전화 상담 배분방식을 선택하세요: R L P");
		int ch =System.in.read();
		Scheduler scheduler =null;
		
		if(ch=='R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if (ch =='L' || ch =='l') {
			scheduler = new LeastJob();
		}
		else if (ch =='P' || ch =='p')
			scheduler = new Priority();
		else
		{
			System.out.println("잘못된 문자입니다.");
			return ;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
