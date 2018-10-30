package com.lotte;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double de=30;
		System.out.println(de*(9/5.0)+32); // (9/5)has to be (9.0/5) or(9/5.0)
		
		
		String name="dfggggg";
		int n = (int)(3/5.0) ;  //force double to become int
		int d =7/3;
		int m =5%3; 
		int r=3/5;
		
		double s =3/9.0;
				
		
		System.out.printf("hi, point=%s / %d /%.2f",name,d,s);
		
		
		
	}

}
