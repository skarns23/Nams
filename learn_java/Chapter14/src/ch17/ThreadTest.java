package ch17;

class MyThread implements Runnable{
	
	@Override
	public void run() {
		
		int i ;
		
		for( i =1; i<=50;i++) {
			System.out.print(i+"\t");
			
			
		}
		
	}
}
public class ThreadTest {

	public static void main(String[] args) {
				
		System.out.println(Thread.currentThread()+" start"); // ���� �������� thread�� �˷��ִ� �޼ҵ�
		MyThread runnable = new MyThread(); //���� �����忡 �����Ͽ� ����ϴ� ��� 
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+" end");
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("end");
			}
		};
		run.run();
	}

}
