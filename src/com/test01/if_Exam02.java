package com.test01;

import java.util.Scanner;

public class if_Exam02 {
	public static void Ex01() {
		// ex) 자료형을 살펴 봅니다.
		char ch01 = 'B';

		if (Character.isUpperCase(ch01)) {
			System.out.println(ch01 + " : 대문자");
		} else if (Character.isLowerCase(ch01)) {
			System.out.print(ch01 + " : 소문자, ");
			System.out.println(Character.toUpperCase(ch01));
		} else {
			System.out.println(ch01 + " : 이도저도 아니잖아?");
		}
		System.out.println(Character.codePointAt("abc1", 3));
		// public static int toCodePoint(char high, char low)
		System.out.println(Character.toCodePoint('D', 'A'));
	}

	@SuppressWarnings("resource")
	public static void Ex02() {
		// su % 2 == 0 -> 2의 배수
		// su % 3 == 0 -> 3의 배수
		// ex) Scanner를 통해 입력받은 수가 2의 배수 이면서 3의 배수 이면 출력하자.
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\ninput ch01 : ");
		int ch01 = sc.nextInt();
		if ((ch01 % 2 == 0) && (ch01 % 3 == 0)) {
			System.out.println(ch01 + "은 2의 배수이자 3의배수 입니다.");
		} else {
			System.out.println(ch01 + "은 6의 배수가 아닙니다.");
		}

	}

	public static String Ex03(int ch02) {
		String res = null;
		if ((ch02 % 2 == 0) && (ch02 % 3 == 0)) {
			res = "\n\n" + ch02 + " ==> 6의 배수";
		} else {
			res = "\n\n2의 배수 or 3의 배수가 아니다.";
		}
		return res;
	}

	public static void main(String[] args) {

		Ex01();

		Ex02();

		int ch02 = 6;
		String result = Ex03(ch02);
		System.out.println(result);
	}
}
