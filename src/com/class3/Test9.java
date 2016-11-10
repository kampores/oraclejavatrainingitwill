package com.class3;

import java.io.IOException;
import java.util.Scanner;
//20161024
class PrintTest{
	public void print(String r){
		System.out.println(r);
	}
}

class Calc extends PrintTest{
	int num1, num2;
	String num;
	char oper;
	
	public void input() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 수[5,2]?");
		num = sc.next();
		
		String ss[] = num.split(",");
		num1 = Integer.parseInt(ss[0]);
		num2 = Integer.parseInt(ss[1]);
		
		System.out.print("연산자? ");//+,-,*,/
		oper = (char)System.in.read();
	}
	
	public String calc(){
		int result = 0;
		
		switch(oper){
		case '+':
			result = num1 + num2; break;
		case '-':
			result = num1 - num2; break;
		case '*':
			result = num1 * num2; break;
		case '/':
			result = num1 / num2; break;
		}
		
		return String.format("%d %c %d = %d",num1,oper,num2,result);
	}
}

public class Test9 {
	public static void main(String[] args) throws IOException {
		Calc ob = new Calc();
		
		ob.input();
		
		String s = ob.calc();
		
		ob.print(s);
	}
}
