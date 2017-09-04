import javax.sound.midi.Synthesizer;

//설계도 (main 함수)
//프로그램의 시작점 , 진입점을 가지고 있다
//Tip) java > main() , C# > Main()

//주석처리 (라인처리)
/*  ....  블럭주석 */

/*
만들이 : 홍길동
생성일 : 2017
파일명 : Test.java
ctrl + shift + / 주석
ctrl + shift + \ 주석 풀기

코드 실행(컴파일 , 실행 : javac  , java ) ctrl + F11

변수(의미있는 단어 , 소문자)
String _name = ""; MS 개발자
String name = "";  Java 

대소문자 구별
String s = "";
String S = "";

예약어 , 키워드 변수명 안되요
String while = "";
*/
class Test{
	public int i; //instance variable 
	              //i 변수 memory 가지는 시점
	              //Test t = new Test();
				  //i 라는 변수의 [초기화 하지 않는 이유]
		          //생성되는 객체마다 다른 값을 가질 것이다
	
	public void print(){
		int j = 10; //local variable
		System.out.println("instance variable :" + i);
		
	}
	public void write(){
		int j=555; //사용가능 (지역)
		System.out.println(j);
	}
}


public class Ex02_variable {
	public static void main(String[] args) {
		int i; //선언
		i = 1000; //초기화 (처음 값을 갖게 하는 것)
		System.out.println(i);
		int j; //The local variable j may not have been initialized
		j= 500;
		System.out.println(j);
		//함수 안에 선언된 변수 scope: local variable (지역 변수)
		//지역변수 반드시 초기값을 가져야 한다.
		
		int k = 1000; //선언과 할당 동시에
		
	}

}
