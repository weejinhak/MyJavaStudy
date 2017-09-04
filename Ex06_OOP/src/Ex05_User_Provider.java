//클래스간의 관계
//클래스 생성시 (연관성)
//상속(is~a) , 포함(has~a) > 의존관계(method) ---->

//클래스 관계(주종관계)
//사용자  : 제공자
// user   : provider

//class A{}
//class B{}
//class A 가 class B를 사용합니다
//1. 상속
//2. A가 B를 member field 가질 수 있다
//3. A가 B를 함수의 paraemter  가질 수 있다 ...

//현대적인 프로그램에서는 관계 밀접한 관계

class A {
	void m(B b){ //B라는 클래스 생성유뮤, 변환 민감
		
	}	
}
class B {}
	
/////////////////////////////////////////////////
interface Ip{
	void m();
}
class D implements Ip{

	@Override
	public void m() {
		System.out.println("Ip 인터페이스 m()구현");
	}
	
}
class F implements Ip{

	@Override
	public void m() {
		System.out.println("Ip 인터페이스 m()구현");
	}
	
}

//아래 처럼 만들면 잘 짜여진 코드 (느슨하다)
//느슨하게 설계된 Framework > Spring > Interface 설계
class C {
	void method(Ip c){ //확장 c > D객체 , F객체
		c.m();
	}
}
public class Ex05_User_Provider {

	public static void main(String[] args) {

		C c = new C();
		c.method(new D());
		c.method(new F());

	}

}
//Interface 활용 > Collection(java 자료구조)