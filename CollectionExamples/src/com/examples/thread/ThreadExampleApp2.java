package com.examples.thread;

public class ThreadExampleApp2 {

	public static void main(String args[]) {

		Thread thread1 = new Thread(new MyRunnableThread("Thread - 1"));
		Thread thread2 = new Thread(new MyRunnableThread("Thread - 2"));
		Thread thread3 = new Thread(new MyRunnableThread("Thread - 3"));
		Thread thread4 = new Thread(new MyRunnableThread("Thread - 4"));
		
		thread1.run();
		

		
		thread2.run();


		
		thread3.run();
		

		
		thread4.run();
		
		System.out.println("Finish");
	}
	
}

class MyRunnableThread implements Runnable {

	private String message;

	public MyRunnableThread( String message) {
		this.message = message;
	}
	
	
	public void run(){
		try{
			Thread.sleep(10000);
		}catch (Exception e) {
		
		}
		System.out.println("Thread start - Message is :  " + message);
		
	}
}
