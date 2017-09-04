import javax.swing.JOptionPane;

//문제
//main 함수제외한 Thread 객체 2개
//1. 시간 (Time) 제어하는  Thread
//2. 단어 입력을 처리하는 Thread 
//main  함수에서 2개의 Thread start()

//단 단어를 하나라도 입력해서 버튼을 누르면  시간을 멈추게 하세요
//hint) 공유자원 

class WordInputProcess extends Thread{
	@Override
	public void run(){
		String dan = "2";
		
		String inputdata =JOptionPane.showInputDialog( dan + "단 값을 입력하세요");
		if(inputdata != null && !inputdata.equals("")){
			Ex05_WordGame.inputcheck =true;
		}
				
		System.out.println("입력한 값은 : " + inputdata);
	}
}
class WordTimeOut extends Thread{
	@Override
	public void run(){
		for(int i =10 ; i > 0 ; i--){
			if(Ex05_WordGame.inputcheck)return; //run 함수 종료
			try{
				System.out.println("남은 시간 : " + i);
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
