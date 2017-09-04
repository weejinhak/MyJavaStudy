package kr.or.kosta.utils;

public class Emp {
	private int empno; //변수(상태정보) //member field // instance variable
	private String ename;
	private String job;
	private int sal;
	public String dname;
	public int number;
	
	
	
	//직접할당을 막고 간접할당을 통해 원하는 값만 처리
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	//함수(method > empno 변수에 값을 할당)
	//write
	public void SetEmpno(int empno){
		if(empno < 0){
			this.empno = 1000;
		}else{
			this.empno = empno;
		}
		
	}
	//함수(method > empno 값을 리턴)
	//read
	public int GetEmpno(){
		return this.empno;
	}
	
	
	
	public Emp(){ //생성자 (초기화 : 멤버변수)
		
	}
	public Emp(int empno, String ename, String job , int sal)
	{
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
	public void Print(){
		System.out.println("사번 : " + this.empno);
		
	}
	
}
