package com.thread;
//20161101
import java.util.List;

public class MemberVO {
	int num;
	String[] members = {"염대영","이재원","최효영","유서하","박정아","이승진",
			"정현희","이동찬","김상성","신익창","신동화","최숙향","이준영",
			"박경환","이현성","추승필","강인혁","장창기","김상수","우은비",
			"김유상","강민석","한나래","임동현","이경훈"}; 
	List<String> memberLists;
	List<Integer> randomMemberLists;
	List<String> sortitionMemberLists;


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String[] getMembers() {
		return members;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}

	public List<String> getMemberLists() {
		return memberLists;
	}

	public void setMemberLists(List<String> memberLists) {
		this.memberLists = memberLists;
	}
	
	public List<Integer> getRandomMemberLists() {
		return randomMemberLists;
	}

	public void setRandomMemberLists(List<Integer> randomMemberLists) {
		this.randomMemberLists = randomMemberLists;
	}
	
	public List<String> getSortitionMemberLists() {
		return sortitionMemberLists;
	}

	public void setSortitionMemberLists(List<String> sortitionMemberLists) {
		this.sortitionMemberLists = sortitionMemberLists;
	}
}
