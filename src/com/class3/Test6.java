package com.class3;
//20161024
public class Test6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("����");
		sb.append("�λ�");
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		int a=24;
		System.out.println(a);
		System.out.println(Integer.toString(a));//���ڷ����
		System.out.println(Integer.toString(a,2));//2������ ���
		System.out.println(Integer.toString(a,16));//16������ ���
		
	}
}
