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
			System.out.print("ù��°��?");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("�ι�°��?");
			num2 = Integer.parseInt(br.readLine());
			System.out.print("������?");
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
			System.out.println("���� �Է��ض�!!");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����!!");
		} catch (IOException e) {
			System.out.println("�Է¿���!!");
		} finally {
			System.out.println("������ ����ȴ�!!");
		}
		System.out.println("�����̳�?");
	}
}
