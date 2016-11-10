package com.array;
//20161018
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) throws IOException {
		//3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
		//   1:가위, 2:바위, 3:보
		//
		//1:가위, 2:바위, 3:보 ? 2
		//컴퓨터가 이겼습니다(난수가 3인경우)
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] gawiBawiBo = {"가위","바위","보"};
		
		int inputNum,answerNum;
		char yn;
		
		do{
			answerNum = rd.nextInt(3)+1;
			do{
				System.out.print("1:가위, 2:바위, 3:보 ?");
				inputNum = sc.nextInt();
			}while(inputNum<1||inputNum>3);
			if(inputNum==answerNum)
				System.out.println("비겼습니다. 당신 : "+gawiBawiBo[inputNum-1]+" 컴퓨터 : "+gawiBawiBo[answerNum-1]);
			else if((inputNum+1)%3==answerNum%3)
				System.out.println("컴퓨터가 이겼습니다. 당신 : "+gawiBawiBo[inputNum-1]+" 컴퓨터 : "+gawiBawiBo[answerNum-1]);
			else System.out.println("당신이 이겼습니다. 당신 : "+gawiBawiBo[inputNum-1]+" 컴퓨터 : "+gawiBawiBo[answerNum-1]);
			
			while(true){
				System.out.print("계속하시겠습니까?[Y/N]:");
				yn = (char)System.in.read();
				if(yn=='Y'||yn=='y'||yn=='N'||yn=='n')
					break;
			}
			if(yn=='N'||yn=='n')
				break;		
		}while(true);
		sc.close();
	}
}
