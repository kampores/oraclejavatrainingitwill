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
			
			//MyData ob = new MyData("�����", 80);
			oos.writeObject(new MyData("�����", 80, "111"));
			oos.writeObject(new MyData("������", 70, "222"));
			oos.writeObject(new MyData("��ȿ��", 40, "333"));
			oos.writeObject(new MyData("õ����", 99, "444"));
			oos.close();
			fos.close();//����ȭ ��
			
			//������ȭ
			FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyData ob = null;

			try {
/*				while ((ob = (MyData) ois.readObject())!=null) //�����ڵ�
					System.out.println(ob.getName() + ":" + ob.getScore());
*/				while(true){
					ob = (MyData) ois.readObject();//->EOF �߻��� java.io.EOFException �߻��Ͽ� catch�� �̵�
/*					if(ob==null)	//->��������
						break;
*/					System.out.println(ob.getName() + ":" + ob.getScore() + ":" + ob.getPassword());
				}
			} catch (Exception e) {
				//System.out.println(e.toString());
				System.out.println("<End Of File>"); //�����ڵ�
			}
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
