package edu.diva.java.basics;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(4);
		a.add(3);
		ArrayList<Integer> b = (ArrayList<Integer>) a.clone();
		b.add(1);
		System.out.println(b);
		System.out.println(a);
		b.remove(1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.equals(a));
		
		
	}
}
