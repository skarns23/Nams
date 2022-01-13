package singleton;

public class Company {

	private static Company instance = new Company();
	private Company()
	{}
	public static Company getInstance() //객체를 선언하지 않고 호출하기 위함
	{	
		if (instance ==null)
			instance = new Company();
		return instance;
	}
}
