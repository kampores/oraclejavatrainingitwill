package com.healthClub;

import java.util.Scanner;
//20161020
public class HealthClubMaster {
	Scanner sc = new Scanner(System.in);
	
	public void healthClubInput(HealthClubMember hcm){
		int sex;
		
		System.out.print("�̸�?");
		hcm.setName(sc.next());
		do{
			System.out.print("����(1:���� 2:����)?");
			sex=sc.nextInt();
			switch(sex){
			case 1: hcm.setSex(false);
					break;
			case 2: hcm.setSex(true);
					break;
			default: 
			}
		}while(!(1<=sex&&sex<=2));
		System.out.print("����(��)?");
		hcm.setAge(sc.nextInt());
		System.out.print("Ű(cm)?");
		hcm.setHeight(sc.nextInt());
		System.out.print("������(kg)?");
		hcm.setWeight(sc.nextInt());
	}
	
	public void healthClubInputContinue(HealthClubList hcl){
		String yesNo;
		do{
			HealthClubMember hcm = new HealthClubMember();
			healthClubInput(hcm);
			hcl.getHealthClubList().add(hcm);
			System.out.print("����Ͻðڽ��ϱ�?(\"y\" �Է½� ���, �׿� �Է� ���):");
			yesNo=sc.next();
		}while(!yesNo.equals("y"));
		new HealthClubPrint().healthClubPrint(hcl);
	}
}
