package com.test01;

import MyCalc.calc;
import java.util.Scanner;

public class SwitchExam02 {
	public static void main(String[] args) {
		int a,b;
		String op;	//연산자가 받을 변수
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하자 : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("연산자 + - * / % 중 하나를 입력하자.");
		op = sc.next();
		
		
		calc c1 = new calc();
		c1.setA(a);
		c1.setB(b);
		
		switch(op) {
		case "+":
			System.out.println(c1.getSum()); break;
		case "-":
			System.out.println(c1.getSub()); break;
		case "*":
			System.out.println(c1.getMul()); break;
		case "/":
			System.out.println(c1.getDiv()); break;
		case "%":
			System.out.println(c1.getAvg()); break;
		default:
			System.err.println("연산자 없음");
		}
	}
}
