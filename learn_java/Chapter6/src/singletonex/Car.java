package singletonex;

public class Car {
	private static int serialnum = 10000;
	private int carnum;
	
	public Car()
	{
		serialnum++;
		this.carnum = serialnum;
	}
	public int getCarNum()
	{
		return this.carnum;
	}
	
}
