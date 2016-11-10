package com.stream;
//20161102
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {
	public boolean fileCopy(String file1,String file2){
		File f = new File(file1);
		
		if(!f.exists())//파일이 없으면
			return false;
		
		try{
			FileInputStream fis = new FileInputStream(f);//file1
			FileOutputStream fos = new FileOutputStream(file2);
			
			int readBytes = 0;
			
			byte[] buffer = new byte[1024];//2의 배수여야 함
			
			while ((readBytes=fis.read(buffer, 0, buffer.length))!=-1)
				fos.write(buffer, 0, readBytes);
		
			fos.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Test8 ob = new Test8();
		
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out4.txt"))
			System.out.println("파일복사 성공!!");
		else
			System.out.println("파일복사 실패!!");
	}

}
