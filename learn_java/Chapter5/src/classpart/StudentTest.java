package classpart;
public class StudentTest {

	public static void main(String[] args)
	{
		Student s = new Student();
		s.studentName = "�̼���";
		s.studentID = 100;
		s.address ="�뱸";
	
		Student s1 = new Student();
		s1.studentName = "������";
		s1.studentID = 200;
		s1.address ="�λ�";
		s.showStudentInfor();
		s1.showStudentInfor();
	
	}
}
