package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student("lee", 1001);
		Student kim = new Student("kim", 1002);
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 87);
		lee.addSubject("과학", 55);
		lee.addSubject("영어", 78);
		
		kim.addSubject("국어", 100);
		kim.addSubject("자구", 95);
		kim.addSubject("논리회로", 67);
		lee.showInfor();
		kim.showInfor();
	}

}
