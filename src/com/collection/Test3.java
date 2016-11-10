package com.collection;
//20161028
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {
	public static void main(String[] args) {
		//Set : �ߺ��� ������� ����
		
		Set<String> s = new HashSet<String>();
		
		s.add("����");
		s.add("�λ�");
		s.add("�뱸");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		//�ߺ�������
		s.add("����");
		System.out.println(s);
		
		//------------------------------------
		
		//Stack
		Stack<String> st = new Stack<String>();
		
		st.push("����");
		st.push("�λ�");
		st.push("�뱸");
		
		while(!st.empty())
			System.out.println(st.pop());
		//------------------------------------
		//Queue
		Queue<String> q = new LinkedList<String>();
		
		q.add("����");
		q.add("�λ�");
		q.add("�뱸");
		q.add("����");
		
		while(q.peek()!=null)
			System.out.print(q.poll() + " ");
		System.out.println();
		//------------------------------------
		List<String> lists1 = new LinkedList<String>();
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");
		
		List<String> lists2 = new LinkedList<String>();
		lists2.add("����");
		lists2.add("�λ�");
		lists2.add("�뱸");
		
		lists2.addAll(lists1);
		
		System.out.println("lists1...");
		for(String ss : lists1)
			System.out.print(ss + " ");
		System.out.println();
		
		System.out.println("lists2...");
		for(String ss : lists2)
			System.out.print(ss + " ");
		System.out.println();
		
		lists2.subList(2, 5).clear();
		for(String ss : lists2)
			System.out.print(ss + " ");
		System.out.println();
		
		String[] str = {"��","��","��","��","��","��"};
		for(String ss : str)
			System.out.print(ss + " ");
		System.out.println();
		
		Arrays.sort(str);
		for(String ss : str)
			System.out.print(ss + " ");
		System.out.println();
	}
}
