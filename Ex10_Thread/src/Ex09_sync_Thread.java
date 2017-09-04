//����ȭ 
//�Ѱ� (ȭ���)
//�Ѱ� (���������)

//Multi Thread (ȯ��)���� [�����ڿ�]
//�����ġ (lock) 

class Wroom {
	//����ȭ ���� :synchronized
	//�达 : ȭ����� ������̸� �ٸ� ��� ���
	public synchronized void OpenDoor(String name){
		System.out.println(name + "�� ȭ��� ���� ^^");
		for(int i = 0; i < 10000 ; i++){
			if(i == 1000){
				System.out.println(name + "�� �� !!");
			}
		}
		System.out.println(name + "�ÿ��Ͻ��� ...");
	}
}

class Users extends Thread{
	private Wroom wr;
	private String who;
	
	public Users(String name, Wroom wr){
		this.who = name;
		this.wr = wr;
	}
	@Override
	public void run(){
		wr.OpenDoor(this.who);
	}
}

public class Ex09_sync_Thread {

	public static void main(String[] args) {
		
		//�Ѱ� ��ġ
		//ȭ��� 1��
		
		Wroom w = new Wroom();
		
		Users kim = new Users("�达", w);
		Users Lee = new Users("�̾�", w);
		Users Park = new Users("�ھ�", w);

		kim.start();
		Lee.start();
		Park.start();
		
	}

}
