package com.ustglobal.thread.properties;

public class MyIdThread {
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyThread mi = new MyThread();
		System.out.println("my id thread "+mi.getId());
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
		/*
		 * Thread.currentThread().setPriority(16);IllegalArgumentException(we can set
		 * priority from 1 to 10 only)
		 */
		
		System.out.println("Main ended");
		
	}

}
