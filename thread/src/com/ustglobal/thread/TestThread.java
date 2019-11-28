package com.ustglobal.thread;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("main thread started");
		MyThread t1 = new MyThread();
		/*
		 * Donot call run(),it behaves like normal program all code will be executed
		 * inside main method only.
		 * t1.run();
		 */
		t1.start();
		/*
		 * t1.start(); We cannot use start() more than one time.we will get exception
		 * illegalThreadStateException.
		 */
		for(int i = 0; i<10;i++) {
			System.out.println("Main Thread");
		}
		System.out.println("main thread ended");
	}

}
