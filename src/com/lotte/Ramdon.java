package com.lotte;

import java.util.Random;
import java.util.Scanner;

public class Ramdon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secret = random.nextInt(100) + 1;
		//System.out.println(secret);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please guess a number from 1 to 100.");
		while (true) {
			System.out.print("Your number: ");
			int g = scanner.nextInt();
			scanner.nextLine();
			if (g > secret) {
				System.out.print("Please guess a number below " + g+"\n");
			} else if (g < secret) {
				System.out.print("Please guess a number over " + g+"\n");
			}else {
			System.out.println("Correct! Nice guess!");
			break;
			}
		}

	}

}
