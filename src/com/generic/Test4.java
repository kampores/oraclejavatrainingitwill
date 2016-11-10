package com.generic;
//20161031
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("첫번째수?");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("두번째수?");
			num2 = Integer.parseInt(br.readLine());
			System.out.print("연산자?");
			oper = br.readLine();
					
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
		} catch (NumberFormatException e) {
			System.out.println("정수 입력해라!!");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다!!");
		} catch (IOException e) {
			System.out.println("입력오류!!");
		} finally {
			System.out.println("언제든 실행된다!!");
		}
		System.out.println("나보이냐?");
	}
}
