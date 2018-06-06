package edu.diva.java.sapient;

import java.util.TreeSet;

public class TreeSetRuntimeonSize {

	public static void main(String[] args) {
		TreeSet<Dog> dogs = new TreeSet<>();
		dogs.add(new Dog(1));
		dogs.add(new Dog(2));
		dogs.add(new Dog(1));
		System.out.println(dogs.size());
		
	}
}

class Dog{
	Dog(int i) {}
}
