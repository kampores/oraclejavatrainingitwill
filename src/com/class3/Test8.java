package com.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//20161024
//String�� �޼ҵ�θ� ���� �ۼ�
public class Test8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����[3+5]? ");//25+16
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");//�߰� ��������
		
		/*String[] oper = {"+","-","*","/"};
		
		for(String op : oper){
			
		}*/
		
		//25+16, 6-4, 456*3, 789
		for(String op : new String[]{"+","-","*","/"}){
			int pos = str.indexOf(op);
			if(pos>-1){
				int num1 = Integer.parseInt(str.substring(0,pos));
				int num2 = Integer.parseInt(str.substring(pos+1));
				int result = 0;
				
				char operator = str.charAt(pos);
				switch(operator){
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;					
				}
				System.out.printf("%d %c %d = %d\n",num1,operator,num2,result);
				
				String s = String.format("%d %c %d = %d", num1, operator, num2 ,result);
				System.out.println(s);
			}
		}
	}
}
