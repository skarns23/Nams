package arraylist;

import java.util.ArrayList;

public class Student {

	String st_name;
	int st_id;
	ArrayList<Subject> sublist;
	public Student(String name,int id)
	{
		this.st_id = id;
		this.st_name = name;
		this.sublist = new ArrayList<Subject>();
	}
	public void addSubject(String sub_name,int score)
	{
		Subject sub = new Subject();
		sub.setGrade(score);
		sub.setSub_name(sub_name);
		this.sublist.add(sub);
	}
	public void showInfor()
	{
		int sum =0;
		for(int i =0;i <this.sublist.size();i++)
		{
			Subject sub = new Subject();
			sub = sublist.get(i);
			System.out.println(this.st_name+"의"+sub.getSub_name()+"과목 섣적은"+sub.getGrade()+"점 입니다.");
			sum +=sub.getGrade();
		}
		System.out.println(this.st_name+"학생의 총점은 "+sum+"점 입니다.");
	}
	
}
