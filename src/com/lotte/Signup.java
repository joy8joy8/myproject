package com.lotte;

import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("are you 18? y/N");
		Scanner scanner= new Scanner(System.in);
		String line=scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("y");
		//boolean adult =line.toUpperCase().equals("Y")
		//boolean adult = line.equals("y")||line.equals("Y");
		System.out.println(adult);
	
	}

}
