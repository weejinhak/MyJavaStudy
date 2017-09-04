//은행계좌하나 가지고 있어요
//은행계좌 입금 , 출금 처리를 할 수 있어요

//친구들하고 모의 (은행 같은 계좌에대한 카드를 5장 발급)
//동시에 한계좌에에서 출급처리 

//통장 1000 
//ATM 기에서 동시에 출금버튼 

//정보를 입수한 계발자 
//누군자 출금처리를 할려고 한다면 이 작업이 끝날때까지 동기화를
//보장하도록 설계 

//1 동기화 보장 없이

class Account{ //계좌
	int balance = 1000; //잔액	
	
	//출금처리
	synchronized void withDraw(int money){
		System.out.println("고객: " +Thread.currentThread().getName());
		System.out.println("현재 잔액 : " + this.balance);
		if(this.balance >= money){
			try{
				Thread.sleep(100); //업무 처리 되는 과정 (인증 ...)
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance -= money;
		}
		System.out.println("인출금액 : " + money);
		System.out.println("인출후 잔액 : " + this.balance);
	}
}

class Bank implements Runnable{
	Account acc  = new Account();
	@Override
	public void run() {
		while(acc.balance > 0){
			int money = ((int)(Math.random()*3) +1)*100;
		    //실 출금처리
			acc.withDraw(money);
		}
		//acc.withDraw()
		
	}
	
}


public class Ex12_sync_Thread_Bank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Thread th = new Thread(bank, "Park");
		Thread th2 = new Thread(bank, "Kim");
		Thread th3 = new Thread(bank, "Lee");
		
		th.start();
		th2.start();
		th3.start();
	}

}
