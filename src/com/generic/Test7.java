package com.generic;
//20161031
import java.util.Scanner;

//5~10�� �̳��� ���ڿ��� �Է� �޾�����ϴ� ���α׷�
//�����ڸ� �Է�(��ҹ��ڱ��о���)

class MyAuthenticator{
	public void inputFormat(String str) throws Exception{
		if(str.length()<5||str.length()>10)
			throw new Exception("���ڿ��� ���̴� 5~10�Դϴ�");
		//65~90,97~122
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if((ch<65||ch>90)&&(ch<97||ch>122))
				throw new Exception("�����ڸ� �����մϴ�");
		}
	}
}

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		MyAuthenticator auth = new MyAuthenticator();
		
		try {
			System.out.print("���ڿ�?");
			str = sc.next();
			
			auth.inputFormat(str);
			
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
