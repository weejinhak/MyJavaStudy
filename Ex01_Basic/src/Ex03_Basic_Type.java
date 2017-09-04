import java.util.concurrent.SynchronousQueue;

/*
 자바가 가지는 기본 타입(자료형) 
 8가지 기본 타입 (값을 저장할 수 있는 타입)
 숫자 -> 정수 -> byte(-128 ~ 127)
                char(한문자 : 2byte) : '가' , 'A'
                short(c언어 호환성) (x)
                int(4Byte -21 ~ 21) point: 정수의 연산 기본 타입
                long(8Byte : int 보다 큰값)
 
         실수(소수) -> float(4Byte) 정밀도 
                   -> double(8Byte) point: 정밀도 높다 : 실수 연산의 기본 타입
         논리  -> boolean(true, false) : 프로그램 흐름 제어           
 
 */
class Car extends Object{
  String color;

}
public class Ex03_Basic_Type {
	public static void main(String[] args) {
		int i , j , k; //값을 저장하는 타입
		i = 100;
		j = 200;
		k = 300; //초기화
		System.out.println(i + " . " + j + " . " + k);

		i = 100000000; //범위 값 넘어서면 error
		System.out.println(i);
		//int num = 10000000000;
		long num = 10000000000L; //정수의 리터럴값 int
		                         //리터럴 값을 long 인지
		                         //접미사(L or l)
		System.out.println("long num : " + num);
		
		//char (한문자 : 2Byte)
		//한글자 2Byte , 영문자 , 특수문자 , 공백(2Byte)
		//'가' , 'A'
		char single = '가';
		char ch = 'A';
		System.out.println(ch);
		//문자열
		//값 타입이 아니고 참조타입
		//사실은 참조 타입이지만  그냥 값타입 처럼 사용
		//String 클래스 모습을 보기전까지 int , double 처럼 사용
		String str = "hello world";
		System.out.println(str);
		String str2 = "A";
		System.out.println(str2);
		str2 = str2 + "B";
		System.out.println(str2);
		
		
		
		Car pony = new Car();
		pony.color = "gold";
		
		System.out.println(pony);
		System.out.println(pony.color);
		//pony 값을 출력 : Car@15db9742 > 클래스이름 + @ + 주소
		Car pony2 = pony;
		pony2.color = "red";
		System.out.println(pony.color);
	
		///////////////////////////////////////
		//Tip : java 특수문자 사용
		//역슬러시 : \ 문자그대로 인지 
		char sing ='\'';
		System.out.println(sing);
		//홍"길"동
		String str3 = "홍\"길\"동";
		System.out.println(str3);
		
		String str4 = "1000";
		String str5 = "100";
		String result = str4 + str5;
		System.out.println(result);
		
		System.out.println("100" + 100);//100100
		System.out.println(100 + "100");//100100
		System.out.println(100+100+"100");//200100
		System.out.println(100+"100"+100);//100100100
		
		//Quiz
		//C:\Temp
		//String 타입을 사용해서 위 문자열을 그대로 출력하세요
		String path = "C:\\Temp";
		System.out.println(path);
		
		
		//논리 타입 (boolean) (흐름제어)
		boolean power = true;
		System.out.println(power);
		
		power = !power; //! 부정연산자
		System.out.println(power);
		
		//char 정수(2byte) 정수 호환 가능
		//아스키 코드표 참조 (문자와 십진수값 확인)
		char ch4 = 'a';
		System.out.println(ch4);
		int cint = 65;
		char ch5 = (char)cint; //명시적인 형변환
		System.out.println(ch5);
		
		int cint2 = ch5; //원칙(int)ch5; 내적으로 자동 형변환
		                 //암시적 형변환
		System.out.println(cint2);
		
		//실수 (정밀도)
		//float               (4byte)
		//double (기본 타입)   (6byte)
		float f = 3.14F; //실수의 기본 리터럴은 double
		System.out.println(f);
		
		//표현 범위가 넘으면 반올림
		float f2 = 1.123456789f;
		System.out.println(f2);
		
		double d3 = 1.123456789123456789;
		System.out.println(d3);
		
		//double d4 = (double)100; //100라는 리터럴값의 타입
		double d4 = 100;
		
		//Quiz
		double d5 = 100;
		int i5 = 100;
		//int result5 = d5 + i5
		//큰타입을 작은 바꿀때 : 데이터 손실
		//int result5 = (int)d5 + i5;
		//System.out.println(result5);
		
		double result5 = d5 + i5;
		System.out.println(result5);
		
		//today point
		//작은 타입 + 큰 타입 => 큰 타입
		//타입간의 할당 , 연산에서 값으로 판단한지 말고
		//타입으로 판단하자 (casting 처리)
		int i6 = 100;
		byte b6 = (byte)i6;
		
		byte b7 = 20;
		int i7 = b7; //컴파일러  int i7 = (int)b7;
		             //암시적으로 형변환 일어난다
		System.out.println(i7);
	}
}
