//�߻� Ŭ����(abstract)
//�̿ϼ� ���赵(�ϼ��� �ڵ� + �̿ϼ� �ڵ�)
//�̿ϼ� �ڵ� (�̿ϼ��� �Լ� : �����  { } (x)


//1. ������ ��ü ���� (new Ŭ���� �̸�) �Ұ� 
// abstract class Emp { abstract void run(); }  new Emp(x)

//2. ��Ӱ��迡�� ��밡�� (�̿ϼ��ڵ� �ϼ��ض�)
//   �ڽ����忡�� run() { �����ض� } 

// �߻�Ŭ���� ��� �޴� �༮�� ������ �̿ϼ� �ڿ� �����ؾ� �Ѵ�

//why : ���������忡�� ������ ���� ����


//�߻�Ŭ���� �����
abstract class abclass{
	//�߻��ڿ�(�Լ� {}����)
	int pos;
	void run(){
		pos++;
	}
	
	//�߻��ڿ�(�߻�޼���)
	abstract void stop();  // { ����� (x)}
	
}
class Child extends abclass{

	@Override
	void stop() {
		//������ ������� ...
		pos = 0;
		System.out.println("stop : " + this.pos);
	}
	
}

public class Ex01_abstract {

	public static void main(String[] args) {
		//abclass ab = new abclass();
		Child c = new Child();
		c.run();
		System.out.println(c.pos);
		c.stop();

	}
	
}
