import kr.or.kosta.Emp;

public class Ex02_Ref_Type {

	public static void main(String[] args) {
	//��� 2���� �����ϰ� ������ �Է��ϰ� ����ϼ���
		Emp e1 = new Emp();	
		e1.empno = 1000;
		e1.ename = "ȫ�浿";
		e1.tel = "010-5656";
		e1.empPrint();
		
		Emp e2 = new Emp();	
		e2.empno = 2000;
		e2.ename = "������";
		e2.tel = "010-9999";
		e2.empPrint();
		
	}

}
