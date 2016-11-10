package com.class5;
//20161026
interface Test{
	public int total();
	public void write();
}

class TestImpl implements Test{
	private String hak,name;
	private int kor,eng;
	
	public TestImpl(){//�⺻������
		//TestImpl ob = new TestImpl();
	}
	
	//������ �����ε�
	public TestImpl(String hak,String name,int kor,int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//TestImpl ob = new TestImpl(111,suzi,60,90);
	}
	
	//�ʱ�ȭ�޼ҵ�
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
		
		if(ob instanceof TestImpl){//A instanceof B: A�ӿ� B�� �ֳ�
			TestImpl t = (TestImpl)ob;//Downcast
			if(this.hak.equals(t.hak)&&this.name.equals(t.name))
				flag = true;
		}
		return flag;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Test ob1 = new TestImpl("111", "�����", 80, 90);
		Test ob2 = new TestImpl("111", "�����", 100, 100);
		
		if(ob1.equals(ob2))//TestImpl��
			System.out.println("ob1�� ob2�� �����ι�!!");
		else
			System.out.println("ob1�� ob2�� �ٸ��ι�!!");
		
		ob1.write();//111,�����170
		ob2.write();//111,�����200
	}
}
