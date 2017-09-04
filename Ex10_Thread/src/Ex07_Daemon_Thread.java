
public class Ex07_Daemon_Thread implements Runnable {

	static boolean autosave = false;
	public static void main(String[] args) {
		
		Thread th = new Thread(new Ex07_Daemon_Thread());
		
		//main 함수 쓰레드 안에서 Daemon 설정 
		//main 함수 의 보조 쓰레드 
		th.setDaemon(true);
		th.start();
		
		//main thread
		for(int i = 0 ; i <= 30 ; i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			System.out.println("Main Thread : " + i);
			if(i == 5){
				System.out.println(i);
				autosave = true;
			}
		}

	}

	@Override
	public void run() {
		while(true){
			try{
				Thread.sleep(3000);
			}catch (Exception e) {
				
			}
			//조건
			if(autosave){ //autosave > true
				AutoSave();
			}
		}
		
	}
	
	public void AutoSave(){
		System.out.println("문서가 자동 저장 되었습니다");
	}

}
