//객체지향언어
//상속 , 캡슐화(private) , 다형성

//java : child extends Root
//class child extends Father
//Tip : C# child : Root

//상속 (규칙)
//1. 다중상속 불가 
//2. 단일상속 (계층적 상속 : 여러개의 클래스 상속)
//3.  extends (확장)
//단 Interface 다중상속 가능 

//상속의 진정한 의미 : 재사용성
//재사용성잘할려면 -> 설계자 -> 공통분모를 만드는 작업 


//1.Child c = new Child(); 생성하고 c. 
//사용자가 생성한 모든 클래스는 default  Object (root) 상속
//class Test{ // 사실은 Test extends Object
//}
//생략된 코드 : GrandFather extends Object 생략
//Child Object 자원 사용

//2. private 접근자 (상속 불가)


//3. memory(heap) 구조 (올라가는 순서)
//Child c = new Child();
//GrandFather -> Father -> Child
//각각의 클래스에서 생성자 구현 


class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000;
	//pmoney GrandFather 내부에서 나만 쓰겠다
	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	
}

class Father extends GrandFather{
	public int fmoney = 1000;
	public Father(){
		System.out.println("Father 생성자");
	}
	public void Fprint(){
		System.out.println("Father money : " + this.fmoney);
	}
	
}
class Child extends Father{
	public int cmoney = 100;
	public Child(){
		System.out.println("Child 생성자");
	}
	
}

public class Ex01_inherit {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("gmoney : " + c.gmoney);
		System.out.println("fmoney : " + c.fmoney);
		System.out.println("cmoney : " + c.cmoney);
	
		c.Fprint(); //상속관계 public 함수 사용 가능
	}

}
