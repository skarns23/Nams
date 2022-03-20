package ch01;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	//Runnable 인터페이스는 클래스를 스레드화 할때 사용한다.
	Runnable getRuunable(final int i) {
		final int num = 10;
		//어차피 클래스 명을 쓰지 않기때문에 Runnable 인터페이스를 구현학 객체를 반환
		return  new Runnable(){
			
			int localNum = 1000;
			@Override
			public void run() {
				
				
				System.out.println("i = " +i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNum = "+outNum+"(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = "+Outer2.sNum+"(외부 클래스 정적 변수)");
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
