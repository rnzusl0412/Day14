package com.test01;

import java.util.Scanner;

public class if_Test {

	@SuppressWarnings("resource")
	public static void if_View() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input su : ");
		int su = sc.nextInt();
		if (su > 0) {
			System.out.println("���");
		}
	}

	@SuppressWarnings("resource")
	public static void if_View02() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("input su2 : ");
		int su2 = sc2.nextInt();
		if (su2 >= 0) {
			System.out.println("���");
		} else {
			System.out.println("����");
		}

	}

	@SuppressWarnings("resource")
	private static void if_View03() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("input su3 : ");
		int su3 = sc3.nextInt();
		if (su3 > 0) {
			System.out.println("���");
		} else if (su3 < 0 ) {
			System.out.println("����");
		}	else {
			System.out.println("�̵����� �ƴ��ݾ�?");
		}
	}

	public static void main(String[] args) {
		System.out.println("ex1). �Է¹��� ���� 0���� ũ�� \"���\" ���");

		if_View();

		System.out.println("ex1). �Է¹��� ���� 0���� ũ�� \"���\" ���" + "\n \t�׷��� ������ \"����\"���");

		if_View02();

		System.out.println("ex1). �Է¹��� ���� 0���� ũ�� \"���\" ���" + "\n\t0���� ������ \"����\"���" + "\n\t�Ѵ� �ƴϸ� \"�̵����� �ƴϴ�.\"���");

		if_View03();
	}

}
