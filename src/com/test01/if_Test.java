package com.test01;

import java.util.Scanner;

public class if_Test {

	@SuppressWarnings("resource")
	public static void if_View() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input su : ");
		int su = sc.nextInt();
		if (su > 0) {
			System.out.println("양수");
		}
	}

	@SuppressWarnings("resource")
	public static void if_View02() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("input su2 : ");
		int su2 = sc2.nextInt();
		if (su2 >= 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}

	}

	@SuppressWarnings("resource")
	private static void if_View03() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("input su3 : ");
		int su3 = sc3.nextInt();
		if (su3 > 0) {
			System.out.println("양수");
		} else if (su3 < 0 ) {
			System.out.println("음수");
		}	else {
			System.out.println("이도저도 아니잖아?");
		}
	}

	public static void main(String[] args) {
		System.out.println("ex1). 입력받은 수가 0보다 크면 \"양수\" 출력");

		if_View();

		System.out.println("ex1). 입력받은 수가 0보다 크면 \"양수\" 출력" + "\n \t그렇지 않으면 \"음수\"출력");

		if_View02();

		System.out.println("ex1). 입력받은 수가 0보다 크면 \"양수\" 출력" + "\n\t0보다 작으면 \"음수\"출력" + "\n\t둘다 아니면 \"이도저도 아니다.\"출력");

		if_View03();
	}

}
