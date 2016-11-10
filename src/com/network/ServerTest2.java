package com.network;
//20161108
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerTest2 {
	private List<Socket> clients = new ArrayList<Socket>();
	private final int port = 5555;
	
	public void serverStart(){
		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.println("��������...");
			while (true) {
				Socket sc = ss.accept();
				WorkThread wt = new WorkThread(sc);
				wt.start();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	class WorkThread extends Thread{
		private Socket sc;
		
		public WorkThread(Socket sc) {
			this.sc = sc;
		}
		
		@Override
		public void run() {
			String ip = null;
			String msg = null;
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				//ip
				ip = sc.getInetAddress().getHostAddress();
				
				//������ client(sc)�� ����
				clients.add(sc);
				
				//�ٸ� client���� ���ӻ���� �˸�
				msg = ip + "]�� �����߽��ϴ�.";
				
				for (Socket s : clients) {
					if(s==sc)
						continue;//pass
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);
				}
				System.out.println(msg);
				
				while ((msg=br.readLine())!=null) {
					//���� ������ ���
					for (Socket s : clients) {
						if(s==sc)
							continue;//pass
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
					System.out.println(msg);
				}
			} catch (Exception e) {
				msg = ip + "]�� �����߽��ϴ�.";
				try {
					//���� ������ ���
					for (Socket s : clients) {
						if(s==sc)
							continue;//pass
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
					System.out.println(msg);
					sc = null;
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ServerTest2 ob = new ServerTest2();
		ob.serverStart();
	}
}
