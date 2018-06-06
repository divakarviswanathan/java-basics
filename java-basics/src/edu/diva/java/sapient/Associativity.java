package edu.diva.java.sapient;

public class Associativity {

	public static void main(String[] args) {
		int i = 2;
		int x[] = {1,2,3,4,5,6,7};
		x[i]=x[i=i++];
		System.out.println();
		for(int j =0 ; j <7;j++)
		System.out.print(x[j]);
		System.out.println();
		System.out.println(i);
		System.out.println(x[i]);
	}

}
