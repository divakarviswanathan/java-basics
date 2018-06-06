package edu.diva.java.basics;


interface int1 {
	void method1();
}

interface int2 {
	void method1();
}
public class DiamondProblem implements int1, int2 {

	@Override
	public void method1() {
		System.out.println("method1");		
	}
	
	public static void main(String[] args) {
		int1 dp = new DiamondProblem();
		dp.method1();
		int2 dp2 = (int2) dp;
		dp2.method1();
	}

}
