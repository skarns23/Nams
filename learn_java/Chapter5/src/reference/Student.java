package reference;

public class Student {

	int stdID;
	String stdName;
	Subject kor;
	Subject mat;
	public Student()
	{
		kor = new Subject();
		mat = new Subject();
	}
	public Student(int id, String name)
	{
		this.stdID = id;
		this.stdName = name;
		this.kor = new Subject();
		this.mat = new Subject();
	}
	public void setKor(String name,int scr)
	{
		kor.setName(name);
		kor.setScore(scr);
	}
	public void setMat(String name,int scr)
	{
		mat.setName(name);
		mat.setScore(scr);
	}
	public void showStdInfo()
	{
		int total = kor.getScore() + mat.getScore();
		System.out.println(stdName + "학생의 총점은" + total);
	}
}
