//인터페이스 
//1. 약속 , 표준 , 규칙  ,규약 등을 만드는 행위
//나사 , 신발 (국제표준 : 공통규칙) > 이행하면 이점
//ISO 표준 (회계표준) 
//A 회사 (홍길동)  -> B회사 이직 (공통업무)
/////////////////////////////////////////////////
//소프트웨어 > 인터페이스 만드는 것 
//설계 최상위 단계 : 표준, 약속 (무 -> 유)

//인터페이스는 구현이 없다  {} (실행블럭이 없다)
//표준화된 설계에 대한 보장
//공통설계 가능하다

//Java API(만들어진 클래스 : Interface 기반으로)
//상속이란 단어 (interface) > 구현 
//게임업체 (인터페이스  run(); ) > 움직이는 행위 > run()
///////////////////////////////////////////////////////

//1 생성 방법
//interface Ia{ 상수 , 미완성 함수}

//상수 [public static final] int i;  > int i;
//함수 [public] void run();  >  void run();
//함수 [public abstract String move(int x, int y);] > String move(int x,int x);
//인터페이스는 구현을 갖지 않는다 (추상자원가진다)

//1. 스스로 객체 생성이 불가능한다
//2. 구현을 통해서만 사용(implements) 
//3. 추상자원을 강제구현 해야 한다
//4. 상속 : class 다중상속 불가 (다중상속을 지원)
//5. 인터페이스도 Type 이다 
//6. 인퍼페이스끼리는 상속가능 (표준의 확장 extends 가능)


///////////////////////////////////////////////////
//설계자가 아니라 사용하는 입장에서
//인터페이스도 타입이다 (부모타입) > 다형성
///////////////////////////////////////////////////


interface IA{
	public static final int AGE = 100; 
	String GENDER="남"; //public static final 생략
	
	//추상자원(추상메서드)
	public abstract String print(); 
	String message(String str); //public abstract 생략
}

class Test implements IA{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//설명 (주석)
interface IB{
	int AGE=100;
	void print();
	String message(String str);
}

class Test2 extends Object implements IB{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class Ex03_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
