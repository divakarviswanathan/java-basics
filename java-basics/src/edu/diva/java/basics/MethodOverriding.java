package edu.diva.java.basics;

class Base {
	public static String sing() {
		return "la";
	}
	public String sing1() {
		return "la1";
	}
}

class Sub extends Base {
	public static String sing() {
		return "fa";
	}
	
	public String sing1() {
		return "fa1";
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Sub a = new Sub();
		Base b = new Base();
		Base c = new Sub();
		System.out.println(c.sing()); 
		System.out.println(c.sing1()); //fa1
		System.out.println(a.sing() + b.sing()); //fala
		System.out.println(a.sing1() + b.sing1()); //fa1la1
	}
}
