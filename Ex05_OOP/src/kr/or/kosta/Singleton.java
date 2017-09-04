package kr.or.kosta;
//디자인 패턴
//싱글톤 패턴 

//하나의 객체를 생성해서 [공유 static]하고 싶다면

//1.여러개의 객체를 생성하더라도 하나의 주소 참조 (new 연산자(x))
//2.하나의 객체를 같이 사용
//3.결국 객체하나만 만들자
//4.유지보수 객체 하나만 수정하면 되니까
//5.한 개의 주소

//실생활
//회사 프린터기 (공유) PC사용자

public class Singleton {
	private static Singleton p = new Singleton(); //클래스 안에서 private 의미 없어요
	//참조변수.p > 객체생성없이 static 		
	private Singleton(){}
	
	public static Singleton getInstance(){
		//return p;
		if(p==null){
			p = new Singleton();
		}
		return p;
	}
}








