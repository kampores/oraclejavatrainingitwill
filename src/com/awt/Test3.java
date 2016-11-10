package com.awt;
//20161104
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame{

	private static final long serialVersionUID = 8487456119857387827L;

	public Test3(){
		setTitle("À©µµ¿ì");
		setSize(200, 300);
		addWindowListener(new MyAdapter());
		setVisible(true);
	}
	
	class MyAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Test3();
	}
}
