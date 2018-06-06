package edu.diva.java.sapient;

import java.util.List;

public class SpotTheError {

	public static void main(String[] args) {
		
	}
	
	public static<E> void append(List<E> list) {
		E elem = new E();
		list.add(elem);
	}
}
