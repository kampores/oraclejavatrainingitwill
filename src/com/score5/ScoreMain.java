package com.score5;
//20161103
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		Score ob = new Score();
		Scanner sc = new Scanner(System.in);
		int n;
		
		//ob.load();
		while(true){
			do{
				System.out.print("1.입력 2.출력 3.저장 4.종료:");
				n = sc.nextInt();
			}while(n<1||n>4);
			switch(n){
			case 1:
				ob.input();break;
			case 2:
				ob.write();break;
			case 3:
				ob.writeFile();break;
			case 4:
				ob.writeFile();
				System.out.println("종료합니다..");
				System.exit(0);break;
			default:
			}
		}
	}
}
