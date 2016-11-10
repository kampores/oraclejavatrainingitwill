package com.exception;
//20161031
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptMain {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1,num2,result;
		
		OperatorAuthen auth = new OperatorAuthen();
		try {
			System.out.print("두수[a,b]");//10,20
			str = br.readLine();
			
			auth.inputFormat(str);//입력 오류처리
			
			String[] temp = str.split(",");
			
			auth.number(temp[0]);
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[0]);
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("연산자?");
			str =br.readLine();
			
			auth.operator(str.charAt(0));
			
			char ch = str.charAt(0);
			
			result=0;
			
			if(ch=='+')
				result = num1+num2;
			if(ch=='-')
				result = num1-num2;
			if(ch=='*')
				result = num1*num2;
			if(ch=='/')
				result = num1/num2;
			
			System.out.printf("%g %c %g = %g\n",num1,ch,num2,result);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println(e.toString());
		}
	}
}
