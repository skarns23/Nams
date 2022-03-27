package ch09;

public class PasswordTest {
	
	private String password;
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) throws PasswordException {
		
		if(password == null) {
			throw new PasswordException("��й�ȣ�� null ���� �� �����ϴ�.");
		}
		else if (password .length()<5) {
			throw new PasswordException("��й�ȣ�� 5�� �̻��̿��� �մϴ�.");
		}
		else if (password.matches("[a-zA-z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		
		this.password = password;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordTest test = new PasswordTest();
		String[] pwd = {null,"abc","zkwmskfl0617!"};
		for(int i = 0; i<pwd.length;i++) {
		System.out.println("��� : "+i );
			try {
			test.setPassword(pwd[i]);
			System.out.println("��������");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
		
	}

}
