package com.stream;
//20161102
import java.io.File;
import java.io.FileFilter;

//FileFilter 인터페이스 -> 디렉토리 내용을 가져옴
class MyFileList implements FileFilter{
	private File f;

	public MyFileList(String filePath) {
		f = new File(filePath);
	}
	
	public void result(){
		try {
			if(!f.exists()){
				System.out.println("파일이 존재하지 않습니다!");
				return;
			}
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("파일크기: " + f.length());
			
			//폴더인경우
			if(f.isDirectory()){
				File[] lists = f.listFiles(this);
				
				System.out.println("\n폴더의 내용...");
				for(int i=0;i<lists.length;i++){
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			System.out.println("\n디렉토리 구조...");
			
			File[] root = File.listRoots();
			for (int i = 0; i < root.length; i++)
				System.out.println(root[i].getPath());
			//C:
			//D:
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public boolean accept(File pathname) {
		return pathname.isFile()||pathname.isDirectory();//폴더,파일
	}
}

public class Test14 {
	public static void main(String[] args) {
		MyFileList mf = new MyFileList("d:\\doc");
		mf.result();
	}
}
