package com.class5;
//20161026
interface Test{
	public int total();
	public void write();
}

class TestImpl implements Test{
	private String hak,name;
	private int kor,eng;
	
	public TestImpl(){//기본생성자
		//TestImpl ob = new TestImpl();
	}
	
	//생성자 오버로딩
	public TestImpl(String hak,String name,int kor,int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//TestImpl ob = new TestImpl(111,suzi,60,90);
	}
	
	//초기화메소드
	public void set(String hak,String name,int kor,int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(hak + "," + name + total());
	}

	@Override
	public boolean equals(Object ob) {//Upcast //ob1.equals(ob2)-TestImpl
		boolean flag = false;
		
		if(ob instanceof TestImpl){//A instanceof B: A속에 B가 있냐
			TestImpl t = (TestImpl)ob;//Downcast
			if(this.hak.equals(t.hak)&&this.name.equals(t.name))
				flag = true;
		}
		return flag;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Test ob1 = new TestImpl("111", "배수지", 80, 90);
		Test ob2 = new TestImpl("111", "배수지", 100, 100);
		
		if(ob1.equals(ob2))//TestImpl꺼
			System.out.println("ob1과 ob2는 동일인물!!");
		else
			System.out.println("ob1과 ob2는 다른인물!!");
		
		ob1.write();//111,배수지170
		ob2.write();//111,배수지200
	}
}
