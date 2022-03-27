package ch09;

public class PasswordTest {
	
	private String password;
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) throws PasswordException {
		
		if(password == null) {
			throw new PasswordException("비밀번호는 null 값일 수 없습니다.");
		}
		else if (password .length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이여야 합니다.");
		}
		else if (password.matches("[a-zA-z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordTest test = new PasswordTest();
		String[] pwd = {null,"abc","zkwmskfl0617!"};
		for(int i = 0; i<pwd.length;i++) {
		System.out.println("경우 : "+i );
			try {
			test.setPassword(pwd[i]);
			System.out.println("오류없음");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
		
	}

}
