import javax.swing.JOptionPane;

//����
//main �Լ������� Thread ��ü 2��
//1. �ð� (Time) �����ϴ�  Thread
//2. �ܾ� �Է��� ó���ϴ� Thread 
//main  �Լ����� 2���� Thread start()

//�� �ܾ �ϳ��� �Է��ؼ� ��ư�� ������  �ð��� ���߰� �ϼ���
//hint) �����ڿ� 

class WordInputProcess extends Thread{
	@Override
	public void run(){
		String dan = "2";
		
		String inputdata =JOptionPane.showInputDialog( dan + "�� ���� �Է��ϼ���");
		if(inputdata != null && !inputdata.equals("")){
			Ex05_WordGame.inputcheck =true;
		}
				
		System.out.println("�Է��� ���� : " + inputdata);
	}
}
class WordTimeOut extends Thread{
	@Override
	public void run(){
		for(int i =10 ; i > 0 ; i--){
			if(Ex05_WordGame.inputcheck)return; //run �Լ� ����
			try{
				System.out.println("���� �ð� : " + i);
				Thread.sleep(1000);
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	
	static boolean inputcheck =false; //hint
	
	public static void main(String[] args) {
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
		word.start();
		time.start();
		
		System.out.println("Main END");

	}

}
