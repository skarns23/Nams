package collection.arraylist;
import java.util.ArrayList;

import collection.Member;
public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member m) {
		arrayList.add(m);
	}
	
	public boolean removeMember(int id) {
		
		for( int i = 0; i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			int memid = member.getMemberId();
			if( memid== id) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(id +"가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		for(Member m : arrayList) {
			System.out.println(m);
		}
		
		System.out.println();
		//System.out.println(arrayList); 
		//ArrayList의 toString은 객체하나를 출력한 뒤 ","를 찍어준다.
	}
}

