package edu.diva.java.basics;

public class ExceptionHandling {
String str = "a";
void C() throws Exception {
	throw new Exception();
}
void B() throws Exception {
	try {
		str += "d";
		C();
	} catch(Exception e) {
		throw new Exception();
	} finally {
		str += "e";
	}
	str += "f";
}
void A() {
	try {
		str += "b";
		B();
	} catch(Exception e) {
		str += "c";
	}
}

void display() {
	System.out.println(str);
}

public static void main(String[] args) {
	ExceptionHandling eh = new ExceptionHandling();
	eh.A();
	eh.display();
}
}
