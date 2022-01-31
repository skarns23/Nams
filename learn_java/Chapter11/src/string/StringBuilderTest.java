package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str1= new String("java");
		System.out.println(System.identityHashCode(str1));
		StringBuilder buf = new  StringBuilder(str1);
		System.out.println(System.identityHashCode(buf));
		buf.append(" and" );
		buf.append(" android" );
		System.out.println(System.identityHashCode(buf));
		String str2 = buf.toString();
		System.out.println(str2);
	}

}
