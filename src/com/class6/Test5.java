package com.class6;
//20161027
import java.util.Vector;

//Collection Framework(방법론)
//List(I)-ArrayList(C):비동기,Vector(C):동기
//Map(I)-HashTable(C):비동기,HashMap(C):동기

//자료형-배열
//단점
//Resize가 불가능
//메모리낭비
//중간삽입이 불가능
public class Test5 {
	//Collection은 자료형이 기본 Object이다
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("서울");//upcast
		v.add(30);
		v.add('A');
		
		String str = (String) v.get(0);//downcast
		System.out.println(str);
		
		Integer i = (Integer) v.get(1);
		System.out.println(i);
		
		char c = (char) v.get(2);
		System.out.println(c);		
	}
}
