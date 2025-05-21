package com.kh.example.chop03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);
		
		System.out.println(today.getTime());//1712628643528
		//Tue Apr 09 11:10:43 KST 2024

		Date time = new Date(1712628643528L);
		System.out.println(time);
		
		Date date = new Date(2024,8,2);
		System.out.println(date);
		
	}
	
	public void method2() {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month);
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm == 0 ? "오전" : "오후");
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		int millisec = c.get(Calendar.MILLISECOND);
		System.out.println(millisec);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n",year,month,date,hour,min,sec);
		
	}
	public void mothod3() {
		int year = 2024;
		int month = 8;
		int date = 2;
		int hour = 12;
		int min = 50;
		int sec = 0;
		GregorianCalendar gc = new GregorianCalendar(year,month,date,hour,min,sec);
		System.out.println(gc);
		// 1 데이트의 디폴트 출력형식
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		
//		gc.get(Calendar.DATE);
//		System.out.println(gc);
		
		// 2. gregoriancalender.get 이용하여 직접 형식 작성하기
		
		// 3. Date객체가 있다/는 전제하에 SimpleDateFormat을 이용해작성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd E요일 a hh시 mm분 ss초");
		String end = sdf.format(endDay);
		System.out.println(end);
		
		
		
		
	}
	
}
