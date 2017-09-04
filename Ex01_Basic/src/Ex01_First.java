import kr.or.kosta.utils.Emp;

public class Ex01_First {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Emp emp = new Emp();
		emp.dname = "IT∫Œº≠";
		System.out.println(emp.dname);
		
		emp.SetEmpno(-5000);
		int result =emp.GetEmpno();
		System.out.println(result);
		
		emp.number = -2000;
		System.out.println(emp.number);
		
		Emp emp2 = new Emp(8000,"±Ë¿ØΩ≈","IT",1000);
		
	}
 
}
