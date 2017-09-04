
//Thread �������� 
//�� ���� Thread �� �����ڰ� ���� 
//sleep()
//join()

//������ ����� �������� ������ ����� ó�� 
//�� ��� ����� �����ؼ� �������� ����� ����� �;��

//main �ʿ��� ���� ���� ������ Thread ���������� ��ٷȴٰ�
//�������� �����ž�

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
			//main �� ��û (join)
			//main �� ��ٸ��ž� th , th2 �۾��� ���������� 
			 th.join();
			 th2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		for(int i = 0; i < 3000 ; i++){
			System.out.println("^^^^^^");
		}
		//3���� �����尡 ������ ���(�� �ɸ� �ð�)
        System.out.println("3���� �����尡 �۾� �ѽð� : ");
        System.out.println(System.currentTimeMillis() -starttime);
        System.out.println("Main END");
	}

}
