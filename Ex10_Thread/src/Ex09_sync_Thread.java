//동기화 
//한강 (화장실)
//한강 (비빕밥축제)

//Multi Thread (환경)에서 [공유자원]
//잠금장치 (lock) 

class Wroom {
	//동기화 보장 :synchronized
	//김씨 : 화장실을 사용중이면 다른 사람 대기
	public synchronized void OpenDoor(String name){
		System.out.println(name + "님 화장실 입장 ^^");
		for(int i = 0; i < 10000 ; i++){
			if(i == 1000){
				System.out.println(name + "님 끙 !!");
			}
		}
		System.out.println(name + "시원하시죠 ...");
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
		
		//한강 둔치
		//화장실 1개
		
		Wroom w = new Wroom();
		
		Users kim = new Users("김씨", w);
		Users Lee = new Users("이씨", w);
		Users Park = new Users("박씨", w);

		kim.start();
		Lee.start();
		Park.start();
		
	}

}
