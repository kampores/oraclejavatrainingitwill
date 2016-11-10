package com.collection;
//20161028
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//List - ArrayList : 빠름,동기화안됨
//List - Vector : 느림,동기화됨
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
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
		lists1.add("인천");
		
		String str = lists1.get(0);
		System.out.println(str);
		
		str = lists1.get(2);
		System.out.println(str);
		
		int n = lists1.indexOf("부산");
		lists1.add(n+1,"광주");
		
		for (String c : lists1)
			System.out.print(c + " ");
		System.out.println();
		
		ArrayList<String> lists2 = new ArrayList<String>();
		
		lists2.add("자바프로그래머");
		lists2.add("자바");
		lists2.add("스트럿츠");
		lists2.add("서블릿");
		lists2.add("스프링");
		
		Iterator<String> it2 = lists2.iterator();
		while (it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("자바"))
				System.out.println(str);
		}
	}
}
