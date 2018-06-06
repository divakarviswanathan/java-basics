package edu.diva.java.multithreading;

public class SynchronizeAndConstructor implements Runnable {

	//we can use synchronized block inside constructor
	//But a constructor can not be synchronized
	
	public SynchronizeAndConstructor() {
		synchronized(this) {
			
		}
	}
	public static void main(String[] a) {
		
	}

	@Override
	public void run() {
		
	}
}
