package com.test01;

public class SwitchTest {
	public static void main(String[] args) {
		int su = 4;
		switch (su) {
		case 4:
		case 10:
		case 8:
		case 6:
		case 2:
			System.out.println("Â¦¼ö"); break;
		case 1:
		case 3:
			System.out.println("È¦¼ö"); break;
		default:
			System.out.println("±âÅ¸ µîµî"); break;
		}
	}
}
