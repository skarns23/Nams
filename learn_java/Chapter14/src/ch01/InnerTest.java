package ch01;


class OutClass{
	private int num = 10;
	private static int sNum= 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	private class InClass{
		int iNum = 100;
		//static int sInNum = 500; OuterClass가 생성된 뒤에 InnerClass가 생성되므로 static 변수를 사용할 수 없음 
		
		void inTest() {
			System.out.println("OutClass num = "+num+ "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스테틱 변수)");
			System.out.println("InClass iNum = "+iNum+ "(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	static class InStaticClass {
		 int iNum = 100;
		 static int sInNum = 200;
		 void inTest() { //외부 클래스의 인스턴스 변수가 생성되기 이전에 이 메소드가 호출될 수 있어서 num변수에서 오류가 뜸 
			 System.out.println("InClass num = "+iNum+ "(내부 클래스의 인스턴스 변수)");
				System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스테틱 변수)");
				System.out.println("InClass sNum = "+sInNum+ "(내부 클래스의 인스턴스 변수)");
			
		 }
		 static void sTest() { //static class의 static 메소드는 클래스 생성이전에 호출될 수 있음 그때는 static 클래스 내부의 인스턴스 변수가 생성되지않았을 수도 있음
				System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스테틱 변수)");
				System.out.println("InClass sNum = "+sInNum+ "(내부 클래스의 인스턴스 변수)");
		 }
	}
}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * OutClass outClass = new OutClass(); outClass.usingClass();
		 */
		/*
		 * OutClass.InClass inner = outClass.new Inner();
		  	InnerClass가 private가 아닌 경우에 이런 식으로 생성이 가능하나 잘 사용하지 않음
		 */
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); //일반 메소드 호출 방법
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
