//����(���α׷�)
//1. ����(error)    :��Ʈ��ũ ��� , �޸� , �ϵ����
//2. ����(exception):������ ó�� (�ڵ� ���� ���� > ��������)

//try{�����߻��� �� ���� �ڵ�}
//catch(Exception e){ e������ ���ܹ߻� ��ü�� �ּҰ� }
//finally{ ���ܹ߻� , �߻����� �ʴ� ���������� ���� �� }

//���� : ���α׷��� ���������� ���Ḧ ���´� 

//Exception Ŭ���� (���ܴ���ϴ� ���� Ŭ����)
//package : java.lang.* (import default ����) 
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("START");
		System.out.println("MAIN �Լ�");
		//����ó��
		try{
			System.out.println("����ó��");
			System.out.println(0/0); //���α׷� ������ ����
			
		}catch(Exception e){ //�߻� ���� ��ü�� �ּ� e����
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("MAIN �Լ� END");
		System.out.println("END");
	}

}
