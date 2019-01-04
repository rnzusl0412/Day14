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
		// 오늘은 __년 __월 __일 이다.
		int su = rightNow.get(Calendar.DAY_OF_WEEK);
		String str = new String();
		switch (su) {
		case 7:
			str = new String("토"); break;
		case 6:
			str = new String("금"); break;
		case 5:
			str = new String("목"); break;
		case 4:
			str = new String("수"); break;
		case 3:
			str = new String("화"); break;
		case 2:
			str = new String("월"); break;
		case 1:
			str = new String("일"); break;
		}
		System.out.printf("오늘은 %5d년 %5d월 %5d일 %5s요일 이다.", rightNow.get(Calendar.YEAR), rightNow.get(Calendar.MONTH) + 1,
				rightNow.get(Calendar.DATE),str);
	}
}
