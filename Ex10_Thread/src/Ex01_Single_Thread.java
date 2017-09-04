
//싱글 프로세스 + 싱글 쓰레드 (main)

//Single-Thread > JVM [stack] 하나만
//기능(함수) 순차적으로 실행
//IO 작업까지는 

//main Thread 하나가지고

public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("나 main Thread 야");
		worker();
		worker2();
		System.out.println("main Thread  종료");
	}
	static void worker(){
		System.out.println("나 1번 일꾼이야");
	}
	static void worker2(){
		System.out.println("나 2번 일꾼이야");
	}

}
