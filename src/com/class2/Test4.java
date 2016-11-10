package com.class2;
//20161021
//되부름함수
//소스는 간단해짐
//처리속도는 느려짐(stack에 저장했다가 출력)

public class Test4 {

	public void print(int n){
		if(n!=1){
			print(n-1);//되부름함수
		}
		System.out.printf("%4d",n);
	}
	
	public int sum(int n){
		//1-10까지의 합
		return n>1?n+sum(n-1):n;
		//10+sum(9)
		//  9+sum(8)
		//    8+sum(7)...
	}
	
	public int pow(int a, int b){
		return b>=1?a*pow(a,b-1):1;
	}
	
	public static void main(String[] args) {
		Test4 ob = new Test4();
		ob.print(5);
		System.out.println();
		//-------------------
		int s = ob.sum(10);
		System.out.println(s);
		//-------------------
		System.out.println("pow(2,10): "+ob.pow(2,10));
	}
}
