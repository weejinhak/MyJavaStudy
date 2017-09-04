package kr.or.kosta;

public class StatePrintThread  extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread){
		this.targetThread = targetThread;
	}
	
	@Override
	public void run(){
		while(true){
			//Thread.State ������
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			
			if(state == Thread.State.NEW){
				targetThread.start(); //start
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}
			try{
				Thread.sleep(50);
			}catch (Exception e) {
				
			}
		}
	}

}
