
//Thread 상태정보 
//각 각의 Thread 를 개발자가 제어 
//sleep()
//join()

//복잡한 계산을 여러개의 쓰레드 나누어서 처리 
//그 계산 결과를 참조해서 최종적인 결과를 만들고 싶어요

//main 쪽에서 나는 내가 지정한 Thread 끝날때까지 기다렸다고
//마지막에 끝날거야

class Thread_Join extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 3000 ; i++){
			System.out.println("------");
		}
	}
}
class Thread_Join2 extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 3000 ; i++){
			System.out.println("||||||");
		}
	}
}

public class Ex08_Thread_State_join {
	public static void main(String[] args) {
		Thread_Join th = new Thread_Join();
		Thread_Join2 th2 = new Thread_Join2();
		
		th.start();
		th2.start();
		
		long starttime = System.currentTimeMillis();
		
		try{
			//main 가 요청 (join)
			//main 나 기다릴거야 th , th2 작업이 끝날때까지 
			 th.join();
			 th2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		for(int i = 0; i < 3000 ; i++){
			System.out.println("^^^^^^");
		}
		//3개의 쓰레드가 실행한 결과(총 걸린 시간)
        System.out.println("3개의 쓰레드가 작업 총시간 : ");
        System.out.println(System.currentTimeMillis() -starttime);
        System.out.println("Main END");
	}

}
