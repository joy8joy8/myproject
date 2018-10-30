package com.lotte;

import java.util.Random;
import java.util.Scanner;

public class Ramdon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int secret=random.nextInt(100)+1; 
		System.out.println(secret);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please guess a number from 1 to 100."+"\n"+"Your number: ");
		double g=scanner.nextDouble();
		if(g>secret){
			int side =g;			
			System.out.print("Please guess a number from 1 to "+g+"\n"+"Your number: ");
		}else if(g<secret){
			System.out.print("Please guess a number from "+g+" to 100"+"\n"+"Your number: ");
		}
		while(g!=secret){
			double d=scanner.nextDouble();
						
		}
		
	/*	if(g==secret){
			System.out.println("Bravo");
		}else{
			System.out.println("wrong guess");
		}*/
		
	}

}
