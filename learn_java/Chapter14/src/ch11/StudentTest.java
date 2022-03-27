package ch11;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLogger myLogger = MyLogger.getLogger();
		
		String[] name = {null,"Edward Jon Kim Test","James"};
		for(int i = 0 ; i<name.length;i++) {
		try {
			Student student = new Student(name[i]);
		} catch (StudentNameFormatException e) {
			myLogger.warning(e.getMessage()); //exception 상황에서는 항상 로그를 남겨야함
		}
		}
	}

}
