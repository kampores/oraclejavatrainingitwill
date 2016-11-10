package com.class5;
//20161026
import java.util.Scanner;

interface FruitA{
	String Won = "원";
	
	public int getPrice();
	public String getName();
}

interface ItemFruit extends FruitA{
	public String getItems();
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
}

public class Test5 {
	public void packing(ItemFruit ob){
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();
		
		System.out.print("1.사과 2.오렌지?");
		int n = sc.nextInt();
		
		if(n==1)
			t.packing(new Apple());
		else if(n==2)
			t.packing(new Orange());
		
		/*
		ItemFruit ob;
		
		ob = new Orange();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		ob = new Apple();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		int a;
		a = 10;
		System.out.println(a);
		
		a = 20;
		System.out.println(a);*/
	}
}
