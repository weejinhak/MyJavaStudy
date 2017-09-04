//Inner class
//awt , swing , android ��� 
//�̺�Ʈ ����

//Ŭ���� �ȿ� Ŭ������ ���� ����
class OuterClass{
	public int pdate = 100;
	private int data = 30;
	
	//���� : OuterClass �ڿ��� inner �� ���� ���
	class InnerClass{
		void msg(){
			System.out.println("outer data : " + data);
		}
	}
}
/////////////////////////////////////////////////////////
abstract class Person2{
	abstract void eat();
}

class Man extends Person2{

	@Override
	void eat() {
		System.out.println("Person2�� eat �Լ� ������");		
	}
	
}

//////////////////////////////////////////////////////////
interface Eatable{
	void eat();
}

class Test{
	public void method(Eatable e){
		e.eat();
	}
}



public class Ex13_InnerClass {

	public static void main(String[] args) {
		OuterClass outobj = new OuterClass();
		System.out.println("public : " + outobj.pdate);
		
		OuterClass.InnerClass innerojb = outobj.new InnerClass();
		innerojb.msg();
		/////////////////////////////////////////////
		Man m = new Man();
		Person2 p2 = m;
		p2.eat();
		///////////////////////////////////////////////
		Person2 p3 = new Man();
		p3.eat();
		///////////////////////////////////////////////
		//key point
		//Person2 ����ϴ� class ���̵� 1ȸ������ ���� ��� (�͸�Ŭ����)
		Person2 p4 = new Person2(){
				@Override
			void eat() {
				System.out.println("�͸� Ÿ������ ����");
				
			}
		};
		p4.eat();
		////////////////////////////////////////////////////////
		Test t = new Test();
		//��Ģ : interface �����ϴ� Ŭ����Ÿ���� ��ü �ּ�
		t.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("��ȸ�� �ڿ� �������̽� ���� ����");
				
			}
		});
		
	}

}
