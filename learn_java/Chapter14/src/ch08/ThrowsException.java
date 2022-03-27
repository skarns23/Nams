package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "abc");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e ) { //Exception의 최상위 클래스로 업캐스팅되서 다른 예외가 생기는걸 처리하는 방식
			
		}
	}

}
