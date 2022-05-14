package baekjoon.step15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Baekjoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		ArrayList<Integer> mlist = new ArrayList<>(); //���̳ʽ� ���� ���� ����Ʈ
		ArrayList<Integer> plist = new ArrayList<>(); //�÷��� ���� ���� ����Ʈ
		int zeros = 0; // 0�� ������ üũ
		int answer = 0;
		for(int i = 0 ; i<num;i++) { // �Է��� �����鼭 �Է� ���� 0 or 1�̸� ó������
			int input = sc.nextInt();
			if(input ==1) // 1�ΰ�� ������ ������ ���ϴ� ���� ���� ũ�� ������ �̸� ���� 
				answer +=input;
			else if (input ==0) // 0�� ��쿡�� ���� ������ ������ ���� 
				zeros ++;
			else if (input >0)
				plist.add(input);
			else if (input<0)
				mlist.add(input);
		}
		Collections.sort(mlist); // �������� ���� 
		Collections.sort(plist);
		if((mlist.size()%2 )==1) { // ���̳ʽ� ����Ʈ�� ��� ������ ������ Ȧ���̸� zero�� ������ ���� zero padding �Ǵ� 1�� �߰����༭ ���� ���� ��ȭ�� ������ ��
			mlist.add(zeros>0 ?0:1);
		}
		if((plist.size()%2)==1) { // �÷��� ����Ʈ�� ��� Ȧ���� �Ǿտ��� ������ ���� �����ϵ��� �Ǿտ� 1�� �߰�
			plist.add(0, 1);
		}
		for(int i = 0 ; i<plist.size();i+=2) {
			answer += plist.get(i)*plist.get(i+1);
		}
		for(int i = 0 ; i<mlist.size();i+=2) {
			answer +=mlist.get(i)*mlist.get(i+1);
		}
		System.out.println(answer);
	}

}
