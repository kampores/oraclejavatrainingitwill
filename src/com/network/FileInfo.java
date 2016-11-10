package com.network;
//20161108
import java.io.Serializable;

public class FileInfo implements Serializable{

	private static final long serialVersionUID = 7573495221314835425L;

	/*
		code
		100 : 파일전송 시작(파일명전송)
		110 : 파일내용 전송
		200 : 파일전송 종료(파일명전송)
		size : 전송 크기
		data : 전송 내용
	 */
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
