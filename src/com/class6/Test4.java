package com.class6;
//20161027

//4.����Ŭ����(Anonymous,�͸�,������ Ŭ����)
public class Test4 {
	public Object getTitle(){
		//�ڵ�
		return new Object(){
			@Override
			public String toString() {
				return "�͸��� Ŭ����!";
			}
		};
	}

	public static void main(String[] args) {
		Test4 ob = new Test4();
		
		System.out.println(ob.getTitle());
	}
}
