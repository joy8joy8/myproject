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
		System.out.print(onej.name+"\t"+one.english+"\t"+one.math+"\t"+one.even()+"\n");
		System.out.print(twoc.name+"\t"+two.english+"\t"+two.math+"\t"+two.even()+"\n");
		System.out.print(threek.name+"\t"+three.english+"\t"+three.math+"\t"+three.even()+"\n");
		
	}

}
