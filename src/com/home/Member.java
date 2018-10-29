package com.home;

import java.util.Scanner;

public class Member {
	String name;
	int age;
	String nick;
	boolean adult;
	
	public Member(boolean adult){
		this.adult=adult;
		
	}
	public Member(String name,int age,String nick) {
		this.name=name;
		this.age=age;
		this.nick=nick;
	}
	public void allowiInput(){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Your name:");
		String name = scanner.nextLine();
		System.out.print("Your age:");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Your nickname:");
		String nick = scanner.nextLine();
		System.out.println("Your information: "+name+"/"+age+"/"+nick);
	}

}
