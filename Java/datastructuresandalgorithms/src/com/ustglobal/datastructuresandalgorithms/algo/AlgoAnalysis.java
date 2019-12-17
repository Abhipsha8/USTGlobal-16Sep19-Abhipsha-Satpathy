package com.ustglobal.datastructuresandalgorithms.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		countDuration();
		countDuration1();

	}

	private static long addUpto(Long number) {
		long total = 0L;
		for(int i =0;i<= number;i++) {
			total = total + i;
		}
		return total;
	}


	public static long addUptoQuick(long number) {
		return number * (number+1)/2;
	}

	public static void countDuration() {
		long number = 99999L;
		Instant start = Instant.now();
		System.out.println("addUpto: "+ addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto time:"+seconds + "sec");
	}
	public static void countDuration1() {
		long number = 99999L;
		Instant start = Instant.now();
		System.out.println("addUpto: "+ addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto time:"+seconds + "sec");
	}
}

