package com.class2;
//20161021
public class Test5 {

	//비정형인수
	
	public int sum(int...args){
		int sum=0;
		
		for(int i=0;i<args.length;i++){
			sum+=args[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Test5 ob = new Test5();
		
		int result;
		
		result = ob.sum(2,4,6,8,10);
		System.out.println(result);
		
		result = ob.sum(1,3,5,7,9,11,13,15,17,19);
		System.out.println(result);
		
		result = ob.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println(result);
	}

}
