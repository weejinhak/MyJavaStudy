package kr.or.kosta;

class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run(){
		while(!stop){
			if(work){
				System.out.println("ThreadA �۾�����");
			}else{
				System.out.println("**�纸**");
				Thread.yield();
			}
		}
		System.out.println("ThreadA ����");
	}
}
class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run(){
		while(!stop){
			if(work){
				System.out.println("ThreadB �۾�����");
			}else{
				System.out.println("**�纸**");
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
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
