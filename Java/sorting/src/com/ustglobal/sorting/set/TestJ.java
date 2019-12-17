package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	
	public static void main(String[] args) {
		 
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(34);
		pq.offer(1);
		
		System.out.println("****************Using iterator********************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll"+pq);
		
		
	}

}
