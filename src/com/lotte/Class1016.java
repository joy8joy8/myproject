package com.lotte;

public class Class1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1.3==1.5);
		
		String s1=new String("abc");
		String s2="abc";
		String s3="abc";
		System.out.println(s1==s2); // asking if s1 and s2 have the same address
		System.out.println(s1.equals(s2));// asking if the content of s1 and s2 are the same or not 
		System.out.println(s2==s3); // if you didn't comment them to have a new String and they have the same content then they'll be save in the same address 
	}

}
