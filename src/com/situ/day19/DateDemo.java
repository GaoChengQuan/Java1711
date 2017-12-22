package com.situ.day19;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateDemo {

	@Test
	public void testDate() {
		Date date = new Date();//java.util.Date;
		System.out.println(date);//Thu Dec 14 10:23:53 CST 2017
		// 2017年12月14日 星期四 10:23:53
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy年MM月dd日 E hh时mm分ss秒");
		String newDate = simpleDateFormat.format(date);
		System.out.println(newDate);//2017-12-14 星期四 10:30:37
	}
}
