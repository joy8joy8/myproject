package com.lotte;

import java.util.Scanner;

public class Temp {
	double c;

	public Temp(double c) {
		this.c = c;
	}

	public void other() {
		double k = c + 273.15;
		double f = c * (9 / 5.0) + 32;
		System.out.printf("%.2f C  %.2f F  %.2f K",c,f,k);
	}
}
