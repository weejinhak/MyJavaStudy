import javax.swing.JOptionPane;

//단어 맞추기 게임
//구구단 게임

//일정한 시간을 부여 

//단어를 입력받는 동시에 시간도 흘러가기를 원해요
//단어 입력 하고 확인 (기능)
//시간을 체크해서 처리 (기능)

public class Ex03_Single_word_game {

	public static void main(String[] args) {
		
		String inputdata =JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력한 값은 : " + inputdata);
		
		Timer();
	}
	static void Timer(){
		for(int i =10 ; i > 0 ; i--){
			System.out.println("남은 시간 : " + i);
			try{
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}


