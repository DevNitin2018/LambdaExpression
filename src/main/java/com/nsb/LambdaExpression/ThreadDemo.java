package com.nsb.LambdaExpression;

public class ThreadDemo {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i =0;i<10;i++){
			System.out.println("Main Thread");
		}
		
		
		
	}

}
