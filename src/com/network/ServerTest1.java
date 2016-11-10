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
		setTitle("채팅서버");
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ServerTest1().serverStart();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//클라이언트에게 데이터를 보내는곳
		String str = tf.getText();
		
		if(str.trim().equals(""))
			return;
		if(sc==null)
			return;
		try {
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);//true는 flush
			pw.println("서버]" + str);
			ta.append("\r\n서버]" + str);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			ta.append("\r\n 클라이언트 연결 종료...");
			sc = null;
		}
	}

	@Override
	public void run() {
		//클라이언트가 보낸 데이터를 받는곳
		String str;
		String ip;
		try {
			if(sc==null)//client접속안함
				return;
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//client의 IP
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\n\r[" + ip + "]접속!!");
			
			//client가 보낸 데이터를 출력
			while ((str=br.readLine())!=null)
					ta.append("\r\n" + str);
		} catch (Exception e) {
			ta.append("\r\n 클라이언트 연결 종료...");
			sc = null;//재연결시 쓰레기값 생기므로 미리제거
			ss = null;
		}
	}
	
	public void serverStart(){
		try {
			//서버소켓을 생성
			ss = new ServerSocket(port);
			ta.setText("서버시작!...");
			
			//client가 접속해오기를 기다림
			sc = ss.accept();//client접속 허용
			Thread th = new Thread(this);
			th.start();//run호출
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
