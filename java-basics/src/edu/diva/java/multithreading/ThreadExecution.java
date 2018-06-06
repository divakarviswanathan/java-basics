package edu.diva.java.multithreading;

public class ThreadExecution implements Runnable {

	public static void main(String[] args) {
		ThreadExecution te = new ThreadExecution();
		Thread t = new Thread(te);
		t.start();
		System.out.println("yoha");
		try {
			t.join();
		} catch(Exception e) {
			
		}
		System.out.println("for");
	}

	@Override
	public void run() {
		System.out.println("div");
		System.out.println("magizh");
	}

}
