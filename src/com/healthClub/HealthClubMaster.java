package com.healthClub;

import java.util.Scanner;
//20161020
public class HealthClubMaster {
	Scanner sc = new Scanner(System.in);
	
	public void healthClubInput(HealthClubMember hcm){
		int sex;
		
		System.out.print("이름?");
		hcm.setName(sc.next());
		do{
			System.out.print("성별(1:남자 2:녀자)?");
			sex=sc.nextInt();
			switch(sex){
			case 1: hcm.setSex(false);
					break;
			case 2: hcm.setSex(true);
					break;
			default: 
			}
		}while(!(1<=sex&&sex<=2));
		System.out.print("나이(세)?");
		hcm.setAge(sc.nextInt());
		System.out.print("키(cm)?");
		hcm.setHeight(sc.nextInt());
		System.out.print("몸무게(kg)?");
		hcm.setWeight(sc.nextInt());
	}
	
	public void healthClubInputContinue(HealthClubList hcl){
		String yesNo;
		do{
			HealthClubMember hcm = new HealthClubMember();
			healthClubInput(hcm);
			hcl.getHealthClubList().add(hcm);
			System.out.print("출력하시겠습니까?(\"y\" 입력시 출력, 그외 입력 계속):");
			yesNo=sc.next();
		}while(!yesNo.equals("y"));
		new HealthClubPrint().healthClubPrint(hcl);
	}
}
