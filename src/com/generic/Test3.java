package com.generic;
//20161031
import java.util.Scanner;

//Exception Ŭ����
//����ó��
public class Test3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			int num1,num2,result;
			String oper;
			
			System.out.print("�μ�?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������?");
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
			System.out.println("�� �װ� ���ڷ� ���̳�?");
		}
	}
}
