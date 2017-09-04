//우선순위 : cpu 점유 확율을 높이겠다
//default : 5 (max : 10 , min : 1 )

class Pth extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("----");
		}
	}
}

class Pth2 extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("|||");
		}
	}
}

class Pth3 extends Thread{
	@Override
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("+++");
		}
	}
}
public class Ex06_priority {

	public static void main(String[] args) {
		Pth   pth  = new Pth();
		Pth2 pth2  = new Pth2();
		Pth3 pth3  = new Pth3();

		System.out.println(pth.getPriority());  //기본값
		System.out.println(pth2.getPriority());
		System.out.println(pth3.getPriority());
		
		
		pth.setPriority(10); // ---  (먼저 )
		pth3.setPriority(1); // +++
		
		pth.start();
		pth2.start();
		pth3.start();
		
		System.out.println("Main END");
	}

}
