package com.collection;
//20161028
import java.util.Hashtable;
import java.util.Iterator;

//Map<키,값>
//Map(I) - Hashtable(C) : Vector와 동일
//Map(I) - HashMap(C) : ArrayList와 동일

//키는 중복값을 가질 수 없다(키는 Set)
//키가 중복값을 가지면 수정이 된다
//Map은 Iterator가 없다(사촌 Set의 Iterator를 빌려쓴다)
//입력: put(키,값)
//출력: get(키)

public class Test2 {
	public static final String name[] =
		{"배수지","한효주","전지현","천송이"};
	public static final String tel[] =
		{"111-111","222-222","111-111","444-444"};//배수지가 전지현으로 바뀜
	
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();//<Key, Value>
		
		for(int i=0;i<name.length;i++)
			h.put(tel[i], name[i]);
		System.out.println(h);
		
		String str;
		
		//key로 value를 검색
		str = h.get("111-111");//key
		if(str==null)
			System.out.println("자료없음!!");
		else
			System.out.println(str);
		
		//키 존재여부
		if(h.containsKey("222-222"))
			System.out.println("222-222가 있다...");
		else
			System.out.println("222-222가 없다...");
		
		//value 존재여부
		if(h.contains("전지현"))
			System.out.println("지현이 여기 있어요...");
		else
			System.out.println("지현이 외출중...");
		
		//데이터삭제
		h.remove("222-222");
		if(h.containsKey("222-222"))
			System.out.println("222-222가 있다...");
		else
			System.out.println("222-222가 없다...");
		System.out.println(h);
		
		//키의 자료형
		Iterator<String> it = h.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();//키
			String value =h.get(key);//value
			System.out.println(key + ":" + value);
		}
	}
}
