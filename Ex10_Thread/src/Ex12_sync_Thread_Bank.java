//��������ϳ� ������ �־��
//������� �Ա� , ��� ó���� �� �� �־��

//ģ�����ϰ� ���� (���� ���� ���¿����� ī�带 5�� �߱�)
//���ÿ� �Ѱ��¿����� ���ó�� 

//���� 1000 
//ATM �⿡�� ���ÿ� ��ݹ�ư 

//������ �Լ��� ����� 
//������ ���ó���� �ҷ��� �Ѵٸ� �� �۾��� ���������� ����ȭ��
//�����ϵ��� ���� 

//1 ����ȭ ���� ����

class Account{ //����
	int balance = 1000; //�ܾ�	
	
	//���ó��
	synchronized void withDraw(int money){
		System.out.println("��: " +Thread.currentThread().getName());
		System.out.println("���� �ܾ� : " + this.balance);
		if(this.balance >= money){
			try{
				Thread.sleep(100); //���� ó�� �Ǵ� ���� (���� ...)
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			balance -= money;
		}
		System.out.println("����ݾ� : " + money);
		System.out.println("������ �ܾ� : " + this.balance);
	}
}

class Bank implements Runnable{
	Account acc  = new Account();
	@Override
	public void run() {
		while(acc.balance > 0){
			int money = ((int)(Math.random()*3) +1)*100;
		    //�� ���ó��
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
