package edu.diva.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BQExample {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
		Producer p = new Producer(queue);
		Producer p1 = new Producer(queue);
		Consumer c = new Consumer(queue);
		Consumer c1 = new Consumer(queue);
		Consumer c2 = new Consumer(queue);
		Consumer c3 = new Consumer(queue);
		new Thread(p, "p").start();
		new Thread(p1, "p1").start();
		new Thread(c, "c").start();
		new Thread(c1,"c1").start();
		new Thread(c2,"c2").start();
		new Thread(c3,"c3").start();
	}

}

class Producer implements Runnable {

	private BlockingQueue<String> queue;
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		int i =0;
		while(true) {
			try {
				this.queue.put(i+"\t"+Thread.currentThread().getName());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
	
}

class Consumer implements Runnable {

	private BlockingQueue<String> queue;
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(this.queue.take()+"\t"+Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}