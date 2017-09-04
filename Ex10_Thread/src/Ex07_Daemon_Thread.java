
public class Ex07_Daemon_Thread implements Runnable {

	static boolean autosave = false;
	public static void main(String[] args) {
		
		Thread th = new Thread(new Ex07_Daemon_Thread());
		
		//main �Լ� ������ �ȿ��� Daemon ���� 
		//main �Լ� �� ���� ������ 
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
			//����
			if(autosave){ //autosave > true
				AutoSave();
			}
		}
		
	}
	
	public void AutoSave(){
		System.out.println("������ �ڵ� ���� �Ǿ����ϴ�");
	}

}
