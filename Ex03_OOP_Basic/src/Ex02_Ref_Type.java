import kr.or.kosta.Emp;

public class Ex02_Ref_Type {

	public static void main(String[] args) {
	//사원 2명을 생성하고 정보를 입력하고 출력하세요
		Emp e1 = new Emp();	
		e1.empno = 1000;
		e1.ename = "홍길동";
		e1.tel = "010-5656";
		e1.empPrint();
		
		Emp e2 = new Emp();	
		e2.empno = 2000;
		e2.ename = "김유신";
		e2.tel = "010-9999";
		e2.empPrint();
		
	}

}
