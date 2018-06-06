package edu.diva.java.sapient;

import java.util.TreeSet;

public class SetRuntimeException52 {

	public static void main(String[] args) {
		TreeSet s1 = new TreeSet();
		TreeSet subset = new TreeSet();
		for(int i = 604;i<617;i++)
			if(i%2 == 0) s1.add(i);
		subset = (TreeSet)s1.subSet(606, 613);
		s1.add(629);
		subset.add(629); //This throws a runt time exception key out of range
		System.out.println(s1 + ""+ subset);
		
	}

}
