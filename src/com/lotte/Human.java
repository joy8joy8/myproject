package com.lotte;

public class Human {
	float weight;
	float height;
	public Human(float weight,float height){
		this.weight=weight;
		this.height=height;
	}
	public void hello(){
		System.out.println("hello");
}
	public float bmi(){
		float bmi=weight/(height*height);
		return bmi;
	}
}
