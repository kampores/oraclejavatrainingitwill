package com.seri;
//20161103
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataMain {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//MyData ob = new MyData("배수지", 80);
			oos.writeObject(new MyData("배수지", 80, "111"));
			oos.writeObject(new MyData("전지현", 70, "222"));
			oos.writeObject(new MyData("이효리", 40, "333"));
			oos.writeObject(new MyData("천송이", 99, "444"));
			oos.close();
			fos.close();//직렬화 끝
			
			//역직렬화
			FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyData ob = null;

			try {
/*				while ((ob = (MyData) ois.readObject())!=null) //개인코드
					System.out.println(ob.getName() + ":" + ob.getScore());
*/				while(true){
					ob = (MyData) ois.readObject();//->EOF 발생시 java.io.EOFException 발생하여 catch로 이동
/*					if(ob==null)	//->생략가능
						break;
*/					System.out.println(ob.getName() + ":" + ob.getScore() + ":" + ob.getPassword());
				}
			} catch (Exception e) {
				//System.out.println(e.toString());
				System.out.println("<End Of File>"); //개인코드
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
