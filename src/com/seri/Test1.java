package com.seri;
//20161103
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
//Externalizable 인터페이스
//writeExternal(), readExternal()
class DataTest implements Externalizable{

	String name;
	int age;
	
	public DataTest() {}

	public DataTest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String)in.readObject();
		age = in.readInt();
		System.out.println("readExternal...");
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name + "방가..");//세부작업가능
		out.writeInt(age);
		System.out.println("writeExternal...");
	}
}

public class Test1 {
	public static void main(String[] args) {
		try {
			DataTest ob = new DataTest("홍길동", 30);
			FileOutputStream fos = new FileOutputStream("d:\\doc\\data1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\data1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			DataTest t = (DataTest)ois.readObject(); //<-DataTest 기본생성자 필요
			System.out.println(t.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
