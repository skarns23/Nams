package chapter7.q4;
import java.util.Scanner;
import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Dog> dg = new ArrayList<Dog>();
		for(int i=0; i< 5;i ++)
		{
			Dog d = new Dog(sc.next(),sc.next());
			dg.add(d);
		}
		for(Dog k : dg)
			System.out.println(k.showInfor());
	}

}
