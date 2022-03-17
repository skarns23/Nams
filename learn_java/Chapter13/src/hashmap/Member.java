package hashmap;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;        //ȸ�� ���̵�
	private String memberName;   //ȸ�� �̸�

	public Member(int memberId, String memberName){ //������
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public Member() {}
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString �޼ҵ� �����ε�
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member){
			Member member = (Member)obj;
			if( this.memberId == member.memberId )
				return true;
			else 
				return false;
		}
		return false;
	}

	/*
	 * @Override //Comparable �������̽� compareTo�� �ڱ��ڽŰ� �Ѿ�� �Ķ���Ϳ� �� public int
	 * compareTo(Member member) { if(this.memberId > member.memberId) return 1; else
	 * if(this.memberId< member.memberId) return -1; else return 0; // �������� }
	 */

	@Override //compare �ϳ��� �Ű������� �ΰ� �Ѿ��
	public int compare(Member o1, Member o2) {
		return (o1.memberId-o2.memberId)*(-1); //��������
		//�̹� Comparable�� ������ ��� Comparator�� ���ϴ� ����� �ٽ� ���� ���� 
	}
}