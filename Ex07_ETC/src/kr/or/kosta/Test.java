package kr.or.kosta;

//�޼��� ���� ������ (throws)  ���� (������)
//Ŭ���� ����� �Լ� (�̸� ���赵�� ���)
//�ϴ� ������� ����ó���� ���� 
//FileInputStream fi = new FileInputStream("C:\temp");
//������ ���� ó�� �ϼž� �˴ϴ�
//�ݵ�� ó�� �ض� (����ó��)
public class Test {
	
	public Test() throws Exception {
		
	}
	
	public void call() throws ArithmeticException , IndexOutOfBoundsException{
		System.out.println("Call �Լ� start");
		int i = 1/0;
		System.out.println("Call �Լ� end");
	}
}
