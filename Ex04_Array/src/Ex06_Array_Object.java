import kr.or.kosta.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//사원 3명을 만드세요
		//Emp e = new Emp(1000,"김유신");
		Emp[] emplist = new Emp[3];
		emplist[0] = new Emp(100,"김씨");
		emplist[1] = new Emp(200,"박씨");
		emplist[2] = new Emp(300,"홍씨");
		
		for(int i = 0 ; i < emplist.length ; i++){
			emplist[i].empList();
		}
		//////////////////////////////////////////
		//int[] arr = new int[]{10,20} 형태로 객체 배열
		Emp[] emplist2 = new Emp[]{new Emp(1,"김"),
				                   new Emp(2,"이")};
		for(int i = 0 ; i < emplist2.length ; i++){
			emplist2[i].empList();
		}
		///////////////////////////////////////////
		//int[] arr = {10,20}
		Emp[] emplist3 = {new Emp(1000,"김"),
                		  new Emp(2000,"이")};
		for(int i = 0 ; i < emplist3.length ; i++){
			emplist3[i].empList();
		}
		
		//위 코드는 이해 안되시면 외우셔야 합니다
		//질문 : 그럼 위 코드에서 사원의 이름 변경이 가능할까요
		//김  => 박 변경가능하도록 설계도를 변경하세요
		//함수 (read, write) 2개 -> setters , getters
		
		emplist3[0].setEname("박");
		for(int i = 0 ; i < emplist3.length ; i++){
			emplist3[i].empList();
		}
	}

}
