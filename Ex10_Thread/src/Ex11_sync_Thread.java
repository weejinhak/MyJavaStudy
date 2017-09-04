
class Data{
	int iv =0; //instance variable
}

class MyThread extends Thread{
	Data d; // d라는 변수는 참조값(주소값)
	
	MyThread(Data d){
		this.d = d;
	}
	@Override
	public void run(){
		int lv =0;
		while(lv < 3){
			System.out.println(this.getName() + "local var : " + ++lv);
			System.out.println(this.getName() + "instance var : " + ++d.iv);
			System.out.println();
		}
	}
}

public class Ex11_sync_Thread {

	public static void main(String[] args) {
		Data data = new Data();
		MyThread th = new MyThread(data); //xx번지
		MyThread th2 = new MyThread(data);//xx번지
		
		th.start();
		th2.start();
		

	}

}
