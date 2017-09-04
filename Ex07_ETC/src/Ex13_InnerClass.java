//Inner class
//awt , swing , android 사용 
//이벤트 제어

//클래스 안에 클래스가 들어가는 형태
class OuterClass{
	public int pdate = 100;
	private int data = 30;
	
	//장점 : OuterClass 자원을 inner 가 쉽게 사용
	class InnerClass{
		void msg(){
			System.out.println("outer data : " + data);
		}
	}
}
/////////////////////////////////////////////////////////
abstract class Person2{
	abstract void eat();
}

class Man extends Person2{

	@Override
	void eat() {
		System.out.println("Person2의 eat 함수 재정의");		
	}
	
}

//////////////////////////////////////////////////////////
interface Eatable{
	void eat();
}

class Test{
	public void method(Eatable e){
		e.eat();
	}
}



public class Ex13_InnerClass {

	public static void main(String[] args) {
		OuterClass outobj = new OuterClass();
		System.out.println("public : " + outobj.pdate);
		
		OuterClass.InnerClass innerojb = outobj.new InnerClass();
		innerojb.msg();
		/////////////////////////////////////////////
		Man m = new Man();
		Person2 p2 = m;
		p2.eat();
		///////////////////////////////////////////////
		Person2 p3 = new Man();
		p3.eat();
		///////////////////////////////////////////////
		//key point
		//Person2 상속하는 class 없이도 1회성으로 쓰는 방법 (익명클래스)
		Person2 p4 = new Person2(){
				@Override
			void eat() {
				System.out.println("익명 타입으로 구현");
				
			}
		};
		p4.eat();
		////////////////////////////////////////////////////////
		Test t = new Test();
		//원칙 : interface 구현하는 클래스타입의 객체 주소
		t.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("일회성 자원 인터페이스 직접 구현");
				
			}
		});
		
	}

}
