import kr.or.kosta.Employee;

public class Ex14_Overloading {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.employeeInfo();
		e.employeeInfo("������");
		
		Employee e2 = new Employee(1000, "�����", "�Ĵ�");
		e2.employeeInfo();
		e2.employeeInfo("������");

	}

}
