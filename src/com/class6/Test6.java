package com.class6;
//20161027
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test6 {
	private static final String[] city =
		{"서울","부산","대구","인천","광주","대전","울산"};
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		System.out.println("벡터 초기량: " + v.capacity());
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
		//반복자
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
		
		System.out.println("벡터 초기량: " + v.capacity());//10
		System.out.println("요소의 갯수: " + v.size());//7
		/*v.add("aa");
		v.add("bb");
		v.add("cc");
		v.add("dd");
		System.out.println("요소의 갯수: " + v.size());//11
		System.out.println("벡터 초기량: " + v.capacity());//20
		*/
		
		//수정
		v.set(0,"Seoul");
		v.set(1,"Busan");
		
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//삽입
		v.insertElementAt("대한민국", 0);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//검색
		int index = v.indexOf("대구");
		if(index!=-1)
			System.out.println("검색성공:" + index);
		else
			System.out.println("검색실패:" + index);
		
		//오름차순정렬(1~10,ㄱ~ㅎ)
		Collections.sort(v);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//내림차순정렬(10~1,Z~A)
		Collections.sort(v, Collections.reverseOrder());
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		index = Collections.binarySearch(v, "Busan", Collections.reverseOrder());
		
		System.out.println("Busan : " + index + "위치에 있음");
		
		//삭제
		v.remove("Busan");
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		
		//용량증가
		for (int i = 1; i <= 20; i++)
			v.add(Integer.toString(i));
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		System.out.println("벡터 갯수: " + v.capacity());//40
		System.out.println("요소의 갯수: " + v.size());//27
		
		//특정범위 삭제
		for (int i = 1; i <= 10; i++)
			v.remove(5);
		for (String c : v) 
			System.out.print(c + " ");
		System.out.println();
		System.out.println("벡터 갯수: " + v.capacity());//40
		System.out.println("요소의 갯수: " + v.size());//17
		
		//vector의 빈공간을 trim
		v.trimToSize();
		System.out.println("벡터 갯수: " + v.capacity());//17
		System.out.println("요소의 갯수: " + v.size());//17
		
		//전체삭제
		v.clear();
		System.out.println("벡터 갯수: " + v.capacity());//0
		System.out.println("요소의 갯수: " + v.size());//17
		
		//vector의 빈공간을 trim
		v.trimToSize();
		System.out.println("벡터 갯수: " + v.capacity());//0
		System.out.println("요소의 갯수: " + v.size());//0
	}
}
