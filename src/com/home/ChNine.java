package com.home;

public class ChNine {

	public static void main(String[] args) {
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
			if(c%5==0) {
				System.out.println();
			}
		}
		
		System.out.println("Greek");
		for(int i=913;i<=937;i++) {
			System.out.print((char)i);
		}
		
		System.out.println();
		String fruit="Hello world";
		for(int i=0;i< fruit.length();i++) {
			char letter=fruit.charAt(i);
			System.out.print(letter);
		}
		System.out.println();
		for(int i=fruit.length()-1;i>=0;i--){
			char letter=fruit.charAt(i);
			System.out.print(letter);
		}
		
		System.out.println();
		System.out.println(fruit.substring(8));
		System.out.println(fruit.substring(2,5));
		
		int index = fruit.indexOf('l',4);
		System.out.println(index);

	String s2="Jack Tom Eric";
	System.out.println(s2.indexOf("Tom"));
	System.out.println(s2.indexOf("Eric"));
	System.out.println(s2.lastIndexOf("c"));
	
	String name="Tom";
	System.out.println(s2.substring(0, s2.indexOf("Tom"))+"boss"
						+s2.substring(s2.indexOf("Tom")+name.length(),s2.lastIndexOf("c")+1));
	
	//while loop
	s2=s2.replace("Tom", "boss");
	System.out.println(s2);
	
	int n =Integer.parseInt("12");
	n=n+2;
	System.out.println(n);
	float g=Float.parseFloat("59.7");
	char c= Character.
	
	
	}
}