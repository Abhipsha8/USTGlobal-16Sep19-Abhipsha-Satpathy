package com.ustglobal.array;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
//		nums[5]=60;OutOfBoundException
		
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("====================");
		
		for(int i : nums) {
			System.out.println(i);
		}
		System.out.println("======================");
		char[] ch = {'a','b','c','d'};
		for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
		}
		System.out.println("=========================");
		
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("===============");
		boolean[] b = {true,false,true,false};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			}
		System.out.println("=========================");
		for(boolean b1 : b) {
			System.out.println(b1);
		}
		
		String[] names = {"asg","frhk","gghj","kjjhh"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			}
		System.out.println("=========================");
		for(String name : names) {
			System.out.println(name);
		}
		
		
	}

}
