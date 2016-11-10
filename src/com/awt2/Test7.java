package com.awt2;
//20161107
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//java.util.regex
//����ȭ ǥ������ �ٷ�� ���� Ŭ����
//�뵵: �ܾ�ġȯ, �����ּ� �˻�, ���Ͽ��� ����� ����, �˻�
/*
c[a-z]* : c�� �����ϴ� ���ܾ�(c,ca,caaa)
c[a-z]  : c�� �����ϴ� �α����� ���ܾ�(ca,cb)
c[a-zA-Z0-9] : ca,cA,c4 ...
c.  : c�� �����ϴ� �α���(ca,cB,c&)
c.* : c�� �����ϴ� ��� ����(caaa,c45f)
c.*t: ct,chhht,c77777t
[b|c].* �Ǵ� [^bc].* �Ǵ� [^b-c].* : b �Ǵ� c�� �������� �ʴ� ����
.*c.* : c�� ���Ե� ��� ���ڿ�

[\\d]+ �Ǵ� [0-9]+ : �ϳ� �̻��� ����
 
 */
public class Test7 {
	public static void main(String[] args) {
		String[] str = {"bat","baby","bonus","c","cA","ca","c.","c0",
				"car","combat","count","date","disc"};
		Pattern p;
		
		//c�� �����ϴ� �� ���� �̻�
		p = Pattern.compile("c[a-z]*");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}

		System.out.println("------------------------------------");
		//c�� �����ϴ� �ι��� �̻�
		p = Pattern.compile("c[a-z]+");
		//p = Pattern.compile("c[^a]+");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}
		
		System.out.println("------------------------------------");
		//c�� �����ϴ� �ι��� �̻�
		p = Pattern.compile("c.");
		for (String s : str) {
			Matcher m = p.matcher(s);
			if(m.matches())
				System.out.println(s);
		}

		//���� Ȯ��
		String[] mails = {"aaa@aaa.com","@aaaa.co.kr",".@bbb.com",
				"aaa@bbb.co.kr","aaa.co.kr","abc@abc"};
		
		//[\\w]+ : �ѱ��� �̻��� ��,����
		//@
		//(\\.[\\w]+) : ��ȣ�ȿ� �ִ°��� �ݵ�� �ѹ��� ���
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//<- +�� ������
		
		for (String s : mails) 
			if(Pattern.matches(pat, s))
				System.out.println(s);
	}
}
