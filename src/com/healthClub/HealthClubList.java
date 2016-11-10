package com.healthClub;

import java.util.LinkedList;
//20161020
public class HealthClubList {

	private LinkedList<HealthClubMember> healthClubList = new LinkedList<HealthClubMember>();
	
	public LinkedList<HealthClubMember> getHealthClubList() {
		return healthClubList;
	}

	public void setHealthClubList(LinkedList<HealthClubMember> healthClubList) {
		this.healthClubList = healthClubList;
	}
}
