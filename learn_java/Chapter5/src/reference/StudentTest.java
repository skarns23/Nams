package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student std1 = new Student(100,"Nam");
		std1.setKor("Kor", 95);
		std1.setMat("Mat", 88);
		
		
		Student std2 = new Student(105,"Lee");
		std2.setKor("Kor", 100);
		std2.setMat("Mat", 100);
		
		std1.showStdInfo();
		std2.showStdInfo();
		
		int k = add(100,1001);
		System.out.println(k);
	}
	
	public static int add (int num1, int num2)
	{
		int result;
		result = num1+ num2;
		return result;
	}
	
}
