package ch01;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	//Runnable �������̽��� Ŭ������ ������ȭ �Ҷ� ����Ѵ�.
	Runnable getRuunable(final int i) {
		final int num = 10;
		//������ Ŭ���� ���� ���� �ʱ⶧���� Runnable �������̽��� ������ ��ü�� ��ȯ
		return  new Runnable(){
			
			int localNum = 1000;
			@Override
			public void run() {
				
				
				System.out.println("i = " +i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNum = "+outNum+"(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = "+Outer2.sNum+"(�ܺ� Ŭ���� ���� ����)");
			}
			
		};
		
	}
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
}
public class AnonumousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRuunable(100);
		runner.run();
		out.runner.run();
	}

}
