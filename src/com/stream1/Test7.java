package com.stream1;
//20161103
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test7 {
	public static void main(String[] args) {
		try {
			//역직렬화
			FileInputStream	fis = new FileInputStream("d:\\doc\\out10.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Hashtable<String, String> h = (Hashtable<String, String>) ois.readObject();
			Iterator<String> it = h.keySet().iterator();
			
			while (it.hasNext()) {
				String key = it.next();
				String value = h.get(key);
				System.out.println(key + ":" + value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
