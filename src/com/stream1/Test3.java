package com.stream1;
//20161103
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//FileWriter
//����� �����ڵ� ���ڿ��� �ý��ۿ� �´� ����Ʈ ���� ���ڵ���
//����Ʈ�� ��ȯ�ؼ� ���Ͽ� �����ϴ� ������ �Ѵ�

//BufferedWriter
//���ͽ�Ʈ������ �ٸ� ��½�Ʈ���� �������� ���ڷ� �޾� �����ϸ�
//���ڸ� ���۸� �ϴ� �Ϳ����� ����,�迭 �Ǵ� String�� ���� ���·�
//��� stream�� ����Ѵ�
public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("d:\\doc\\out8.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str;
		
		System.out.println("���ڿ��Է�: ");
		while ((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();//str + ����(\r\n)
		}
		bw.close();
		fw.close();
		//----------------------------------------
		FileReader fr = new FileReader("d:\\doc\\out8.txt");
		BufferedReader br1 = new BufferedReader(fr);
		
		try {
			String str1;
			while ((str1=br1.readLine())!=null)
				System.out.println(str1);
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
