package com.test01;

import MyCalc.calc;
import java.util.Scanner;

public class SwitchExam02 {
	public static void main(String[] args) {
		int a,b;
		String op;	//�����ڰ� ���� ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����� : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("������ + - * / % �� �ϳ��� �Է�����.");
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
			System.err.println("������ ����");
		}
	}
}
