package com.class3;
//20161024

//String : String은 클래스(자료형이 아님)
//저장할 데이터는 크고 사용빈도는 높기때문에
//String은 불변의 법칙을 가지고있다
public class Test4 {

	public static void main(String[] args) {
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1==ob2: " + (ob1==ob2));//true : Heap에 "Seoul"을 추가로 만들지 않음
		System.out.println("ob1==ob3: " + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//true
		
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap에 "korea"를 만들고 연결(String은 Heap을 삭제안함)
		
		ob2 = "USA";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap에 "USA"를 만들고 연결("korea"는 쓰레기값으로 남음. Garbage Collector가 알아서 처리)
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false : Heap에 "japan"을 만들고 연결("USA"는 쓰레기값으로 남음. Garbage Collector가 알아서 처리)
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));//true : Heap에 새로 "Seoul"을 만들지 않고 있던 "Seoul"에 연결
		
		System.out.println(ob1);//Seoul
		System.out.println(ob1.toString());//Seoul
		
		int a = 10;
		System.out.println(a);
	}

}
