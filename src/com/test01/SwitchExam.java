package com.test01;

import java.util.Calendar;

abstract class My {

	public static My getInstance() {
		return (My) new Object();
	}
}

/*
 * abstarc class Calendar { public static Calendar getInstance(){ return new
 * GregorianCalendar(); }
 * 
 * 
 * 
 */
public class SwitchExam {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		//System.out.println(rightNow);
		// ������ __�� __�� __�� �̴�.
		int su = rightNow.get(Calendar.DAY_OF_WEEK);
		String str = new String();
		switch (su) {
		case 7:
			str = new String("��"); break;
		case 6:
			str = new String("��"); break;
		case 5:
			str = new String("��"); break;
		case 4:
			str = new String("��"); break;
		case 3:
			str = new String("ȭ"); break;
		case 2:
			str = new String("��"); break;
		case 1:
			str = new String("��"); break;
		}
		System.out.printf("������ %5d�� %5d�� %5d�� %5s���� �̴�.", rightNow.get(Calendar.YEAR), rightNow.get(Calendar.MONTH) + 1,
				rightNow.get(Calendar.DATE),str);
	}
}
