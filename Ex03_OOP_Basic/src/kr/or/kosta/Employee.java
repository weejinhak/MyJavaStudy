package kr.or.kosta;

public class Employee {
	private int empno;
	private String ename;
	private String job;
	private static int totalempcount;
	
	public Employee(){
		empno = 9999;
		ename = "아무개";
		job   = "인턴";
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
		System.out.printf("사번:%d , 이름:%s , 직종:%s\n",
				          empno,ename,job);
	}
	public void employeeInfo(String user){
		System.out.printf("조회자:%s ,전체사원수:%d\n",
		                 user,totalempcount);
	}
}









