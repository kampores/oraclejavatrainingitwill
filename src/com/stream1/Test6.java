package com.stream1;
//20161103
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
//��ü�� ����ȭ
//�޸𸮿��� ������ Ŭ���� ��ü�� ��������� ���¸� �״�� �����ؼ�
//���Ͽ� �����ϰų� ��Ʈ��ũ�� ���ؼ� ������ �� �ִ� ���
//������ ����Ʈ�����θ� ������ �ۼ����� ����

//����
//��ü��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ� ��ü�� ���Ͽ�
//���������ν� ���Ӽ��� ������ �� �ְ�, ��ü��ü�� ��Ʈ��ũ�� ����
//�ս��� ��ȯ�� �� �ִ�.

//implements Serializable����
public class Test6 {
	public static void main(String[] args) {
		try {
			Hashtable<String, String> h = new Hashtable<String, String>();
			
			h.put("1", "�����");
			h.put("2", "��ȿ��");
			h.put("3", "��ȿ��");//����ȭ
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(h);//���
			oos.close();
			fos.close();
			System.out.println("������¿Ϸ�!!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
