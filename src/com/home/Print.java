package com.home;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score one = new Score(85,66);
		Score two = new Score(95,98);
		Score three = new Score(100,88);
		Name onej = new Name("Jack");
		Name twoc = new Name("Charlotte");
		Name threek = new Name("Kate");
		System.out.print(onej.name);
		System.out.print(" ");
		System.out.print(one.english);
		System.out.print(" ");
		System.out.println(one.math);
		System.out.print(twoc.name);
		System.out.print(" ");
		System.out.print(two.english);
		System.out.print(" ");
		System.out.println(two.math);
		System.out.print(threek.name);
		System.out.print(" ");
		System.out.print(three.english);
		System.out.print(" ");
		System.out.println(three.math);
	}

}
