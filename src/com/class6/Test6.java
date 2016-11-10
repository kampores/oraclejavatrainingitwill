package com.class6;
//20161027
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test6 {
	private static final String[] city =
		{"����","�λ�","�뱸","��õ","����","����","���"};
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		System.out.println("���� �ʱⷮ: " + v.capacity());
		//v=10;
		for(String c : city)
			v.add(c);
		
		String str;
		
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		System.out.println(v.size());
		
		//----------------------------
		for(int i=0;i<v.size();i++)
			System.out.print(v.get(i) + " ");
		System.out.println();
		
		//----------------------------
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//----------------------------
		//�ݺ���
		Iterator<String> it = v.iterator();
		
		while (it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		while (it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		System.out.println("���� �ʱⷮ: " + v.capacity());//10
		System.out.println("����� ����: " + v.size());//7
		/*v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		System.out.println("����� ����: " + v.size());//11
		System.out.println("���� �ʱⷮ: " + v.capacity());//20
		*/
		
		//����
		v.set(0,"Seoul");
		v.set(1,"Busan");
		
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//����
		v.insertElementAt("���ѹα�", 0);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//�˻�
		int index = v.indexOf("�뱸");
		if(index!=-1)
			System.out.println("�˻�����:" + index);
		else
			System.out.println("�˻�����:" + index);
		
		//������������(1~10,��~��)
		Collections.sort(v);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//������������(10~1,Z~A)
		Collections.sort(v, Collections.reverseOrder());
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		index = Collections.binarySearch(v, "Busan", Collections.reverseOrder());
		
		System.out.println("Busan : " + index + "��ġ�� ����");
		
		//����
		v.remove("Busan");
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//�뷮����
		for (int i = 1; i <= 20; i++)
			v.add(Integer.toString(i));
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		System.out.println("���� ����: " + v.capacity());//40
		System.out.println("����� ����: " + v.size());//27
		
		//Ư������ ����
		for (int i = 1; i <= 10; i++)
			v.remove(5);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		System.out.println("���� ����: " + v.capacity());//40
		System.out.println("����� ����: " + v.size());//17
		
		//vector�� ������� trim
		v.trimToSize();
		System.out.println("���� ����: " + v.capacity());//17
		System.out.println("����� ����: " + v.size());//17
		
		//��ü����
		v.clear();
		System.out.println("���� ����: " + v.capacity());//0
		System.out.println("����� ����: " + v.size());//17
		
		//vector�� ������� trim
		v.trimToSize();
		System.out.println("���� ����: " + v.capacity());//0
		System.out.println("����� ����: " + v.size());//0
	}
}
