
package com.lotte;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human(56f,1.67f);  //because other class has variable Human, we don't have to give a new definition.
		//h.weight=56f;
		//h.height=1.67f;
		System.out.println("frog");
		h.hello ();
		System.out.println(h.bmi());
	}

}