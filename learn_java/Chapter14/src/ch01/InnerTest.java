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
		//static int sInNum = 500; OuterClass�� ������ �ڿ� InnerClass�� �����ǹǷ� static ������ ����� �� ���� 
		
		void inTest() {
			System.out.println("OutClass num = "+num+ "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = "+iNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	static class InStaticClass {
		 int iNum = 100;
		 static int sInNum = 200;
		 void inTest() { //�ܺ� Ŭ������ �ν��Ͻ� ������ �����Ǳ� ������ �� �޼ҵ尡 ȣ��� �� �־ num�������� ������ �� 
			 System.out.println("InClass num = "+iNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
				System.out.println("InClass sNum = "+sInNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
			
		 }
		 static void sTest() { //static class�� static �޼ҵ�� Ŭ���� ���������� ȣ��� �� ���� �׶��� static Ŭ���� ������ �ν��Ͻ� ������ ���������ʾ��� ���� ����
				System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
				System.out.println("InClass sNum = "+sInNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
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
		  	InnerClass�� private�� �ƴ� ��쿡 �̷� ������ ������ �����ϳ� �� ������� ����
		 */
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); //�Ϲ� �޼ҵ� ȣ�� ���
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
