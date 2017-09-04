//변수 <-> 상수
//상수 : 한번 값이 정해지면 변경 불가
//PI , 고유값, 시스템 환경변수 
//상수 : 관용적으로 대문자 

//java : final int NUM=100;
//c#   : const int NUM=100;

//final 키워드
//클래스 앞에 : final class TT{} : 상속없는 클래스
//함수 앞에 : final method() : 상속관계에서 재정의 금지


//상수 (final)
class Vcard{
	final String KIND="heart"; //상수
	final int NUM=100;
	public void method(){
		System.out.println(Math.PI);//시스템 상수
	}
}
//문제 : Vcard 타입으로 모든 객체 KIND , NUM
//객체마다 다른 상수값을 가질 수 있을까
class Vcard2{
	final String KIND;
	final int NUM;
	//객체마다 다른 상수값을 보장성 코드
	
	//Vcard2(){
	//	this.KIND = "";
	//	this.NUM = 0;
	//}
	//상수는 초기화 객체마다 다른
	
	//Vcard2(){ }
	Vcard2(String kind , int num){
		this.KIND = kind;
		this.NUM = num;
	}
	//설계자의 의도 파악 
}
public class Ex07_final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "aaa";
	
		Vcard2 v2 = new Vcard2("A", 10);
		Vcard2 v3 = new Vcard2("B", 20);
		Vcard2 v4 = new Vcard2("C", 30);
		
		//v2.KIND = "D";

	}

}
