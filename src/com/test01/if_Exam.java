package com.test01;

import java.util.Scanner;

public class if_Exam {
	@SuppressWarnings("resource")
	public static void Ex01() {
		//ex) �ڷ����� ���� ���ϴ�. 
		System.out.println("���Ͽ� �Է¹��� �� ���ڰ� �ҹ���, �빮��, �������� �������");
		Scanner sc = new Scanner(System.in);
		System.out.print("input ch01 : ");
		char ch01 = '\0';
		ch01 = sc.next().charAt(0);
		if (Character.isUpperCase(ch01)){
			System.out.println(ch01 + " : �빮��");
		} else if (Character.isLowerCase(ch01)){
			System.out.println(ch01 + " : �ҹ���");
		} else {
			System.out.println(ch01 + " : �̵����� �ƴ��ݾ�?");
		}
	}

	public static void Ex02() {
	}

	public static void Ex03() {
	}

	public static void main(String[] args) {
		Ex01();
		
	}
}
