package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList marrayList = new MemberArrayList();
		Member mLee = new Member(101,"Lee");
		Member mKim = new Member(102,"Kim");
		Member mNam = new Member(103,"Nam");
		marrayList.addMember(mNam);
		marrayList.addMember(mLee);
		marrayList.addMember(mKim);
		marrayList.showAll();
		marrayList.removeMember(mKim.getMemberId());
		
		marrayList.showAll();
	}

}
