package ch11;

public class Student {
	private String stdName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String stdName) {
		if( stdName == null ) {
			throw new StudentNameFormatException("이름을 null일 수 없습니다.");
		}
		else if(stdName.split(" ").length>3) {
			throw new StudentNameFormatException("이름이 깁니다.");
			
		}
		this.stdName = stdName;   
	
	}
	
	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return this.stdName;
	}
}
