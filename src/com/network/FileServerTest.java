package com.network;
//20161108
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest {
	private final int port = 5555;
	
	class WorkThread extends Thread{
		private Socket sc = null;
		public WorkThread(Socket sc){
			this.sc = sc;
		}
		
		@Override
		public void run() {
			try {
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
				System.out.println(sc.getInetAddress().getAddress() + "접속..");
				FileOutputStream fos = null;
				Object ob = null;
				
				while ((ob=ois.readObject())!=null) {
					if(ob instanceof FileInfo){
						FileInfo info = (FileInfo)ob;
						if(info.getCode()==100){
							String str = new String(info.getData());//파일명
							fos = new FileOutputStream(str);
							System.out.println(str + "파일 전송시작!!");
						}else if(info.getCode()==110){//파일내용 전송
							if(fos==null)
								break;
							fos.write(info.getData(), 0, info.getSize());
							System.out.println(info.getSize() + "bytes 받는중..");
						}else if(info.getCode()==200){//파일전송 종료
							if(fos==null)
								break;
							String str = new String(info.getData());//파일명
							fos.close();
							System.out.println(str + "파일 전송 끝!!");
						}
					}
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public void serverStart(){
		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.println("클라이언트 접속 대기중...");
			
			Socket sc = ss.accept();
			
			WorkThread wt = new WorkThread(sc);
			wt.start();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		new FileServerTest().serverStart();
	}
}
