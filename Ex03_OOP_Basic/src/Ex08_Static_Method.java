
class StaticClass{
	int iv;
	static int cv;
	
	//일반함수
	void m(){
		//static 자원은 객체 생성 이전 memory 
		//일반함수가 static 자원접근 문제 없어요
		cv = 1000;
		System.out.println("static cv : " + cv);
	}
	static void sm(){
		//일반자원 
		//iv 가지고 놀수 있을까
		//일반자원 접근 불가 (memory 시점)
		//iv = 100; 컴파일도 안되요
		System.out.println("static cv값 : " + cv);
		
		//끼리끼리 놀아라 (static )
	}
}

public class Ex08_Static_Method {

	public static void main(String[] args) {
		System.out.println(StaticClass.cv);
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(StaticClass.cv);
	}

}
