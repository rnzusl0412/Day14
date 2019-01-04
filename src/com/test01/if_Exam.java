package com.test01;

import java.util.Scanner;

public class if_Exam {
	@SuppressWarnings("resource")
	public static void Ex01() {
		//ex) 자료형을 살펴 봅니다. 
		System.out.println("만일에 입력받은 한 문자가 소문자, 대문자, 나머지로 출력하자");
		Scanner sc = new Scanner(System.in);
		System.out.print("input ch01 : ");
		char ch01 = '\0';
		ch01 = sc.next().charAt(0);
		if (Character.isUpperCase(ch01)){
			System.out.println(ch01 + " : 대문자");
		} else if (Character.isLowerCase(ch01)){
			System.out.println(ch01 + " : 소문자");
		} else {
			System.out.println(ch01 + " : 이도저도 아니잖아?");
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
