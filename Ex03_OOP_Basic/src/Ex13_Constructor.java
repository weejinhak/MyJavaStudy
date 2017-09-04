import kr.or.kosta.Book;

//생성자 (Constructor)
//함수 (특수한 목적을 가지는 함수)
//일반함수와 다른점
//함수의 이름 : class 이름과 동일
//함수처럼 void , return Type을 가지지 않는다
//사실은 void(생략되어 있다)
//실행 시점 : new  연산자를 통해서 객체가 생성될때 호출
//why(목적) :  객체의 member field(intance variable) 초기화
//초기화 (객체마다 다른 값으로)

//생성자함수 없는 경우
class Car{
	String carname;
}



class Car2{
	//컴파일러가 알아서 내부적으로
	//Car2(){} //코딩하지 않은 경우 자동생성
	int number;
	Car2(){ //리턴 타입이 없어요 (default void 근거)
		System.out.println("나 default constructor 야");
		number = 100; //초기화 (의미 없다 )
	
	}
	//생성자 (overloading) 개념
}

class Car3{
	int door;
	public Car3(){
		System.out.println("default");
	}
	//overloading 
	public Car3(int num){
		door = num;
	}
}



public class Ex13_Constructor {

	public static void main(String[] args) {
		Car c = new Car();
		c.carname ="SS"; //c 객체 초기화
		
		Car c2 = new Car();
		c2.carname = "YY"; //c2 객체 초기화
		/////////////////////////////////
		Car2 c3 = new Car2();//Car2() 함수 호출 (parameter없는)
		System.out.println(c3.number);
		
		//////////////////////////////////
		Car3 c4 = new Car3(100); //객체 생성시 생성자 함수 1개
		Car3 c5 = new Car3(200);
		
		///Book 클래스 가지고 책 (이름, 가격)
		Book b = new Book("홍길동", 10000);
		b.print();
		//저는 책을 만들때 무조건 이름,가격 강제
		//Book b2 = new Book(); 작업(x)
		Book b2 = new Book("장화홍련전", 10);
		b2.print();
		System.out.println(b2.getBname());
		System.out.println(b2.getPrice());
		
	}

}
