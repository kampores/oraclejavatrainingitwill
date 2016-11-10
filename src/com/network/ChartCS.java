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
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
//UDP : 신뢰성없음, 전송속도 빠름
//내부 인트라넷
/*
class A,B,C
class D : 224.0.0.0~239.255.255.255
 */
public class ChartCS extends Frame implements ActionListener, Runnable{
	
	private static final long serialVersionUID = -8981936883863506728L;
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.8";
	private int port = 7777;
	private String userName = "김유상";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	/*
	DatagramSocket : UDP로 데이터그램 패킷을 전송하거나 수신
	DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터
	MulticastSocket : 다수의 클라이언트에 데이터를 전송
	 */
	
	public ChartCS(){
		ta.setEditable(false);
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("채팅");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();
	}
	
	public void setup(){
		try {
			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);
			
			//특정 그룹에 포함
			ms.joinGroup(xGroup);//같은 그룹
			
			Thread th = new Thread(this);
			th.start();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void disConnection(){
		try {
			//특정 그룹에서 빠져나옴
			ms.leaveGroup(xGroup);
			ms.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		new ChartCS().setup();
	}

	@Override
	public void run() {
		try {
			while (true) {
				byte[] buffer = new byte[512];
				
				//전송받을 패킷
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				//전송받음
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				
				ta.append(str + "\r\n");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disConnection();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();
		
		if(str.equals(""))
			return;
		byte[] buffer = (userName +"]" + str).getBytes();
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
			ms.send(dp);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			System.out.println(e2.toString());
		}
	}
}
