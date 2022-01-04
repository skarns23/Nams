package classpart;
public class StudentTest {

	public static void main(String[] args)
	{
		Student s = new Student();
		s.studentName = "이순신";
		s.studentID = 100;
		s.address ="대구";
	
		Student s1 = new Student();
		s1.studentName = "김유신";
		s1.studentID = 200;
		s1.address ="부산";
		s.showStudentInfor();
		s1.showStudentInfor();
	
	}
}
