package chapter2;

public class Conver {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		long lnum = 10;
		float fnum = lnum;
		System.out.println(fnum);
		double dnum = fnum + num; //�������� -> �Ǽ� ����
		System.out.println(dnum);
	}

}
