//������ ����
class Parent{
	int x = 100;
	void pmethod(){
		System.out.println("parent method");
	}
}
class Child3 extends Parent{
	int x = 200; //MS : ���� �����ϱ� //�ǹ� ���� �ڵ�
	
	void parent_x(){
		System.out.println(super.x);
	}

	
	
	//�θ� ������ �Լ��� ������(������ �ٲ�)
	@Override
	void pmethod() {
		System.out.println("������");
	}
	
	void pmethod(String s){ //overloading
		System.out.println("�����ε�");
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
		
		Parent p = c;  // (Parent)c ���� 
		               //p ���͸� ���� �ִ�
		p.pmethod(); //�����ǰ� �Ǿ��ٸ� (������ �Ȱ�)
                     //�ذ��� : �ڽ� super()
		c.parent_method();
		
		
		//��Ӱ��迡�� 
		//�ϳ��� [��������]�� [�������� Ÿ��]�� ���� �� �ִ�
		//       (�θ�Ÿ��)    (�θ� ��ӹ��� �ڽ�Ÿ��)
		
		
		//�߿� point (instanceof ������)
		//javascript ���� : typeof , instanceof ����
		
		if(p instanceof Child3){ //Ÿ�� ��
			System.out.println("true");
		}
		
	}

}
