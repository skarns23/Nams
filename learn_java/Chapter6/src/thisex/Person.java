package thisex;

public class Person {
	String name;
	int age;
	
	Person()
	{
		this("�̸�����",1);
	}
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	Person returnItself()
	{
		return this;
	}
	public static void main(String[] args)
	{
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
		
	}
}

