package kr.or.kosta.utils;

import java.util.Calendar;

public class Kosta_Date {
	//�츮 �ý��ۿ��� �����  ��¥ �Լ� 
	//��¥ �Լ� ���� (���� ���)
	//static ..
	public static String DateString(Calendar date){
		return date.get(Calendar.YEAR) + "��" + 
			   (date.get(Calendar.MONTH) +1) + "��" + 
			   date.get(Calendar.DATE) + "��"; 
	}
	public static String DateString(Calendar date, String opr){
		return date.get(Calendar.YEAR) + opr + 
			   (date.get(Calendar.MONTH) +1) + opr + 
			   date.get(Calendar.DATE) ; 
	}
	//�����> 1~9 > 
	//2017��02��16�� , 2017��10��16��
	public static String MonthFormat_DateString(Calendar date){
		
		String month="";
		if((date.get(Calendar.MONTH)+1) < 10){
			month="0"+(date.get(Calendar.MONTH)+1);
		}
		
		return date.get(Calendar.YEAR) + "��" + 
		       month + "��" + 
		       date.get(Calendar.DATE) + "��"; 
	}
}
