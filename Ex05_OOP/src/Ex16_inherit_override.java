//다형성 점검
class Parent{
	int x = 100;
	void pmethod(){
		System.out.println("parent method");
	}
}
class Child3 extends Parent{
	int x = 200; //MS : 변수 무시하기 //의미 없는 코드
	
	void parent_x(){
		System.out.println(super.x);
	}

	
	
	//부모가 가지는 함수를 재정의(내용을 바꿈)
	@Override
	void pmethod() {
		System.out.println("재정의");
	}
	
	void pmethod(String s){ //overloading
		System.out.println("오버로딩");
	}
	
	void parent_method(){
		super.pmethod();
	}
}


public class Ex16_inherit_override {

	public static void main(String[] args) {
		Child3 c = new Child3();
		System.out.println(c.x);
		c.parent_x();
		c.pmethod();
		c.pmethod("overloading");
		
		Parent p = c;  // (Parent)c 생략 
		               //p 내것만 볼수 있다
		p.pmethod(); //재정의가 되었다면 (재정의 된것)
                     //해결방안 : 자식 super()
		c.parent_method();
		
		
		//상속관계에서 
		//하나의 [참조변수]가 [여러개의 타입]을 가질 수 있다
		//       (부모타입)    (부모를 상속받은 자식타입)
		
		
		//중요 point (instanceof 연산자)
		//javascript 에도 : typeof , instanceof 존재
		
		if(p instanceof Child3){ //타입 비교
			System.out.println("true");
		}
		
	}

}
