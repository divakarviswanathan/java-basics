package edu.diva.java.basics;


public class StaticVariablesInnerClass {

	public static int t1 = 1;
	private static int t2 = 2;
	public int t3= 3;
	private int t4 = 4;
	
	public static class inner {
		private static int t5 = 5;
		
		private static int getSum() {
			//return t1+ t2 + t3 + t4 + t5;
			return 0;
		}
	}
	//IMPORTANT NOTE: Uncomment line 15 and remove line 16
	public static void main(String[] args) {
		
		StaticVariablesInnerClass.inner obj = new StaticVariablesInnerClass.inner();
		obj.getSum();
	}
}
