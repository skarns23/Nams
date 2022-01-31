package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
			Class strClass = Class.forName("java.lang.String");
			Constructor[] cons= strClass.getConstructors();
			for (Constructor  c :cons)
			{
				System.out.println(c);
			}
			Field[] fields = strClass.getFields();
			for(Field f :fields) {
				System.out.println(f);
			}
	}

}
