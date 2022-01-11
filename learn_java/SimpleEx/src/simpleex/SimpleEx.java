package simpleex;
import java.util.*;
class Cal
{
	double a;
	double b;
	public Cal(double fir,double sec)
	{
		this.a = fir;
		this.b = sec;
		System.out.println("First number is "+this.a);
		System.out.println("Second number is "+this.b);
	
	}
	public void add()
	{
		double result = this.a +this.b;
		System.out.println("a + b =" +result);
	}
	public void sub() {
		double result = this.a -this.b;
		System.out.println("a - b =" +result);
	}
	public void mul()
	{
		double result = this.a *this.b;
		System.out.println("a * b =" +result);
	}
	public void div()
	{
		double result = this.a /this.b;
		System.out.println("a / b =" +result);
	}
	public void rem()
	{
		int  result = (int)this.a %(int)this.b;
		System.out.println("a % b =" +result);
	}
		
}

public class SimpleEx {

	public static void main(String[] args) {
		System.out.print("연산할 두 수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Cal ex = new Cal(a,b); 
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();
		ex.rem();
	}

}
