package com.lotte;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("please give me an interger");
		int b = scanner.nextInt();
		if(b>=-3&&b<=5){
			boolean n = true;
			System.out.println(n);
		}else{
			boolean n = false;
			System.out.println(n);
		}
		
		
	}

}
