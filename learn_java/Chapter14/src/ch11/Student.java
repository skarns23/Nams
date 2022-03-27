package ch11;

public class Student {
	private String stdName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String stdName) {
		if( stdName == null ) {
			throw new StudentNameFormatException("�̸��� null�� �� �����ϴ�.");
		}
		else if(stdName.split(" ").length>3) {
			throw new StudentNameFormatException("�̸��� ��ϴ�.");
			
		}
		this.stdName = stdName;   
	
	}
	
	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return this.stdName;
	}
}
