package com.network;
//20161107
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test2 extends Frame implements ActionListener{

	private static final long serialVersionUID = 9153777851462352800L;

	private TextArea ta;
	private TextField tf;
	
	public Test2() {
		ta = new TextArea();
		add(ta);
		
		tf = new TextField();
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("HTML Viewer");
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String str;
			URL url = new URL(tf.getText());
			ta.setText("");
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			while ((str=br.readLine())!=null) {
				if(ta.getText().equals(""))
					ta.setText(str);
				else ta.setText(ta.getText() + "\n\r" + str);
			}
			is.close();
				
		
		} catch (Exception e2) {
			System.out.println(e.toString());
		}
	}
}
