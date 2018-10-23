package com.lotte;

import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("are you 18? y/N");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.equalsIgnoreCase("y");
		// boolean adult =line.toUpperCase().equals("Y")
		// boolean adult = line.equals("y")||line.equals("Y");
		System.out.println(adult);
		if (adult) {
			System.out.print("your age:");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("your name:");
			String name = scanner.nextLine();
			System.out.print("your nickname:");
			String nick = scanner.nextLine();
			System.out.println(name + age);
		} else {
			System.out.println("sorry,bye bye");
		}
	}

}
