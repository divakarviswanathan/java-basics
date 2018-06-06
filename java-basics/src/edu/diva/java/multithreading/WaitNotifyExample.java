package edu.diva.java.multithreading;

class MyThread implements Runnable {

	@Override
	public void run() {
		WaitNotifyExample.obj.notify();		
	}
	
}
public class WaitNotifyExample implements Runnable {

	public static WaitNotifyExample obj;
	private int data;
	WaitNotifyExample() {
		data = 10;
	}
	
	@Override
	public void run() {
		obj = new WaitNotifyExample();
		try {
			obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.data += 20;
		System.out.println(obj.data);
	}
	
	public static void main(String[] args) throws InterruptedException  {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new WaitNotifyExample());
		t1.start();
		t2.start();
		
		System.out.println("divakar");
	}
}
