package edu.diva.java.basics;

public class VariableAccess {

	/*
	 * Question which of the lines inside run will not throw an error? Ans flag=false;
	 * private static boolean flag = true;
	private int x = 0;
	private void doSomething() {};
	
	public static void run() {
		flag = false;
		x++;
		this.doSomething();
		doSomethings();
	}*/
	
	public static void main(String[] args) {
		
		//When it comes to operator precedence there is something called associativity. 
		//Associativity means the order of execution when the same operator comes in a row of operations
		//Eg: 4 / 2 /3 (as / operator follows left associativity) it will be executed as follows
		//(4/2) / 3 = 2 /3 = 0
		//Except the below set of operators every other operator in java follows left to right assiciativity
		//Right to left associativity: Unary operators(pre and post increment, ~ 1) and ternary operator and 
		//assignment operations like *= += -= /= %=
		int value = 3, sum = 6 + --value; //sum = 8, value = 2
		System.out.println(sum + "" + value);
		int data = --value + ++value / sum++ * value++ + ++sum % value--; //  2+3 /10 * 2 + 9%1 = 2 + 0 + 0 = 2 
		
		
		System.out.println(data);
	}

}
