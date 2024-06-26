package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String ...strings){
       
        //메소드 내용작성
    	String result = "";
    	
    	for (String sTemp : strings) {
			result += sTemp;
		}
    	
        return result;
    }

}
