package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int inum = 1000;
		byte bnum = (byte)inum;
		
		System.out.println(inum);
		System.out.println(bnum); // ū������ �������ΰ��� ������ ���� 
		
		
		double dnum= 3.14;
		inum = (int)dnum;
		System.out.println(inum);
		float fnum = 0.9F;
		int num1 = (int)dnum + (int)fnum;
		int num2 = (int)(dnum + fnum);
		System.out.println(num1);
		System.out.println(num2);
	}

	

}
