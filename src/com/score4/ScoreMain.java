package com.score4;
//20161028
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true){
			do{
				System.out.println("1.�Է�\n2.���\n3.����\n4.����\n" +
					"5.�й��˻�\n6.�̸��˻�\n7.����\n--------");
				ch = sc.nextInt();
			}while(ch<1);
			switch(ch){
			case 1:
				ob.input();break;
			case 2:
				ob.print();break;
			case 3:
				ob.delete();break;
			case 4:
				ob.update();break;
			case 5:
				ob.findHak();break;
			case 6:
				ob.findName();break;
			default:
				System.out.println("�����մϴ�..");
				System.exit(1);
			}
		}
	}

}
