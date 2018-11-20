package com.lotte;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

import midtermexam.Exam3Random;

public class For {

	public static void main(String[] args) {
		int o = 4;
		for (o = 0; o <= 6; o++) {
			System.out.println(o);
		}
		System.out.println("now " + o);
		int a = 2;

		// 5计
		for (a = 0; a <= 100; a = a + 5) {
			System.out.println(a);
		}

		// 顶糷衡猭
		int i, j, sum = 1;
		for (i = 0; i <= 10; i++) {
			for (j = i; j > 0; j--) // n!=n*(n-1)*(n-2)*..*1
			{
				sum = sum * j; // 1*1 1*2 2*1 1*3 3*2 6*1 1*4 4*3 12*2 24*1
			}
			System.out.println(i + "! = " + sum);
			sum = 1;
		}
		
		//for癹伴 絤策瞦Ω
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int c = random.nextInt(10) + 1;
		System.out.println(c);
		System.out.println("3 times to guess");
		int t;
		for (t = 1; t <= 3; t++) {
			System.out.print("Your guess ("+t+"/3):");
			int g = scanner.nextInt();
			if(g<c){
				System.out.println("higher");
			}else if(c<g){
				System.out.println("lower");
			}else if(c==g){
				break;
			}
			}
		if(t==4){
					System.out.println("wrong~~ haha chicken ");
		}else if(t<=3){
			System.out.println("good job");
		
		}
		
	}

//絤策
//1~100 い┮Τ5计
//瞦计程Ω
//叫10顶糷
}
