package com.home;

public class Score {
	int english;
	int math;
	
	public Score(int english,int math){
		this.english=english;
		this.math=math;
	}
	public int even() {
		int even = (english+math)/2 ;
		return even;
			
	}
	
}