
//Thread : 프로세스에서 하나의 최소 실행단위 => method

//Thread 생성 방법
//1. Thread 클래스를 상속 -> class Test extends Thread 상속
//   반드시 Thread 클래스에 있는 run 메서드를 재정의(구현)
//2. runnable 인터페이스 구현 > run() 추상 메서드
//   class Test2 implements runnable { run(){}  }
//   추가적으로 별도의 쓰레드 객체 만들어서 의존 

// 특정한 클래스가 다른 클래스를 상속 Thread 역활 인터페이스 구현
// 확장성에 대한
// class T extends person implements Runnable{ }


class Thread_1 extends Thread{
	
	@Override
	public void run(){ //새로운 stack 처음 올라가는 메서드 (마치 main 처럼)
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("Thrad : " + i + this.getName());
		}
		System.out.println("Thread_1 run() END");
	}
}

class Thread_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("runnable : " + i);
		}
		System.out.println("runnable_2 run() END");
	}
	
}


public class Ex02_Multi_Thread {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		//////// 1번  //////////////////////
		Thread_1 th = new Thread_1();
		th.start();
		//////////////////////////////
		
		
		//////// 2번 //////////////////////
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2); 
		thread.start();
		
		
		
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("main : " + i);
		}
		
		System.out.println("Main End");
	}

}
