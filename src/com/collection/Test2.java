package com.collection;
//20161028
import java.util.Hashtable;
import java.util.Iterator;

//Map<Ű,��>
//Map(I) - Hashtable(C) : Vector�� ����
//Map(I) - HashMap(C) : ArrayList�� ����

//Ű�� �ߺ����� ���� �� ����(Ű�� Set)
//Ű�� �ߺ����� ������ ������ �ȴ�
//Map�� Iterator�� ����(���� Set�� Iterator�� ��������)
//�Է�: put(Ű,��)
//���: get(Ű)

public class Test2 {
	public static final String name[] =
		{"�����","��ȿ��","������","õ����"};
	public static final String tel[] =
		{"111-111","222-222","111-111","444-444"};//������� ���������� �ٲ�
	
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();//<Key, Value>
		
		for(int i=0;i<name.length;i++)
			h.put(tel[i], name[i]);
		System.out.println(h);
		
		String str;
		
		//key�� value�� �˻�
		str = h.get("111-111");//key
		if(str==null)
			System.out.println("�ڷ����!!");
		else
			System.out.println(str);
		
		//Ű ���翩��
		if(h.containsKey("222-222"))
			System.out.println("222-222�� �ִ�...");
		else
			System.out.println("222-222�� ����...");
		
		//value ���翩��
		if(h.contains("������"))
			System.out.println("������ ���� �־��...");
		else
			System.out.println("������ ������...");
		
		//�����ͻ���
		h.remove("222-222");
		if(h.containsKey("222-222"))
			System.out.println("222-222�� �ִ�...");
		else
			System.out.println("222-222�� ����...");
		System.out.println(h);
		
		//Ű�� �ڷ���
		Iterator<String> it = h.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();//Ű
			String value =h.get(key);//value
			System.out.println(key + ":" + value);
		}
	}
}
