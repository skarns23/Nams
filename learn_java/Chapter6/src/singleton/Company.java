package singleton;

public class Company {

	private static Company instance = new Company();
	private Company()
	{}
	public static Company getInstance() //��ü�� �������� �ʰ� ȣ���ϱ� ����
	{	
		if (instance ==null)
			instance = new Company();
		return instance;
	}
}
