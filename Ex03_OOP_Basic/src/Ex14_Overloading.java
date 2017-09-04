import kr.or.kosta.Employee;

public class Ex14_Overloading {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeInfo();
		e.employeeInfo("관리자");
		
		Employee e2 = new Employee(1000, "배고파", "식당");
		e2.employeeInfo();
		e2.employeeInfo("관리자");

	}

}
