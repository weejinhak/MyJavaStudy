package kr.or.kosta;

public class TargetThread extends Thread {
	@Override
	public void run(){
		System.out.println("TargetThread RUN RUN");
		for(long i=0; i < 100;i++){
			try{
				Thread.sleep(1500); //1.5
			}catch(Exception e){}
		}
		
		for(long i = 0; i < 100;i++){}
	}
}
