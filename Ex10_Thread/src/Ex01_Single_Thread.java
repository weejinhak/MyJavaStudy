
//�̱� ���μ��� + �̱� ������ (main)

//Single-Thread > JVM [stack] �ϳ���
//���(�Լ�) ���������� ����
//IO �۾������� 

//main Thread �ϳ�������

public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("�� main Thread ��");
		worker();
		worker2();
		System.out.println("main Thread  ����");
	}
	static void worker(){
		System.out.println("�� 1�� �ϲ��̾�");
	}
	static void worker2(){
		System.out.println("�� 2�� �ϲ��̾�");
	}

}
