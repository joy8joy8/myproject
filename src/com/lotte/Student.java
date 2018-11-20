package com.lotte;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Outcome one = new Outcome("Jack", 80, 90);
		Outcome two = new Outcome("Mark", 40, 65);
		Outcome three = new Outcome("Kate", 95, 85);
		one.result();
		two.result();
		three.result();
	}

}
