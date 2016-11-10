package com.class6;
//20161027
import java.util.Vector;

class Cus{
	String name;
	int age;
}

public class Test7 {
	public static void main(String[] args) {
		Vector<Cus> v = new Vector<Cus>();
		
		Cus ob = new Cus();
		ob.name = "¼öÁö";
		ob.age = 24;
		v.add(ob);
		
		/*
		ob.name = "½ÅÇý";
		ob.age = 27;
		v.add(ob);
		*/
		
		ob = new Cus();
		ob.name = "½ÅÇý";
		ob.age = 27;
		v.add(ob);
		
		ob = new Cus();
		ob.name = "ÁÖ¿¬";
		ob.age = 37;
		v.add(ob);
		
		for(Cus c : v)
			System.out.println(c.name + ":" + c.age);
	}
}
