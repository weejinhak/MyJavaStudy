package kr.or.kosta;

public class Emp {
	private int empno;
	private String ename;
	
	
	
	//ename setter �Լ� ����
	public void setEname(String ename) {
		this.ename = ename;
	}

	//public Emp(){}
	public Emp(int no , String name){
		empno = no;
		ename = name;
	}
	
	public void empList(){
		System.out.println("���: "+ empno + " �̸�: " + ename);
	}
}





