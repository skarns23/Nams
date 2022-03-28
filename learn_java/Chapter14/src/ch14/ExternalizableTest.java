package ch14;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable{
	String name;
	String school;
	
	public Student() {}
	public Student(String name, String school) {
		this.name = name;
		this.school = school;
	}
	public String toString() {
		return name+", "+school;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(name);
		out.writeUTF(school);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = in.readUTF();
		school = in.readUTF();
	}
	
}
public class ExternalizableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("이순신","동부고등학교");
		Student kim = new Student("김유신","정동고등학교");
		
		try(FileOutputStream fis = new FileOutputStream("external.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fis)){
			oos.writeObject(lee);
			oos.writeObject(kim);
		}catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("external.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Student plee = (Student)ois.readObject();
			Student pkim = (Student)ois.readObject();
		}catch(IOException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
