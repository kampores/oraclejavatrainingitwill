package com.awt2;
//20161107
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//replaceAll
public class Test8 {
	public static String replaceAll(String str, String oldStr, String newStr){
		if(str==null)
			return null;
		Pattern p = Pattern.compile(oldStr);
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		//���ѹα� ���ѹα�
		while (m.find()) 
			m.appendReplacement(sb, newStr);
		m.appendTail(sb);//<-������ ������ "�α�"�� �ȳ���
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "�츮���� ���ѹα� ���ѹα�";
		String s = Test8.replaceAll(str, "����", "����");
		
		System.out.println(s);
	}
}
