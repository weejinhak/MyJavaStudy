import kr.or.kosta.Book;

//������ (Constructor)
//�Լ� (Ư���� ������ ������ �Լ�)
//�Ϲ��Լ��� �ٸ���
//�Լ��� �̸� : class �̸��� ����
//�Լ�ó�� void , return Type�� ������ �ʴ´�
//����� void(�����Ǿ� �ִ�)
//���� ���� : new  �����ڸ� ���ؼ� ��ü�� �����ɶ� ȣ��
//why(����) :  ��ü�� member field(intance variable) �ʱ�ȭ
//�ʱ�ȭ (��ü���� �ٸ� ������)

//�������Լ� ���� ���
class Car{
	String carname;
}



class Car2{
	//�����Ϸ��� �˾Ƽ� ����������
	//Car2(){} //�ڵ����� ���� ��� �ڵ�����
	int number;
	Car2(){ //���� Ÿ���� ����� (default void �ٰ�)
		System.out.println("�� default constructor ��");
		number = 100; //�ʱ�ȭ (�ǹ� ���� )
	
	}
	//������ (overloading) ����
}

class Car3{
	int door;
	public Car3(){
		System.out.println("default");
	}
	//overloading 
	public Car3(int num){
		door = num;
	}
}



public class Ex13_Constructor {

	public static void main(String[] args) {
		Car c = new Car();
		c.carname ="SS"; //c ��ü �ʱ�ȭ
		
		Car c2 = new Car();
		c2.carname = "YY"; //c2 ��ü �ʱ�ȭ
		/////////////////////////////////
		Car2 c3 = new Car2();//Car2() �Լ� ȣ�� (parameter����)
		System.out.println(c3.number);
		
		//////////////////////////////////
		Car3 c4 = new Car3(100); //��ü ������ ������ �Լ� 1��
		Car3 c5 = new Car3(200);
		
		///Book Ŭ���� ������ å (�̸�, ����)
		Book b = new Book("ȫ�浿", 10000);
		b.print();
		//���� å�� ���鶧 ������ �̸�,���� ����
		//Book b2 = new Book(); �۾�(x)
		Book b2 = new Book("��ȭȫ����", 10);
		b2.print();
		System.out.println(b2.getBname());
		System.out.println(b2.getPrice());
		
	}

}
