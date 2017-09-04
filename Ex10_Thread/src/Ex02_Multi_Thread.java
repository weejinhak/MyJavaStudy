
//Thread : ���μ������� �ϳ��� �ּ� ������� => method

//Thread ���� ���
//1. Thread Ŭ������ ��� -> class Test extends Thread ���
//   �ݵ�� Thread Ŭ������ �ִ� run �޼��带 ������(����)
//2. runnable �������̽� ���� > run() �߻� �޼���
//   class Test2 implements runnable { run(){}  }
//   �߰������� ������ ������ ��ü ���� ���� 

// Ư���� Ŭ������ �ٸ� Ŭ������ ��� Thread ��Ȱ �������̽� ����
// Ȯ�强�� ����
// class T extends person implements Runnable{ }


class Thread_1 extends Thread{
	
	@Override
	public void run(){ //���ο� stack ó�� �ö󰡴� �޼��� (��ġ main ó��)
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("Thrad : " + i + this.getName());
		}
		System.out.println("Thread_1 run() END");
	}
}

class Thread_2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("runnable : " + i);
		}
		System.out.println("runnable_2 run() END");
	}
	
}


public class Ex02_Multi_Thread {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		//////// 1��  //////////////////////
		Thread_1 th = new Thread_1();
		th.start();
		//////////////////////////////
		
		
		//////// 2�� //////////////////////
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2); 
		thread.start();
		
		
		
		for(int i = 0 ; i < 1000 ; i++){
			System.out.println("main : " + i);
		}
		
		System.out.println("Main End");
	}

}
