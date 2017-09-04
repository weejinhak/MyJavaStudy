package kr.or.kosta.utils;

import java.util.Calendar;

public class Kosta_Date {
	//우리 시스템에서 사용할  날짜 함수 
	//날짜 함수 사용빈도 (많이 사용)
	//static ..
	public static String DateString(Calendar date){
		return date.get(Calendar.YEAR) + "년" + 
			   (date.get(Calendar.MONTH) +1) + "월" + 
			   date.get(Calendar.DATE) + "일"; 
	}
	public static String DateString(Calendar date, String opr){
		return date.get(Calendar.YEAR) + opr + 
			   (date.get(Calendar.MONTH) +1) + opr + 
			   date.get(Calendar.DATE) ; 
	}
	//년월일> 1~9 > 
	//2017년02월16일 , 2017년10월16일
	public static String MonthFormat_DateString(Calendar date){
		
		String month="";
		if((date.get(Calendar.MONTH)+1) < 10){
			month="0"+(date.get(Calendar.MONTH)+1);
		}
		
		return date.get(Calendar.YEAR) + "년" + 
		       month + "월" + 
		       date.get(Calendar.DATE) + "일"; 
	}
}
