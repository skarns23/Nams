package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {

		System.out.println(studentName + "," + address);
	}
	
	
	public String getName()
	{
		return studentName;
	}
	public void setName(String newName)
	{
		this.studentName = newName;
		
	}
	
}
