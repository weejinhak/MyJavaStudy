//��ü������
//��� , ĸ��ȭ(private) , ������

//java : child extends Root
//class child extends Father
//Tip : C# child : Root

//��� (��Ģ)
//1. ���߻�� �Ұ� 
//2. ���ϻ�� (������ ��� : �������� Ŭ���� ���)
//3.  extends (Ȯ��)
//�� Interface ���߻�� ���� 

//����� ������ �ǹ� : ���뼺
//���뼺���ҷ��� -> ������ -> ����и� ����� �۾� 


//1.Child c = new Child(); �����ϰ� c. 
//����ڰ� ������ ��� Ŭ������ default  Object (root) ���
//class Test{ // ����� Test extends Object
//}
//������ �ڵ� : GrandFather extends Object ����
//Child Object �ڿ� ���

//2. private ������ (��� �Ұ�)


//3. memory(heap) ���� (�ö󰡴� ����)
//Child c = new Child();
//GrandFather -> Father -> Child
//������ Ŭ�������� ������ ���� 


class GrandFather{
	public int gmoney = 5000;
	private int pmoney = 10000;
	//pmoney GrandFather ���ο��� ���� ���ڴ�
	public GrandFather() {
		System.out.println("GrandFather ������");
	}
	
}

class Father extends GrandFather{
	public int fmoney = 1000;
	public Father(){
		System.out.println("Father ������");
	}
	public void Fprint(){
		System.out.println("Father money : " + this.fmoney);
	}
	
}
class Child extends Father{
	public int cmoney = 100;
	public Child(){
		System.out.println("Child ������");
	}
	
}

public class Ex01_inherit {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("gmoney : " + c.gmoney);
		System.out.println("fmoney : " + c.fmoney);
		System.out.println("cmoney : " + c.cmoney);
	
		c.Fprint(); //��Ӱ��� public �Լ� ��� ����
	}

}
