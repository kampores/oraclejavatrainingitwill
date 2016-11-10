package com.generic;
//20161031
import java.util.Scanner;

//Exception 클래스
//예외처리
public class Test3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int num1,num2,result;
			String oper;
			
			System.out.print("두수?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자?");
			oper = sc.next();
			
			result = 0;
			
			if(oper.equals("+"))
				result = num1 + num2;
			else if(oper.equals("-"))
				result = num1 - num2;
			else if(oper.equals("*"))
				result = num1 * num2;
			else if(oper.equals("/"))
				result = num1 / num2;
			
			System.out.printf("%d %s %d = %d\n",num1,oper,num2,result);
		} catch (Exception e) {
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println("넌 그게 숫자로 보이냐?");
		}
	}
}
