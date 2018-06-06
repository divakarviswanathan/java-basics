package edu.diva.java.multithreading;

class Big extends Thread {
	
	public Big(Runnable ren) {
		super(ren);
	}
	
	public void run() {
		System.out.println("Big");
	}
}

class small extends Thread {
	public void run() {
		System.out.println("Small");
	}
	
}
public class BigSmallThreads {

	public static void main(String[] args) {
		Thread t1 = new Big(new small());
		t1.start();
	}
}
