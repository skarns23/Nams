package polymorphism;

class Animal{
	public void move()
	{
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("����� �����Դϴ�.");
	}
}
class Tiger extends Animal
{
	public void move()
	{
		System.out.println("ȣ���̰� �����Դϴ�.");
	}
}
class Eagle extends Animal
{
	public void move()
	{
		System.out.println("�������� �����Դϴ�.");
	}
}
public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 Test = new AnimalTest1();
		Test.moveAnimal(new Human());
		Test.moveAnimal(new Tiger());
		Test.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal)
	{
		animal.move();
	}

}
