import java.awt.Color;

//열거형 (타입)
//의미있는 값들의 나열 
//class Cla { public static final int NUM=0; 
//            public static final int MONDAY=1;
//           }

//정의 : 사용자가 정의한 멤버가 순차적인 상수값을 가질 수 있는 타입

//enum 열거형 이름 {상수 멤버 리스트}
//public enum Season {SRPING, SUMMER , FALL ,WINTER}
//{자원으 상수 내부적으로 0 부터 1씩증가 정수값 }

//열거형이 아니라도 만들수 있어요 > Interface 상수 정의 

//열거형은 개발자 코드의 가독성 
//열거타입 (클래스 , 클래스 안에서)
//열거형도  타입니다 

enum Season {SPRING ,SUMMER , FALL , WINTER} //static final
//interface season{public static final SPRING =0;}

public class Ex11_Enum {
	public static void main(String[] args) {
		Season s  = Season.SPRING;
		System.out.println(s);
		for(Season s2 : Season.values()){
			System.out.println(s2.name() + " /" + s2.ordinal());
		}
		
		//Color.blue  시스템 열거 타입
	}

}
