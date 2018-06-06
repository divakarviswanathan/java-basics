package edu.diva.java.basics;

public class MethodOverriding2 {

	//Ans: When a overridden method is called with null object, the method with more specific 
	//version of the method will be called.
	//In this example, Object is general version, whereas String is more specific version
	public static void main(String[] args) {
		MethodOverriding2 mo = new MethodOverriding2();
		mo.method(null);
	}

	public void method(int str) {
		System.out.println(str);
	}

	public void method(Object str) {
		System.out.println(str);
	}
	
	public void method(String str) {
		System.out.println(str);
	}

}
