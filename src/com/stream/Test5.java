package com.stream;
//20161102
import java.io.FileInputStream;

//FileInputStream(�����Է�)
public class Test5 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			int data;
			
			while((data=fis.read())!=-1){
				//System.out.print((char)data);
				System.out.write(data);//->���͸� �������� ����
				System.out.flush();//->���� �Է��� �ڷ� ���
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
