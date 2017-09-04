//�������̽� 
//1. ��� , ǥ�� , ��Ģ  ,�Ծ� ���� ����� ����
//���� , �Ź� (����ǥ�� : �����Ģ) > �����ϸ� ����
//ISO ǥ�� (ȸ��ǥ��) 
//A ȸ�� (ȫ�浿)  -> Bȸ�� ���� (�������)
/////////////////////////////////////////////////
//����Ʈ���� > �������̽� ����� �� 
//���� �ֻ��� �ܰ� : ǥ��, ��� (�� -> ��)

//�������̽��� ������ ����  {} (������� ����)
//ǥ��ȭ�� ���迡 ���� ����
//���뼳�� �����ϴ�

//Java API(������� Ŭ���� : Interface �������)
//����̶� �ܾ� (interface) > ���� 
//���Ӿ�ü (�������̽�  run(); ) > �����̴� ���� > run()
///////////////////////////////////////////////////////

//1 ���� ���
//interface Ia{ ��� , �̿ϼ� �Լ�}

//��� [public static final] int i;  > int i;
//�Լ� [public] void run();  >  void run();
//�Լ� [public abstract String move(int x, int y);] > String move(int x,int x);
//�������̽��� ������ ���� �ʴ´� (�߻��ڿ�������)

//1. ������ ��ü ������ �Ұ����Ѵ�
//2. ������ ���ؼ��� ���(implements) 
//3. �߻��ڿ��� �������� �ؾ� �Ѵ�
//4. ��� : class ���߻�� �Ұ� (���߻���� ����)
//5. �������̽��� Type �̴� 
//6. �������̽������� ��Ӱ��� (ǥ���� Ȯ�� extends ����)


///////////////////////////////////////////////////
//�����ڰ� �ƴ϶� ����ϴ� ���忡��
//�������̽��� Ÿ���̴� (�θ�Ÿ��) > ������
///////////////////////////////////////////////////


interface IA{
	public static final int AGE = 100; 
	String GENDER="��"; //public static final ����
	
	//�߻��ڿ�(�߻�޼���)
	public abstract String print(); 
	String message(String str); //public abstract ����
}

class Test implements IA{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//���� (�ּ�)
interface IB{
	int AGE=100;
	void print();
	String message(String str);
}

class Test2 extends Object implements IB{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String message(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class Ex03_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
