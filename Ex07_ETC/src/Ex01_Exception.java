//오류(프로그램)
//1. 에러(error)    :네트워크 장애 , 메모리 , 하드웨어
//2. 예외(exception):개발자 처리 (코드 로직 제어 > 예측가능)

//try{문제발생할 것 같은 코드}
//catch(Exception e){ e변수가 예외발생 객체의 주소값 }
//finally{ 예외발생 , 발생하지 않던 강제적으로 실행 블럭 }

//목적 : 프로그램의 비정상적인 종료를 막는다 

//Exception 클래스 (예외담당하는 상위 클래스)
//package : java.lang.* (import default 설정) 
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("START");
		System.out.println("MAIN 함수");
		//예외처리
		try{
			System.out.println("로직처리");
			System.out.println(0/0); //프로그램 비정상 종료
			
		}catch(Exception e){ //발생 예외 객체의 주속 e변수
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("MAIN 함수 END");
		System.out.println("END");
	}

}
