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
	  
	  //�ϳ��� ��ü�� �����ؼ� �����ϴ� ����
	  //������  �������� ��� (JDBC , SPRING �� Ȱ��)
	  
	
		
	}

}
