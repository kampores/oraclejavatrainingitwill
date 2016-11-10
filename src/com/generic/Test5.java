package com.generic;
//20161031
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {
	public static String getOper() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String oper = null;
		
		try {
			System.out.print("연산자?");
			oper = br.readLine();
			
			if(!oper.equals("+")&&!oper.equals("-")&&
					!oper.equals("*")&&!oper.equals("/")){
				//사용자가 임의로 에러발생
				throw new Exception("연산자입력오류!!");
			}
		} catch (IOException e) {
			System.out.println("입력오류1!!");
		}

		return oper;
	}
		
	public static void main(String[] args) {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("첫번째수?");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("두번째수?");
			num2 = Integer.parseInt(br.readLine());
			oper = Test5.getOper();
					
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
			System.out.println("입력오류2!!");
		} catch (Exception e) {
			System.out.println("연산자 똑바로 입력!!");
		} finally {
			System.out.println("언제든 실행된다!!");
		}
	}
}
