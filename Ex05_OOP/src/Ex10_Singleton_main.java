import java.util.Scanner;

import kr.or.kosta.Singleton;

public class Ex10_Singleton_main {

	public static void main(String[] args) {
	  Singleton s =	    Singleton.getInstance();
	  Singleton s2 =	Singleton.getInstance();
	  Singleton s3 =	Singleton.getInstance();
	  
	  System.out.println(s);
	  System.out.println(s2);
	  System.out.println(s3);
	  
	  //하나의 객체를 생성해서 공유하는 패턴
	  //오늘은  문법적인 요소 (JDBC , SPRING 등 활용)
	  
	
		
	}

}
