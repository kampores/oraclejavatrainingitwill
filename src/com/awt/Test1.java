package com.awt;
//20161104
import java.awt.Color;
import java.awt.Frame;
//AWT(Abstract Window Toolkit)
//Swing
public class Test1 extends Frame{

	private static final long serialVersionUID = -7198899483113126706L;

	public Test1(){
		this.setTitle("�ڹ�������");
		setSize(200, 300);
		setBackground(new Color(255, 255, 0));

		setVisible(true);
	}
	
	public static void main(String[] args) {
		//Test1 ob = new Test1();
		new Test1();//<-â �ȴ����Ƿ� �������� �ʿ�
	}
}
