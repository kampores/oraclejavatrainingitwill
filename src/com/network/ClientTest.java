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
		setTitle("채팅클라이언트");
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClientTest().connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//서버에게 데이터를 보내는곳
		String str = tf.getText();
		
		if(str.trim().equals(""))
			return;
		if(sc==null)
			return;
		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true는 flush
			pw.println("김유상]" + str);
			ta.append("\r\n김유상]" + str);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			ta.append("\r\n 서버 연결 종료...");
			sc = null;
		}
	}

	@Override
	public void run() {
		//서버가 보낸 데이터를 받는곳
		String str;
		try {
			if(sc==null)//server접속안함
				return;
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//서버가 보낸 데이터를 출력
			while ((str=br.readLine())!=null)
					ta.append("\r\n" + str);
		} catch (Exception e) {
			ta.append("\r\n 서버 연결 종료...");
			sc = null;//재연결시 쓰레기값 생기므로 미리제거
		}
	}
	
	public void connect(){
		try {
			sc = new Socket(host, port);
			Thread th = new Thread(this);
			th.start();//run호출
		} catch (Exception e) {
			ta.setText("서버가 죽어있다...");
		}
	}
}
