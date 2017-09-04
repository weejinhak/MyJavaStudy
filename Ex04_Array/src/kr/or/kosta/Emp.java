package kr.or.kosta;

public class Emp {
	private int empno;
	private String ename;
	
	
	
	//ename setter 함수 생성
	public void setEname(String ename) {
		this.ename = ename;
	}

	//public Emp(){}
	public Emp(int no , String name){
		empno = no;
		ename = name;
	}
	
	public void empList(){
		System.out.println("사번: "+ empno + " 이름: " + ename);
	}
}





