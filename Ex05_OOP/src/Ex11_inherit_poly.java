//다형성
//다형성 : 여러가지 성질(형태)가질 수 있는 능력
//다형성 범위 : MS > overloading , override

//JAVA
//다형성 : [상속]관계에서 존재
//         하나의 [참조변수]가 [여러개의 타입]을 가질 수 있다
//조상클래스 타입의 참조변수로 자식클래스의 객체 참조 가능

//JAVA
//자식은 부모에게 조건없이 드린다 (현실세계)

class Tv2{ //부모 (일반화 , 추상화) > 공통
	boolean power;
	int ch;
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}
class CapTv extends Tv2{ //자막기능이 있는  CapTv
	//CapTv 특수화 , 구체화 , 고유한 내용 구현
	String text;
	String Caption(){
		return this.text ="자막처리";
	}
}


public class Ex11_inherit_poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.Power();
		System.out.println("전원정보:" + tv.power);
		tv.Chup();
		System.out.println("채널정보 :" + tv.ch);
		System.out.println("자막처리 :" + tv.Caption());
		//요기까지 기존 내용
		
		Tv2 t2 = tv; //tv가 가지는 주소값 할당 (CapTv )
		//Tv2 부모타입  , tv(상속관계 자식 타입 주소값
		System.out.println(t2);
		System.out.println(tv); //t2 의 주소 , tv의 주소값
		
		t2.Chup();
		t2.Chdown();
		t2.Chdown();
		
		System.out.println("자식 : " + tv.ch);
		System.out.println("부모 : " + t2.ch);
		
		//[자식]타입은 [부모]타입에게 상속관에서 조건없이 ....
		Tv2 parent = (Tv2)tv; //내부적으로 형변환 (생략)
		
		CapTv captv = (CapTv)parent; //부모는 자식에게 조건...
		
		
	}

}
