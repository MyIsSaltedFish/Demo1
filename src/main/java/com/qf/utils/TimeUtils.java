package com.qf.utils;

import java.util.Date;

public class TimeUtils {
	
	final static long nd = 1000 * 24 * 60 * 60;
	final static long nh = 1000 * 60 * 60;
	final static long nm = 1000 * 60;
	final static long ns = 1000;
	
	//获得指定2个时间之间相差多少秒
	public static Long getDiffSecond(Date endDate, Date nowDate) {
	    long diff = endDate.getTime() - nowDate.getTime();
	    return diff / ns;
	}
	//获得指定2个时间之间相差多少分钟
	public static Long getDiffMinute(Date endDate, Date nowDate) {
	    long diff = endDate.getTime() - nowDate.getTime();
	    return diff / nm;
	}
	//获得指定2个时间之间相差多少小时
	public static Long getDiffHouse(Date endDate, Date nowDate) {
	    long diff = endDate.getTime() - nowDate.getTime();
	    return  diff / nh;
	}
	//获得指定2个时间之间相差多少天
	public static Long getDiffDay(Date endDate, Date nowDate) {
	    long diff = endDate.getTime() - nowDate.getTime();
	    return diff / nd;
	}
	
	//把时间转成中文字符串
	public static String getChineseStr(Date endDate, Date nowDate) {
	    //1 获得相差的描述
		String result = null;
		if(getDiffSecond(endDate,nowDate)>=0 && getDiffSecond(endDate,nowDate)<60 ) {
			result = "1分钟以内";
		}else if(getDiffMinute(endDate,nowDate)>=1 && getDiffMinute(endDate,nowDate)<60) {
			result = getDiffMinute(endDate,nowDate)+"分钟之前";
		}else if(getDiffHouse(endDate,nowDate)>=1 && getDiffHouse(endDate,nowDate)<24) {
			result = getDiffHouse(endDate,nowDate)+"小时之前";
		}else if(getDiffDay(endDate,nowDate)>=1) {
			result = getDiffDay(endDate,nowDate)+"天之前";
		}
		
		return result;
		
	}
	

}
