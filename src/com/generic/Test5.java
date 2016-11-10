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
			System.out.print("������?");
			oper = br.readLine();
			
			if(!oper.equals("+")&&!oper.equals("-")&&
					!oper.equals("*")&&!oper.equals("/")){
				//����ڰ� ���Ƿ� �����߻�
				throw new Exception("�������Է¿���!!");
			}
		} catch (IOException e) {
			System.out.println("�Է¿���1!!");
		}

		return oper;
	}
		
	public static void main(String[] args) {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("ù��°��?");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("�ι�°��?");
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
			System.out.println("���� �Է��ض�!!");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����!!");
		} catch (IOException e) {
			System.out.println("�Է¿���2!!");
		} catch (Exception e) {
			System.out.println("������ �ȹٷ� �Է�!!");
		} finally {
			System.out.println("������ ����ȴ�!!");
		}
	}
}
