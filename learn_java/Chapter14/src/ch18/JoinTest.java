package ch18;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int sum;
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void run() {
		
		for(int i = start; i<=end;i++) {
			sum +=i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51,100);
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = jt1.sum +jt2.sum;
		System.out.println("jt1.total = "+jt1.sum);
		System.out.println("jt2.total = "+jt2.sum);
		System.out.println(total);
	}

}
