import java.util.Scanner;

public class Ex08_Print_format {
	public static void main(String[] args) {
		//C# (MS)
		//Console.WriteLine()
		//Console.Write()
		//Console.ReadLine()
		
		//Cmd â ���
		System.out.println("A");//ln(�ٹٲ�)\
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("�̸� �Է�:");
		
		int num=100;
		System.out.printf("���� num ���� %d �Դϴ�",num);
		//format ���� ����
		//%d (10���� ���� ���� ���)
		//%f (10���� ���� �Ǽ� ���)
		//%s (���ڿ� ���)
		//%c (�ѹ��� ���)
		int age = 400;
		String name ="ȫ�浿";
		//printf() ����ؼ� 
		//ȫ�浿�� ���̴� 400�� �Դϴ� ����ϼ���
		System.out.printf("\n%s�� ����\t�� %d�� �Դϴ�\n",name,age);
	
		float f = 3.14f;
		System.out.println(f);
		
		System.out.printf("f���� %f �Դϴ�",f);
		
		//Cmd â�� �� �о����
		System.out.println();
		//Ctrl + shift + O //import ���� �ڵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		//int result = sc.nextInt();
		//System.out.println(result);
		
		//sc.nextLine(); console �� �Է��� ���� Ÿ���� ��������
	    //�ʰ� ���ڿ��� ....
		//Today Key point 
		//���ڸ� -> ���ڷ� (�ϻ�ٹݻ�)  > Ÿ��Ŭ����.parseInt()
		int result = Integer.parseInt(sc.nextLine());
		//Float.parseFloat(s)
		//Double.parseDouble(s)
		
		System.out.println(result);
		
		System.out.print("����� �̸���:");
		String youname = sc.nextLine();
		System.out.println(youname);
		
		//Quiz
		//���ڸ�  ���ڷ� �ٲٴ� ���� : String.valueof()
		//������[����] -> [����]  > "123456"
		String str = "10000";
		int value = Integer.parseInt(str);
		
		String str2 = String.valueOf(value); //���ڿ� ��ȯ
		System.out.println(str2);
		
		
	}

}
