package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		
		String s1  = "Hello";
		String s2 = "World!";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
	
		StringConcat concat =  (str1,str2)->System.out.println(str1+","+str2);
		//람다식을 사용하는 경우 내부적으로 익명 클래스가 생성됨
		concat.makeString(s1, s2);
		
		//익명 클래스를 만드는 경우 
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+"....."+s2);
			}
		};
		concat2.makeString(s1, s2);
	}

}
