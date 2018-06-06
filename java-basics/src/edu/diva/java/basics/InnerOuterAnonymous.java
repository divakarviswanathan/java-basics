package edu.diva.java.basics;

interface Anonymous {
	public int getValue();
}

//What was the output of the program.
//I expected compile time exception at getData definition inside getData method 
// in inner declaration
//The compile time exception occurs actualy when we try to access that method

public class InnerOuterAnonymous {
	//IMPORTANT NOTE: The line 30 should be uncommented
	private int data = 15;
	public static void main(String[] args) {
		
		Anonymous inner = new Anonymous() {
			int data = 2;
			@Override
			public int getValue() {
				// TODO Auto-generated method stub
				return getData() + data;
			}
			public int getData() {
				return 10;
			}
		};

		InnerOuterAnonymous ioA = new InnerOuterAnonymous();
		//System.out.println(inner.getValue() + inner.getData()+ ioA.data);
	}

}
