package com.lotte;

import java.util.Scanner;// if you type [import java.util.*; ] then you import all the class from java.util

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("what's your name?");
		String s=scanner.nextLine();
		System.out.println("hello"+"\t"+s);
		
	}

}
