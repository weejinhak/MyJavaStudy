
class Test2{
	void print(){
		System.out.println("부모함수");
	}
}
class Test3 extends Test2{

	@Override
	void print() {
		System.out.println("내 마음대로 정의");
	}
	
}
class Test4{

	@Override
	public String toString() {
		// 재정의
		return "Test4 객체입니다";
	}
	
}


public class Ex05_inherit_override {

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.print();
		System.out.println(t.toString());
		
		Test4 t2 = new Test4();
		System.out.println(t2.toString());
	}

}
