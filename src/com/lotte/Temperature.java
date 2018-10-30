package com.lotte;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in); 
		System.out.println("What's the temperature now in celsius?");
		double de=scanner.nextDouble();
		System.out.println(de*(9/5.0)+32);
	}

}
