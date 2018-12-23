package com.qf.utils;

public class StringUtils {
	
	//判断是否为空
	public static boolean isEmpty(String str){
		if(str==null){
			return true;
		}
		if(str.trim().equals("")){
			return true;
		}
		return false;
	}

}
