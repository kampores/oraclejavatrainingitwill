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
				System.out.println("1.회원가입\n2.회원전체출력\n3.회원탈퇴\n4.회원수정\n" +
					"5.아이디검색\n6.이름검색\n7.종료\n--------");
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
				System.out.println("종료합니다..");
				System.exit(1);
			}
		}
	}

}
