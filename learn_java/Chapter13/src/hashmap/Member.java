package hashmap;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member(int memberId, String memberName){ //생성자
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
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
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
	 * @Override //Comparable 인터페이스 compareTo는 자기자신과 넘어온 파라미터와 비교 public int
	 * compareTo(Member member) { if(this.memberId > member.memberId) return 1; else
	 * if(this.memberId< member.memberId) return -1; else return 0; // 오름차순 }
	 */

	@Override //compare 하나는 매개변수가 두개 넘어옴
	public int compare(Member o1, Member o2) {
		return (o1.memberId-o2.memberId)*(-1); //내림차순
		//이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현 가능 
	}
}