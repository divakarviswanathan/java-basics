package edu.diva.java.basics;

interface A {}
class B {}
class c extends B implements A {}
class d implements A{}
//Given the above class definitions which of the below assignment is correct
//Learnt that an object should be declared of super type for being able to be assigned

public class VariableAssignments {

	public static void main(String[] args) {
		B b = new B();
		c c = new c();
		d d = new d();
		//IMPORTANT NOTE: Uncomment following lines
		/*c = d;
		d = c;
		A a = d;
		d = (d) c;*/
	}
	
}
