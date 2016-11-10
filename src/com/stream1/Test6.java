package com.stream1;
//20161103
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
//객체의 직렬화
//메모리에서 생성된 클래스 객체의 멤버변수의 상태를 그대로 보존해서
//파일에 저장하거나 네트워크를 통해서 전달할 수 있는 기능
//오로지 바이트단위로만 데이터 송수신이 가능

//장점
//객체자체의 내용을 입출력 형식에 구애받지 않고 객체를 파일에
//저장함으로써 영속성을 제공할 수 있고, 객체자체를 네트워크를 통해
//손쉽게 교환할 수 있다.

//implements Serializable구현
public class Test6 {
	public static void main(String[] args) {
		try {
			Hashtable<String, String> h = new Hashtable<String, String>();
			
			h.put("1", "배수지");
			h.put("2", "이효리");
			h.put("3", "한효주");//직렬화
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(h);//출력
			oos.close();
			fos.close();
			System.out.println("파일출력완료!!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
