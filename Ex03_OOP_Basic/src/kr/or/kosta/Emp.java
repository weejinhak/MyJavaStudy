package kr.or.kosta;

//��� �����ȣ(����) , �̸�(���ڿ�) , ��ȭ��ȣ(���ڿ�)�� ������ �ִ�
//������赵�� �����ȣ , �̸� , ��ȭ��ȣ�� ����ϴ� ���
public class Emp {
	public int empno; //�ʱ�ȭ�� �ݵ�� �ʿ��� ���� �ƴϴ�
	public String ename;
	public String tel;
	
	public void empPrint(){
		System.out.printf("���:%d ,�̸�%s , ��ȭ:%s\n",
				         empno,ename,tel);
	}
	
	public void T(){
		int data=10; //local variable (T ���� > ����)
	}
	
}
