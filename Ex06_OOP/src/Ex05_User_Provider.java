//Ŭ�������� ����
//Ŭ���� ������ (������)
//���(is~a) , ����(has~a) > ��������(method) ---->

//Ŭ���� ����(��������)
//�����  : ������
// user   : provider

//class A{}
//class B{}
//class A �� class B�� ����մϴ�
//1. ���
//2. A�� B�� member field ���� �� �ִ�
//3. A�� B�� �Լ��� paraemter  ���� �� �ִ� ...

//�������� ���α׷������� ���� ������ ����

class A {
	void m(B b){ //B��� Ŭ���� ��������, ��ȯ �ΰ�
		
	}	
}
class B {}
	
/////////////////////////////////////////////////
interface Ip{
	void m();
}
class D implements Ip{

	@Override
	public void m() {
		System.out.println("Ip �������̽� m()����");
	}
	
}
class F implements Ip{

	@Override
	public void m() {
		System.out.println("Ip �������̽� m()����");
	}
	
}

//�Ʒ� ó�� ����� �� ¥���� �ڵ� (�����ϴ�)
//�����ϰ� ����� Framework > Spring > Interface ����
class C {
	void method(Ip c){ //Ȯ�� c > D��ü , F��ü
		c.m();
	}
}
public class Ex05_User_Provider {

	public static void main(String[] args) {

		C c = new C();
		c.method(new D());
		c.method(new F());

	}

}
//Interface Ȱ�� > Collection(java �ڷᱸ��)