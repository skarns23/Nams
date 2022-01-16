package chapter7.q4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class DogTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Dog[] dg = new Dog[5];
		for(int i =0;i <5;i++)
		{
			String name = sc.next();
			String type = sc.next();
			dg[i] = new Dog(name,type);
		}
		for(Dog d :dg)
			System.out.println(d.showInfor());
		
	}

}
