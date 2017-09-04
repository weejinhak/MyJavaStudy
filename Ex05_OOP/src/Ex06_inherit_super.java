//this : ��ü �ڽ��� ����Ű�� this
//this : �����ڸ� ȣ���ϴ� this

//super : ��Ӱ��迡���� ����
//��Ӱ��迡�� �θ��ڿ��� ���� �� �� �ִ� Ű����

//super (������) : �θ��� �ּ�
//1.super : �θ��� �����ڸ� ȣ��
//2.super : �θ��� �ڿ��� �ּ� ����

//C# > base()

class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻ ������");
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
		System.out.println("Derived  �⺻ ������");
	}
    Derived(String dname){
    	
    	//�θ� ������ ȣ�� 
    	super(dname); //�Ķ���� 1���� �θ� ������ ȣ��
    	
    	this.dname = dname;
    	System.out.println("dname : " + this.dname);
    }
    void DerivedMethod(){
    	System.out.println("Derived Method");
    }
    
    //��Ӱ��� ������(override) : BaseMethod 
    //������ : �ڵ��� ���뼺
    
    @Override
    void BaseMethod(){
    	System.out.println("�θ��� BaseMehtod ������");
    }
    
    //����� �θ���� �׸�����
    //����� �ڽ����忡�� (������ BaseMethod())
    //super Ű���� (�θ��� �ּ�) >  �Լ��ȿ���
    
    void parent_method(){
    	super.BaseMethod(); //�θ��� �Լ� (why : ������ )
    }
    
}


public class Ex06_inherit_super {
	public static void main(String[] args) {
		//1. �⺻
		//Derived d = new Derived(); (���)
		//�θ� ������(default) ȣ�� , �ڽ� ������(default) ȣ��
		//Derived d = new Derived();
		//d.BaseMethod();
		//d.DerivedMethod();
		//d.parent_method();
		
		//2. �ڽ�(overloading constructor ȣ��)
		//Derived d2 = new Derived("ȫ�浿");
		//�θ� ������(default) ȣ��
		
		//3. �ڽ�(overloading constructor ȣ��)
		//�θ� : overloading constructor ȣ�� �ϰ� �;��
		//super() > �θ� ������ ȣ��
		Derived d3 = new Derived("�θ��");
		
		//Ȱ�� : ������ (����־��)
		
	}

}
