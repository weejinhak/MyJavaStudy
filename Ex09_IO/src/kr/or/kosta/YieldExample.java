package kr.or.kosta;

class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run(){
		while(!stop){
			if(work){
				System.out.println("ThreadA 작업내용");
			}else{
				System.out.println("**양보**");
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}
class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run(){
		while(!stop){
			if(work){
				System.out.println("ThreadB 작업내용");
			}else{
				System.out.println("**양보**");
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}
public class YieldExample {
		public static void main(String[] args){
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			threadA.start();
			threadB.start();
			try{
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				
			}
			threadA.work =false;
			try{
				Thread.sleep(3000);
			}catch (Exception e) {
				
			}
			threadA.work = true;
			try{
				Thread.sleep(3000);
			}catch (Exception e) {
				
			}
			threadA.stop = true;
			threadB.stop = true;
		}
}
