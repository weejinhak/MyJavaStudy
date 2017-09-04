import java.util.concurrent.SynchronousQueue;

/*
 �ڹٰ� ������ �⺻ Ÿ��(�ڷ���) 
 8���� �⺻ Ÿ�� (���� ������ �� �ִ� Ÿ��)
 ���� -> ���� -> byte(-128 ~ 127)
                char(�ѹ��� : 2byte) : '��' , 'A'
                short(c��� ȣȯ��) (x)
                int(4Byte -21 ~ 21) point: ������ ���� �⺻ Ÿ��
                long(8Byte : int ���� ū��)
 
         �Ǽ�(�Ҽ�) -> float(4Byte) ���е� 
                   -> double(8Byte) point: ���е� ���� : �Ǽ� ������ �⺻ Ÿ��
         ��  -> boolean(true, false) : ���α׷� �帧 ����           
 
 */
class Car extends Object{
  String color;

}
public class Ex03_Basic_Type {
	public static void main(String[] args) {
		int i , j , k; //���� �����ϴ� Ÿ��
		i = 100;
		j = 200;
		k = 300; //�ʱ�ȭ
		System.out.println(i + " . " + j + " . " + k);

		i = 100000000; //���� �� �Ѿ�� error
		System.out.println(i);
		//int num = 10000000000;
		long num = 10000000000L; //������ ���ͷ��� int
		                         //���ͷ� ���� long ����
		                         //���̻�(L or l)
		System.out.println("long num : " + num);
		
		//char (�ѹ��� : 2Byte)
		//�ѱ��� 2Byte , ������ , Ư������ , ����(2Byte)
		//'��' , 'A'
		char single = '��';
		char ch = 'A';
		System.out.println(ch);
		//���ڿ�
		//�� Ÿ���� �ƴϰ� ����Ÿ��
		//����� ���� Ÿ��������  �׳� ��Ÿ�� ó�� ���
		//String Ŭ���� ����� ���������� int , double ó�� ���
		String str = "hello world";
		System.out.println(str);
		String str2 = "A";
		System.out.println(str2);
		str2 = str2 + "B";
		System.out.println(str2);
		
		
		
		Car pony = new Car();
		pony.color = "gold";
		
		System.out.println(pony);
		System.out.println(pony.color);
		//pony ���� ��� : Car@15db9742 > Ŭ�����̸� + @ + �ּ�
		Car pony2 = pony;
		pony2.color = "red";
		System.out.println(pony.color);
	
		///////////////////////////////////////
		//Tip : java Ư������ ���
		//�������� : \ ���ڱ״�� ���� 
		char sing ='\'';
		System.out.println(sing);
		//ȫ"��"��
		String str3 = "ȫ\"��\"��";
		System.out.println(str3);
		
		String str4 = "1000";
		String str5 = "100";
		String result = str4 + str5;
		System.out.println(result);
		
		System.out.println("100" + 100);//100100
		System.out.println(100 + "100");//100100
		System.out.println(100+100+"100");//200100
		System.out.println(100+"100"+100);//100100100
		
		//Quiz
		//C:\Temp
		//String Ÿ���� ����ؼ� �� ���ڿ��� �״�� ����ϼ���
		String path = "C:\\Temp";
		System.out.println(path);
		
		
		//�� Ÿ�� (boolean) (�帧����)
		boolean power = true;
		System.out.println(power);
		
		power = !power; //! ����������
		System.out.println(power);
		
		//char ����(2byte) ���� ȣȯ ����
		//�ƽ�Ű �ڵ�ǥ ���� (���ڿ� �������� Ȯ��)
		char ch4 = 'a';
		System.out.println(ch4);
		int cint = 65;
		char ch5 = (char)cint; //������� ����ȯ
		System.out.println(ch5);
		
		int cint2 = ch5; //��Ģ(int)ch5; �������� �ڵ� ����ȯ
		                 //�Ͻ��� ����ȯ
		System.out.println(cint2);
		
		//�Ǽ� (���е�)
		//float               (4byte)
		//double (�⺻ Ÿ��)   (6byte)
		float f = 3.14F; //�Ǽ��� �⺻ ���ͷ��� double
		System.out.println(f);
		
		//ǥ�� ������ ������ �ݿø�
		float f2 = 1.123456789f;
		System.out.println(f2);
		
		double d3 = 1.123456789123456789;
		System.out.println(d3);
		
		//double d4 = (double)100; //100��� ���ͷ����� Ÿ��
		double d4 = 100;
		
		//Quiz
		double d5 = 100;
		int i5 = 100;
		//int result5 = d5 + i5
		//ūŸ���� ���� �ٲܶ� : ������ �ս�
		//int result5 = (int)d5 + i5;
		//System.out.println(result5);
		
		double result5 = d5 + i5;
		System.out.println(result5);
		
		//today point
		//���� Ÿ�� + ū Ÿ�� => ū Ÿ��
		//Ÿ�԰��� �Ҵ� , ���꿡�� ������ �Ǵ����� ����
		//Ÿ������ �Ǵ����� (casting ó��)
		int i6 = 100;
		byte b6 = (byte)i6;
		
		byte b7 = 20;
		int i7 = b7; //�����Ϸ�  int i7 = (int)b7;
		             //�Ͻ������� ����ȯ �Ͼ��
		System.out.println(i7);
	}
}
