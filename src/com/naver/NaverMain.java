package com.naver;
//20161031
import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();
		
		int ch;
		
		while(true){
			do{
				System.out.println("1.ȸ������\n2.ȸ����ü���\n3.ȸ��Ż��\n4.ȸ������\n" +
					"5.���̵�˻�\n6.�̸��˻�\n7.����\n--------");
				ch = sc.nextInt();
			}while(ch<1);
			switch(ch){
			case 1:
				ob.join();break;
			case 2:
				ob.print();break;
			case 3:
				ob.withdraw();break;
			case 4:
				ob.update();break;
			case 5:
				ob.findID();break;
			case 6:
				ob.findName();break;
			default:
				System.out.println("�����մϴ�..");
				System.exit(1);
			}
		}
	}

}
