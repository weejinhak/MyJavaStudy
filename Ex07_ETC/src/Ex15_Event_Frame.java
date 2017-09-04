import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리
//1. Event Source : 발생지(Button , TextField , TextArea)
//2. Event Handler : 처리기(지정된 함수 안에) (버튼 클릭 되면 > 창을 닫기 , 창을 열기 , 글을 쓸것)
//3. Java API : 이벤트 Interface  > 함수 


//
class WindowHandler implements WindowListener{
   //사건이 발생하면 아래 함수중에 하나가 자동 동작
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//Frame x 창이 Closing 할때
		System.out.println("windowClosing");
		e.getWindow().setVisible(false);
		e.getWindow().dispose(); //메모리 제거
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex15_Event_Frame {

	public static void main(String[] args) {
		Frame f = new Frame("login");
		f.setSize(300, 200);
		f.setVisible(true);
		//f.addWindowListener(new WindowHandler());
		f.addWindowListener(new WindowListener() { //1회성 (인터페이스 직접 구현)
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				e.getWindow().setVisible(false);
				e.getWindow().dispose(); //메모리 제거
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
