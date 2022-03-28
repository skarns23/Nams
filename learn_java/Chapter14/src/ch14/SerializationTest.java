package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // �� ��ü�� ����ȭ �����ϴٴ� �ǹ̷� Serializable �������̽��� ���
	String name;
	String job;
	
	public Person() {
		
	}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name+", "+job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person lee = new Person("�̼���","��ǥ�̻�");
		Person kim = new Person("������","���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					oos.writeObject(lee);
					oos.writeObject(kim);
			
		}catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois  = new ObjectInputStream(fis)){
			Person plee = (Person)ois.readObject();
			Person pkim = (Person)ois.readObject();
			
			System.out.println(plee);
			System.out.println(pkim);
		}catch (IOException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
