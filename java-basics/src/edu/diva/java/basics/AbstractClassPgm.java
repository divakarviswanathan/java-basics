package edu.diva.java.basics;

abstract class demo {
	public int a;
	demo() {
		a = 10;
	}
	abstract public void set(int a);
	//abstract final public void get(); //(You can never declare an abstract method final
	abstract public void get();
}
public class AbstractClassPgm extends demo{

	
	@Override
	public void set(int a) {
		this.a= a;
	}

	@Override
	public void get() {
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		AbstractClassPgm acp = new AbstractClassPgm();
		acp.set(20);
		acp.get();
	}
}
