package com.thread;
//20161101
import java.util.List;

public class MemberVO {
	int num;
	String[] members = {"���뿵","�����","��ȿ��","������","������","�̽���",
			"������","�̵���","���","����â","�ŵ�ȭ","�ּ���","���ؿ�",
			"�ڰ�ȯ","������","�߽���","������","��â��","����","������",
			"������","���μ�","�ѳ���","�ӵ���","�̰���"}; 
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
