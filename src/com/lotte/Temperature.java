package com.lotte;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp temp =new Temp();
	
		Scanner scanner= new Scanner(System.in); 
		System.out.println("What's the temperature now in celsius?");
		double c=scanner.nextDouble();
		double f =c*(9/5.0)+32;
		System.out.printf("%.2f c = %.2f f");
	}

}
