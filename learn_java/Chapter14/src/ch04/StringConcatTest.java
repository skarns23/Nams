package ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		
		
		String s1  = "Hello";
		String s2 = "World!";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
	
		StringConcat concat =  (str1,str2)->System.out.println(str1+","+str2);
		//���ٽ��� ����ϴ� ��� ���������� �͸� Ŭ������ ������
		concat.makeString(s1, s2);
		
		//�͸� Ŭ������ ����� ��� 
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+"....."+s2);
			}
		};
		concat2.makeString(s1, s2);
	}

}
