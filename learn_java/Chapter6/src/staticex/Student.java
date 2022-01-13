package staticex;

public class Student {

	int studentID;
	String studentName;
	private static int serialNum=10000;
	public Student()
	{	
		serialNum++;
		this.studentID = serialNum;
	}
	public static int getSerialNum() //static method에서는 멤버변수를 사용할 수 없음
	{
		//studentName = "홍길동"; 을 넣는 경우에 오류가 발생 함.  
		return serialNum;
	}
}
