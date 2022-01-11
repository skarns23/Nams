package polymorphism;

class Animal{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("사람이 움직입니다.");
	}
}
class Tiger extends Animal
{
	public void move()
	{
		System.out.println("호랑이가 움직입니다.");
	}
}
class Eagle extends Animal
{
	public void move()
	{
		System.out.println("독수리가 움직입니다.");
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
