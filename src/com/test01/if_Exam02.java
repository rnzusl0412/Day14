package com.test01;

import java.util.Scanner;

public class if_Exam02 {
	public static void Ex01() {
		// ex) �ڷ����� ���� ���ϴ�.
		char ch01 = 'B';

		if (Character.isUpperCase(ch01)) {
			System.out.println(ch01 + " : �빮��");
		} else if (Character.isLowerCase(ch01)) {
			System.out.print(ch01 + " : �ҹ���, ");
			System.out.println(Character.toUpperCase(ch01));
		} else {
			System.out.println(ch01 + " : �̵����� �ƴ��ݾ�?");
		}
		System.out.println(Character.codePointAt("abc1", 3));
		// public static int toCodePoint(char high, char low)
		System.out.println(Character.toCodePoint('D', 'A'));
	}

	@SuppressWarnings("resource")
	public static void Ex02() {
		// su % 2 == 0 -> 2�� ���
		// su % 3 == 0 -> 3�� ���
		// ex) Scanner�� ���� �Է¹��� ���� 2�� ��� �̸鼭 3�� ��� �̸� �������.
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\ninput ch01 : ");
		int ch01 = sc.nextInt();
		if ((ch01 % 2 == 0) && (ch01 % 3 == 0)) {
			System.out.println(ch01 + "�� 2�� ������� 3�ǹ�� �Դϴ�.");
		} else {
			System.out.println(ch01 + "�� 6�� ����� �ƴմϴ�.");
		}

	}

	public static String Ex03(int ch02) {
		String res = null;
		if ((ch02 % 2 == 0) && (ch02 % 3 == 0)) {
			res = "\n\n" + ch02 + " ==> 6�� ���";
		} else {
			res = "\n\n2�� ��� or 3�� ����� �ƴϴ�.";
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
