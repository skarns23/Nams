package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		System.out.println(st1.studentID);
		System.out.println(st2.studentID);
		System.out.println(Student.getSerialNum());
	}

}
