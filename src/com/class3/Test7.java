package com.class3;
//20161024
public class Test7 {
	public static void main(String[] args) {
		String s1 = "����,�λ�,�뱸";
		String[] ss = s1.split(",");
		for(String s : ss)
			System.out.print(s + " ");
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "SeOuL";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		String s4 = "abc.def.ghi";
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//-1
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		
		String s6 = s5.replaceAll("����","����");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());//����յڰ�������
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));// \\s:����
		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);//c
		
		System.out.println("abcdefg".startsWith("abc"));
		System.out.println("�ڹ����α׷�".startsWith("�ڹ�"));
		
		System.out.println("abcdefg".length());//7
		
		String s8 = "abcdefg";//e�ƽ�Ű�ڵ� : 101
		String s9 = "abcdffg";//f�ƽ�Ű�ڵ� : 102
		
		//����������
		System.out.println(s8.compareTo(s9));//-1
		System.out.println(s9.compareTo(s8));//1
		
	}
}
