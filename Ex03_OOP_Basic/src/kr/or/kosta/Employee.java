package kr.or.kosta;

public class Employee {
	private int empno;
	private String ename;
	private String job;
	private static int totalempcount;
	
	public Employee(){
		empno = 9999;
		ename = "�ƹ���";
		job   = "����";
	}
	/*public Employee(int no){
		empno = no;
	}
	public Employee(int no , String name){
		empno=no;
		ename=name;
	}*/
	public Employee(int no, String name, String j){
		empno = no;
		ename = name;
		job = j;
		totalempcount++;
	}
	
	public void employeeInfo(){
		System.out.printf("���:%d , �̸�:%s , ����:%s\n",
				          empno,ename,job);
	}
	public void employeeInfo(String user){
		System.out.printf("��ȸ��:%s ,��ü�����:%d\n",
		                 user,totalempcount);
	}
}









