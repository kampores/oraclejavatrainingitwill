package com.stream;
//20161102
import java.io.File;
import java.util.Date;

//File
//���� �� ������ ������ �� �ֵ��� ����� �������ִ� Ŭ����
//������ ���� �Ǵ� �̸�������� ������ �� ��쿡 ���ɻ�
//������ ������ ������ϱ����� �޼ҵ带 �������� �ʴ´�
public class Test12 {
	public static void main(String[] args) {
		try {
			File f = new File("d:\\doc\\test1.txt");
			
			System.out.println("���� ����.....");
			System.out.println("���ϸ�: " + f.getName());
			System.out.println("����ũ��: " + f.length());
			System.out.println("���ϰ��: " + f.getAbsolutePath());
			System.out.println("ǥ�ذ��: " + f.getCanonicalPath());
			System.out.println("�ۼ���: " +	new Date(f.lastModified()));
			System.out.println("�����н�: " + f.getParent());
			System.out.println("�б�Ӽ�: " + f.canRead());
			System.out.println("����Ӽ�: " + f.canWrite());
			
			//���� ���α׷��� ���
			String p = System.getProperty("user.dir");
			System.out.println("���� ���: " + p);//d:\\java\\work\\demo
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

