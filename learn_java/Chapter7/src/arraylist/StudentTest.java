package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student("lee", 1001);
		Student kim = new Student("kim", 1002);
		lee.addSubject("����", 100);
		lee.addSubject("����", 87);
		lee.addSubject("����", 55);
		lee.addSubject("����", 78);
		
		kim.addSubject("����", 100);
		kim.addSubject("�ڱ�", 95);
		kim.addSubject("��ȸ��", 67);
		lee.showInfor();
		kim.showInfor();
	}

}
