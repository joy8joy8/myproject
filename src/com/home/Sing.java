package com.home;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Sing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("are you 18? y/N");
		String lin = scanner.nextLine();
		boolean adult=lin.equalsIgnoreCase("y");
		Member member=new Member(adult);
		if(adult) {
			member.allowiInput();
			/*System.out.print("Your name:");
			String name = scanner.nextLine();
			System.out.print("Your age:");
			int age = scanner.nextInt();*/
		}else {
			System.out.println("sorry, not qualify");
		}
	
	
	
	
	}

}
