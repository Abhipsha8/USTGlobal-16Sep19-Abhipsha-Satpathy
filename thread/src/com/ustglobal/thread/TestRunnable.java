package com.ustglobal.thread;

public class TestRunnable {
	public static void main(String[] args) {
		System.out.println("Main started");

		MyRunnable mr = new MyRunnable();
		//		mr.start(); start() is  undefined in MyRunnable
		Thread t = new Thread(mr);
		t.start();

		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main ended");
	}

}
