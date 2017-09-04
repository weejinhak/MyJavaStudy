//추상 클래스(abstract)
//미완성 설계도(완성된 코드 + 미완성 코드)
//미완성 코드 (미완성된 함수 : 실행블럭  { } (x)


//1. 스스로 객체 생성 (new 클래스 이름) 불가 
// abstract class Emp { abstract void run(); }  new Emp(x)

//2. 상속관계에서 사용가능 (미완성코드 완성해라)
//   자식입장에서 run() { 구현해라 } 

// 추상클래스 상속 받는 녀석은 무조건 미완성 자원 구현해야 한다

//why : 설계자입장에서 강제적 구현 목적


//추상클래스 만들기
abstract class abclass{
	//추상자원(함수 {}없는)
	int pos;
	void run(){
		pos++;
	}
	
	//추상자원(추상메서드)
	abstract void stop();  // { 실행블럭 (x)}
	
}
class Child extends abclass{

	@Override
	void stop() {
		//구현은 마음대로 ...
		pos = 0;
		System.out.println("stop : " + this.pos);
	}
	
}

public class Ex01_abstract {

	public static void main(String[] args) {
		//abclass ab = new abclass();
		Child c = new Child();
		c.run();
		System.out.println(c.pos);
		c.stop();

	}
	
}
