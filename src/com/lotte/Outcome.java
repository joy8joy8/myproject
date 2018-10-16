package com.lotte;

public class Outcome {
	int english;
	int math;
	String name;
	public Outcome(String name,int english,int math){
		this.english=english;
		this.math=math;
		this.name=name;
		}
	public int even() {
		int even = (english+math)/2 ;
		return even;
		}
	public void result() {
		System.out.println(name+"\t"+english+"\t"+math+"\t"+even());
	}
}
