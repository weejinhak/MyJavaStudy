import java.util.ArrayList;

//�⺻Ÿ�� : 8�� (��Ÿ��) > ��ü ���� > JAVA API > Ŭ��������
//�⺻Ÿ�� �ڷ�����  Ŭ������ ���� ��ü ������ ó�� ���� �ϵ���

//1.  Ÿ�� ��ȯ : Integer.parseInt() 
//2.  parameter�� ��� :ArrayList<int> li = new ArrayList<>();
//2.1 ���� ref type
//3.  ���� ��� (���� ����)
public class Ex09_WrapperClass {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500);
		//���������� ���� : private int value 
		
		System.out.println(n); //�����
		System.out.println(n.hashCode()); //�����
		System.out.println(n.MIN_VALUE);
		System.out.println(n.MAX_VALUE);
		
		//Ȱ�� (���˸� parameter)
		ArrayList<Integer> li = new ArrayList<>();
		li.add(100);
		li.add(200);
		for(int r : li){
			System.out.println(r);
		}

		Integer t = new Integer(500);
		IntegerMethod(t); //�ּҰ�
		intMethod(t); //�ּҰ��� �ִ� ����  
		
		
		//����
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //�ٸ� �ּ� > false
		
		//equals override (��)
		//����
		System.out.println(i2.equals(i3)); // true
		
		
		
		
	}
	static void IntegerMethod(Integer i){
		System.out.println("param : " + i);
	
	}
	static void intMethod(int i){
		System.out.println("int param : " + i);
	}

}
