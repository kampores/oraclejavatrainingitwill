package com.stream;
//20161102
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("d:\\doc\\out6.txt");
			ps = new PrintStream(fos);
			ps.println("�����");
			ps.println("����ȿ");
			ps.println("������");
			ps.println("õ����");
			
			//true:append
			fos = new FileOutputStream("d:\\doc\\out6.txt",true);
			ps = new PrintStream(fos);
			
			ps.println("������");
			ps.println("�����");
			ps.println("�ݿ���");
			
			ps.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
