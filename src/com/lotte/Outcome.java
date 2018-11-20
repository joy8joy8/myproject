package com.lotte;

public class Outcome {
	int english;
	int math;
	String name;

	public Outcome(String name, int english, int math) {
		this.english = english;
		this.math = math;
		this.name = name;
	}

	public int even() {
		// int even = (english+math)/2 ;
		return (english + math) / 2;
	}

	public int highest() {
		if (english > math) {
			return english;
		} else {
			return math;
		}
	}
/*
	public String passOrNot() {
		if (even() > 60) {
			return "pass";
		} else {
			return "failed";
		}
	}
*/
	public char level() {
		switch (even() / 10) {
		case 10:
		case 9:
			return 'A'; // 如果沒有return值，要記得break:
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';

		}
	}

	public void result() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + even() + "\t" + highest() + "\t" +
				((even()>60)?"pass":"failed")+ "\t" + level());
		// boolean f=even()<60;

	}
}
