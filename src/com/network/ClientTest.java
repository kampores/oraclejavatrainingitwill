package com.network;
//20161108
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
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest extends Frame implements ActionListener,Runnable{

	private static final long serialVersionUID = -8029413848722483074L;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private final int port = 5555;
	private String host = "192.168.16.0";

	public ClientTest(){
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("ä��Ŭ���̾�Ʈ");
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClientTest().connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//�������� �����͸� �����°�
		String str = tf.getText();
		
		if(str.trim().equals(""))
			return;
		if(sc==null)
			return;
		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true�� flush
			pw.println("������]" + str);
			ta.append("\r\n������]" + str);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			ta.append("\r\n ���� ���� ����...");
			sc = null;
		}
	}

	@Override
	public void run() {
		//������ ���� �����͸� �޴°�
		String str;
		try {
			if(sc==null)//server���Ӿ���
				return;
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//������ ���� �����͸� ���
			while ((str=br.readLine())!=null)
					ta.append("\r\n" + str);
		} catch (Exception e) {
			ta.append("\r\n ���� ���� ����...");
			sc = null;//�翬��� �����Ⱚ ����Ƿ� �̸�����
		}
	}
	
	public void connect(){
		try {
			sc = new Socket(host, port);
			Thread th = new Thread(this);
			th.start();//runȣ��
		} catch (Exception e) {
			ta.setText("������ �׾��ִ�...");
		}
	}
}
