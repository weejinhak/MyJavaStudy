/*
 Ŭ���� == ���赵 == Ÿ�� 

 *Ŭ������ Ÿ��(Type)�Դϴ�******** 
 
*/

class Apt{
	int door=10;
	int window=2;
	
}
//�⺻������ �޸𸮿� �÷��� ��� ����
public class Ex04_Ref_Type {
	public static void main(String[] args) {
		Apt ssang = new Apt();
		//Apt Ÿ��
		//ssang ����(��������)
		System.out.println(ssang); 
		//Apt@15db9742
		//Apt Ÿ�� + @ ���� + �ּ� > ����
		
		Apt sam = new Apt();
		System.out.println(sam);
		
		Apt apt = sam; //����Ÿ�� �Ҵ�
		System.out.println(apt == sam); // == ����
		System.out.println(apt == ssang);

		apt.door = 100;
		System.out.println("sam.door : " + sam.door);
		
		
		//���� Ÿ���� �Ҵ��� �ּҰ� �Ҵ��̴�
		
		int num =1000;
		System.out.println(num);
		int num2 = num;
		System.out.println(num2);
		num2 = 5000;
		//�̶� num ������ ���� ��ȭ�� �ֽ��ϱ� (�� �Ҵ�)
		
		
	}

}
