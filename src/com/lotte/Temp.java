package com.lotte;

import java.util.Scanner;


 
public class Temp {
	double c;
	double k;
	double f;
	public Temp (){
		Scanner scanner=new Scanner(System.in);
		double c=scanner.nextDouble();
		Temp k = new Temp();
		
		k= c+273.15;
		f=c*(9/5.0)+32;
		this. f =f;
		this.k=k;
		
	}

}
