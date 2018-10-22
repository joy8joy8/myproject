package com.home;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-6;
		if (x>0) {
			System.out.println("x is positive");
		}
		if (x%2==0) {
			System.out.println("x is even");
		}else {
			System.out.println("x is odd");
		}
		//more than one 
		if (x>0) {
			System.out.println("x is positive");
		}else if (x<0) {
			System.out.println("x is negative");
		}else {
			System.out.println("x is 0");
		} 
		//conditional statement inside another, it'll quickly become hard to read	
		if (x==0) {
			System.out.println("x is 0");
		}else {
			if(x>0) {
				System.out.println("x is positive");
			}else {
				System.out.println("x is negative");
			}
		}
		// flag variables
		int n =55;
		boolean flag=true;
		boolean testResult= false;
		boolean evenFlag=(n%2==0);   //true if n is even
		if (evenFlag) {
			System.out.println("n is even");
		}
		if (!evenFlag) {
			System.out.println("n is odd");
		}
	}

}
