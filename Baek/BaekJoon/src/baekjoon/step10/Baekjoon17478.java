package baekjoon.step10;
import java.util.*;
public class Baekjoon17478 {

	static String[] str;
	static int k;
	
	public static void solution(String s,int num) {
			if(num==0) {
				System.out.println(s+str[0]);
				System.out.println(s+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
				System.out.println(s+str[4]);
				return ;
			}
			for(int i = 0 ;i<str.length-1;i++) {
				System.out.println(s+str[i]);
			}
			solution(s+"____",num-1);
			System.out.println(s+str[4]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		k = num;
		str = new String[] {"\"����Լ��� ������?\"","\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."
				,"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���."
				,"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"","��� �亯�Ͽ���."};
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		String s = "";
		solution(s,num);
	}

}
