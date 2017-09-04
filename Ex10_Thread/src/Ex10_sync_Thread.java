//Thread 간 객체 공유
class RunnableImpl implements Runnable{
    int iv = 0; //member field (instance variable)
    
	@Override
	public void run() {
		int lv = 0; //local variable
		String name = Thread.currentThread().getName();
		while(lv < 3){
			System.out.println(name + "local var : " + ++lv);
			System.out.println(name + "instance var : " + ++iv);
			System.out.println();
		}
		
	}
	
}
public class Ex10_sync_Thread {

	public static void main(String[] args) {
		
		/*RunnableImpl r = new RunnableImpl();
		RunnableImpl r2 = new RunnableImpl();
		Thread th = new Thread(r);
		Thread th2 = new Thread(r2);
		
		th.start();
		th2.start();
		 */
		RunnableImpl r = new RunnableImpl();
		//문제점 : 쓰레드가 사용하는 객체가 같은 주소
		Thread th = new Thread(r);
		Thread th2 = new Thread(r);
		
		th.start();
		th2.start();
	}

}
