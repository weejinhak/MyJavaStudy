package kr.or.kosta;

//메서드 예외 던지기 (throws)  복수 (여러개)
//클래스 설계시 함수 (미리 설계도를 사용)
//하는 사람에게 예외처리를 강제 
//FileInputStream fi = new FileInputStream("C:\temp");
//강제로 예외 처리 하셔야 됩니다
//반드시 처리 해라 (예외처리)
public class Test {
	
	public Test() throws Exception {
		
	}
	
	public void call() throws ArithmeticException , IndexOutOfBoundsException{
		System.out.println("Call 함수 start");
		int i = 1/0;
		System.out.println("Call 함수 end");
	}
}
