package kr.or.kosta.utils;

public class Emp {
	private int empno; //����(��������) //member field // instance variable
	private String ename;
	private String job;
	private int sal;
	public String dname;
	public int number;
	
	
	
	//�����Ҵ��� ���� �����Ҵ��� ���� ���ϴ� ���� ó��
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	//�Լ�(method > empno ������ ���� �Ҵ�)
	//write
	public void SetEmpno(int empno){
		if(empno < 0){
			this.empno = 1000;
		}else{
			this.empno = empno;
		}
		
	}
	//�Լ�(method > empno ���� ����)
	//read
	public int GetEmpno(){
		return this.empno;
	}
	
	
	
	public Emp(){ //������ (�ʱ�ȭ : �������)
		
	}
	public Emp(int empno, String ename, String job , int sal)
	{
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public void Print(){
		System.out.println("��� : " + this.empno);
		
	}
	
}
