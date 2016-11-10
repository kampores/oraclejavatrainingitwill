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

public class ServerTest1 extends Frame implements ActionListener,Runnable{

	private static final long serialVersionUID = -8029413848722483074L;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;
	private final int port = 5555;

	public ServerTest1(){
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("ä�ü���");
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ServerTest1().serverStart();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Ŭ���̾�Ʈ���� �����͸� �����°�
		String str = tf.getText();
		
		if(str.trim().equals(""))
			return;
		if(sc==null)
			return;
		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true�� flush
			pw.println("����]" + str);
			ta.append("\r\n����]" + str);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			ta.append("\r\n Ŭ���̾�Ʈ ���� ����...");
			sc = null;
		}
	}

	@Override
	public void run() {
		//Ŭ���̾�Ʈ�� ���� �����͸� �޴°�
		String str;
		String ip;
		try {
			if(sc==null)//client���Ӿ���
				return;
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//client�� IP
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\n\r[" + ip + "]����!!");
			
			//client�� ���� �����͸� ���
			while ((str=br.readLine())!=null)
					ta.append("\r\n" + str);
		} catch (Exception e) {
			ta.append("\r\n Ŭ���̾�Ʈ ���� ����...");
			sc = null;//�翬��� �����Ⱚ ����Ƿ� �̸�����
			ss = null;
		}
	}
	
	public void serverStart(){
		try {
			//���������� ����
			ss = new ServerSocket(port);
			ta.setText("��������!...");
			
			//client�� �����ؿ��⸦ ��ٸ�
			sc = ss.accept();//client���� ���
			Thread th = new Thread(this);
			th.start();//runȣ��
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
