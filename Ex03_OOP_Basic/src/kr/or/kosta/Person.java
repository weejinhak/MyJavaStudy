package kr.or.kosta;

//설계도 == 클래스 == 타입
//설계도를 구체화된 자원 (객체 , 인스턴스)
//기본 구성 요서 : 속성(상태정보) + 기능(행위)
//속성(상태정보) => 변수 (단 속성이 하나의 값으로 표현 안되면 class 로 설계)
//기능(행위) => 함수
public class Person {
	//String name; //접근자 default
	public String name;
	public int age;
	
	public void Print(){
		System.out.println(name + "/" + age);
	}
	
	
}
