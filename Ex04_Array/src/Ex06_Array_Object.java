import kr.or.kosta.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//��� 3���� ���弼��
		//Emp e = new Emp(1000,"������");
		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(100,"�达");
		emplist[1] = new Emp(200,"�ھ�");
		emplist[2] = new Emp(300,"ȫ��");
		
		for(int i = 0 ; i < emplist.length ; i++){
			emplist[i].empList();
		}
		//////////////////////////////////////////
		//int[] arr = new int[]{10,20} ���·� ��ü �迭
		Emp[] emplist2 = new Emp[]{new Emp(1,"��"),
				                   new Emp(2,"��")};
		for(int i = 0 ; i < emplist2.length ; i++){
			emplist2[i].empList();
		}
		///////////////////////////////////////////
		//int[] arr = {10,20}
		Emp[] emplist3 = {new Emp(1000,"��"),
                		  new Emp(2000,"��")};
		for(int i = 0 ; i < emplist3.length ; i++){
			emplist3[i].empList();
		}
		
		//�� �ڵ�� ���� �ȵǽø� �ܿ�ž� �մϴ�
		//���� : �׷� �� �ڵ忡�� ����� �̸� ������ �����ұ��
		//��  => �� ���氡���ϵ��� ���赵�� �����ϼ���
		//�Լ� (read, write) 2�� -> setters , getters
		
		emplist3[0].setEname("��");
		for(int i = 0 ; i < emplist3.length ; i++){
			emplist3[i].empList();
		}
	}

}
