
class Test2{
	void print(){
		System.out.println("�θ��Լ�");
	}
}
class Test3 extends Test2{

	@Override
	void print() {
		System.out.println("�� ������� ����");
	}
	
}
class Test4{

	@Override
	public String toString() {
		// ������
		return "Test4 ��ü�Դϴ�";
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
