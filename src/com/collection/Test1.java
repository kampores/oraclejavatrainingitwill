package com.collection;
//20161028
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//List - ArrayList : ����,����ȭ�ȵ�
//List - Vector : ����,����ȭ��
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		Iterator<String> it = lists.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		//ListIterator
		ListIterator<String> li = lists.listIterator();
		
		while(li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		
		while(li.hasPrevious())
			System.out.print(li.previous() + " ");
		System.out.println();
		
		List<String> lists1 = new ArrayList<String>();
		
		lists1.addAll(lists);
		lists1.add("��õ");
		
		String str = lists1.get(0);
		System.out.println(str);
		
		str = lists1.get(2);
		System.out.println(str);
		
		int n = lists1.indexOf("�λ�");
		lists1.add(n+1,"����");
		
		for (String c : lists1)
			System.out.print(c + " ");
		System.out.println();
		
		ArrayList<String> lists2 = new ArrayList<String>();
		
		lists2.add("�ڹ����α׷���");
		lists2.add("�ڹ�");
		lists2.add("��Ʈ����");
		lists2.add("����");
		lists2.add("������");
		
		Iterator<String> it2 = lists2.iterator();
		while (it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("�ڹ�"))
				System.out.println(str);
		}
	}
}
