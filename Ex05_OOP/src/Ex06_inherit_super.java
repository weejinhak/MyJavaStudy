//this : 객체 자신을 가르키는 this
//this : 생성자를 호출하는 this

//super : 상속관계에서만 존재
//상속관계에서 부모자원에 접근 할 수 있는 키워드

//super (참조값) : 부모의 주소
//1.super : 부모의 생성자를 호출
//2.super : 부모의 자원의 주소 접근

//C# > base()

class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void BaseMethod(){
		System.out.println("BaseMethod");
	}
}

class Derived extends Base{
	String dname;
    Derived() {
		System.out.println("Derived  기본 생성자");
	}
    Derived(String dname){
    	
    	//부모 생성자 호출 
    	super(dname); //파라메터 1개의 부모 생성자 호출
    	
    	this.dname = dname;
    	System.out.println("dname : " + this.dname);
    }
    void DerivedMethod(){
    	System.out.println("Derived Method");
    }
    
    //상속관계 재정의(override) : BaseMethod 
    //재정의 : 코드의 재사용성
    
    @Override
    void BaseMethod(){
    	System.out.println("부모의 BaseMehtod 재정의");
    }
    
    //어느날 부모님이 그리워요
    //상속한 자식입장에서 (재정의 BaseMethod())
    //super 키워드 (부모의 주소) >  함수안에서
    
    void parent_method(){
    	super.BaseMethod(); //부모의 함수 (why : 재정의 )
    }
    
}


public class Ex06_inherit_super {
	public static void main(String[] args) {
		//1. 기본
		//Derived d = new Derived(); (상속)
		//부모 생성자(default) 호출 , 자식 생성자(default) 호출
		//Derived d = new Derived();
		//d.BaseMethod();
		//d.DerivedMethod();
		//d.parent_method();
		
		//2. 자식(overloading constructor 호출)
		//Derived d2 = new Derived("홍길동");
		//부모 생성자(default) 호출
		
		//3. 자식(overloading constructor 호출)
		//부모 : overloading constructor 호출 하거 싶어요
		//super() > 부모 생성자 호출
		Derived d3 = new Derived("부모님");
		
		//활용 : 다형성 (재미있어요)
		
	}

}
