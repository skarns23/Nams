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
	public static int getSerialNum() //static method������ ��������� ����� �� ����
	{
		//studentName = "ȫ�浿"; �� �ִ� ��쿡 ������ �߻� ��.  
		return serialNum;
	}
}
