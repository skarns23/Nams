package object;

class Student{
	int stID;
	String stName;
	Student(int id, String name){
		this.stID = id;
		this.stName = name;
	}
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Student) {
			 Student std = (Student)obj;
			 if(this.stID ==std.stID)
				 return true;
			 else
				 return false;
			
		 }
		 return false;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test");
		String str2 = new String("test");
		System.out.println(str1.equals(str2));
	
		Student std1  =new Student(10001, "lee");
		Student std2  =new Student(10001, "lee");
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2)); //equals의 원형은 ==과 같은 방식임 그러므로 재정의
		
	
	}

}
