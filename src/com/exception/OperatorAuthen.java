package com.exception;
//20161031
public class OperatorAuthen {
	public void inputFormat(String str) throws MyException{
		String temp[] = str.split(",");
		
		if(temp.length!=2)
			throw new MyException("숫자입력오류!!:" + str);
	}
	
	@SuppressWarnings("unused")
	public void number(String str) throws MyException{
		try {
			if(str.indexOf(".")!=-1){
				double num = Double.parseDouble(str);
			}else{
				int num = Integer.parseInt(str);
			}
		} catch (NumberFormatException e) {
			throw new MyException("숫자 변환 불가!!" + str);
		}
	}
	
	public void operator(char ch) throws MyException{
		switch(ch){
		case '+': case '-': case '*': case '/':
			return;
		default:
			throw new MyException("연산자 오류!!:" + ch);
		}
	}
}
