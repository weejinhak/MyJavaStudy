package kr.or.kosta;

//사원 사원번호(숫자) , 이름(문자열) , 전화번호(문자열)를 가지고 있다
//사원설계도는 사원번호 , 이름 , 전화번호를 출력하는 기능
public class Emp {
	public int empno; //초기화가 반드시 필요한 것은 아니다
	public String ename;
	public String tel;
	
	public void empPrint(){
		System.out.printf("사번:%d ,이름%s , 전화:%s\n",
				         empno,ename,tel);
	}
	
	public void T(){
		int data=10; //local variable (T 시작 > 종료)
	}
	
}
