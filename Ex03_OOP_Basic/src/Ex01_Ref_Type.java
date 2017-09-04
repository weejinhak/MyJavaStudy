import kr.or.kosta.Person;
import kr.or.kosta.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p = new Person(); //����� �Ҵ��� ���ÿ�
		p.name = "ȫ�浿"; 
		p.age = 100;
		p.Print();
		
		Person p2; //����
		p2 = new Person(); //�Ҵ�  p2�� �޸𸮸� ���� �ȴ�
		
		//���� ��
		System.out.println(p==p2); //false
		System.out.println("�ּҰ� p : " + p);
		System.out.println("�ּҰ� p2 : " + p2);
		
		Person p3 = p2; //p2 �� ������ �ִ� �� �ּҰ�
		//p2 , p3 ���� �ּ�(�޸𸮸� ������)
		System.out.println(p3==p2); //false
		System.out.println("�ּҰ� p2 : " + p2);
		System.out.println("�ּҰ� p3 : " + p3);
		
		//Tv ��ü �ϳ� ���� (ä�� ����)
		Tv t = new Tv();
		t.ch_Up();
		t.ch_Up();
		System.out.println("���� ä�� ���� : " + t.ch );
		t.brandname ="samsung";
		System.out.println("�귣��� : " + t.brandname );
		
		//����
		//�ּҰ� : 
		System.out.println("t�ּҰ� : " + t);
		System.out.println("t�ּҰ� : " + t.toString());
		//���� : kr.or.kosta.Tv + "@" + �ּ�
		
		System.out.println("t hashcode :" + t.hashCode());
		//hashcode �ּҰ� : 2018699554 
		
		Tv t2 = t;
		System.out.println(t2.hashCode());
		System.out.println(t.hashCode());
		//hashcode ���� ������ ���� �ּ� .....
		
		//���赵 ����� ���赵�� ������� ���� ���� ����(����)
		//class ����� Ŭ������ ������� �޸𸮿� �÷��� ��ü����
	}

}
