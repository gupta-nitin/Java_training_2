package com.examples.thread;

public class ThreadExampleApp {

	public static void main(String args[]) {

		MyThread1 m1 = new MyThread1("Thread - 1");
		MyThread1 m2 = new MyThread1("Thread - 2");
		MyThread1 m3 = new MyThread1("Thread - 3");
		MyThread1 m4 = new MyThread1("Thread - 4");
		
		
		m1.start();
		

		
		m2.start();


		
		m3.start();
		

		
		m4.start();
		
		System.out.println("Finish");
	}
	
}

class MyThread1 extends Thread {

	private String message;

	public MyThread1( String message) {
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
