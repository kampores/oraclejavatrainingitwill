package com.stream;
//20161102
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

//���� ���� ���α׷�

//��������:d:\\doc\\test.txt
//�������:d:\\doc\\out2.txt
//����Ϸ�!!
public class Test7 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1,str2;
		int data;
		
		try {
			System.out.print("��������: ");
			str1 = br.readLine();
			System.out.print("�������: ");
			str2 = br.readLine();
			
			FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);
			
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			//fos.flush();
			fis.close();
			fos.close();//<-.close(); �� �ڵ����� flush(); �� ȣ��
			System.out.println("����Ϸ�!!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
