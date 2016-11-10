package com.healthClub;

import java.util.ListIterator;
//20161020
public class HealthClubPrint {
	public void healthClubPrint(HealthClubList hcl){
		ListIterator<HealthClubMember> hclLi = hcl.getHealthClubList().listIterator();
		HealthClubMember hcm;
		
		System.out.printf("%5s\t%5s\t%5s\t%5s\t%5s\n","이름","성별","나이","키","몸무게");
		System.out.println("----------------------------------------");
		while(hclLi.hasNext()){
			hcm = hclLi.next();
			System.out.printf("%5s\t%5s\t%5s세\t%5scm\t%5skg\n",hcm.getName(),hcm.getSex(),hcm.getAge(),hcm.getHeight(),hcm.getWeight());	
		}
	}
}
