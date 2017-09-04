
class Variables{
	int iv; //member field , instance variable
	        //목적 :객체마다 다른 값을 갖기 위해서
		    //초기화 해도 되고 , 안하면 default 값 : 정수 0
	
	static int cv; 
	//class variable , static variable (공유자원)
	// [객체간 공유자원]
	//생성시점 (memory 갖는 시점) : 프로그램이 실행될때 
	//                           : 객체 생성 이전에 
	//실행시 클래스 정보 로드 할때 (method(class) area) 영역에 올라간다
	//접근방법 : class이름.static자원
	//          참조변수.static자원

	void method(){
		int lv=0; //local variable
		          //사용하기 위해서 반드시 초기화
		          //함수 호출 생성
		          //함수 끝나면 소멸
	}
	
	static void smethod(){
		System.out.println("난 static 이야");
	}
}
public class Ex05_Variable_Scope {
	public static void main(String[] args) {
		//System.out.println(Variables.cv);
		
		//Variables v = new Variables();
		//v.iv = 100;
		//Variables v2 = new Variables();
		//System.out.println("iv :" + v2.iv);

		Variables.smethod();
		
		Variables v = new Variables();
		v.cv = 100;
		Variables v2 = new Variables();
		System.out.println("객체로 접근:" + v2.cv);
		System.out.println("클래스 접근: " + Variables.cv);
		 
		
	}

}
