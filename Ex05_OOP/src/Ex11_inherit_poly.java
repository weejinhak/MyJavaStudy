//������
//������ : �������� ����(����)���� �� �ִ� �ɷ�
//������ ���� : MS > overloading , override

//JAVA
//������ : [���]���迡�� ����
//         �ϳ��� [��������]�� [�������� Ÿ��]�� ���� �� �ִ�
//����Ŭ���� Ÿ���� ���������� �ڽ�Ŭ������ ��ü ���� ����

//JAVA
//�ڽ��� �θ𿡰� ���Ǿ��� �帰�� (���Ǽ���)

class Tv2{ //�θ� (�Ϲ�ȭ , �߻�ȭ) > ����
	boolean power;
	int ch;
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}
class CapTv extends Tv2{ //�ڸ������ �ִ�  CapTv
	//CapTv Ư��ȭ , ��üȭ , ������ ���� ����
	String text;
	String Caption(){
		return this.text ="�ڸ�ó��";
	}
}


public class Ex11_inherit_poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.Power();
		System.out.println("��������:" + tv.power);
		tv.Chup();
		System.out.println("ä������ :" + tv.ch);
		System.out.println("�ڸ�ó�� :" + tv.Caption());
		//������ ���� ����
		
		Tv2 t2 = tv; //tv�� ������ �ּҰ� �Ҵ� (CapTv )
		//Tv2 �θ�Ÿ��  , tv(��Ӱ��� �ڽ� Ÿ�� �ּҰ�
		System.out.println(t2);
		System.out.println(tv); //t2 �� �ּ� , tv�� �ּҰ�
		
		t2.Chup();
		t2.Chdown();
		t2.Chdown();
		
		System.out.println("�ڽ� : " + tv.ch);
		System.out.println("�θ� : " + t2.ch);
		
		//[�ڽ�]Ÿ���� [�θ�]Ÿ�Կ��� ��Ӱ����� ���Ǿ��� ....
		Tv2 parent = (Tv2)tv; //���������� ����ȯ (����)
		
		CapTv captv = (CapTv)parent; //�θ�� �ڽĿ��� ����...
		
		
	}

}
