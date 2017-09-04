import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//�̺�Ʈ ó��
//1. Event Source : �߻���(Button , TextField , TextArea)
//2. Event Handler : ó����(������ �Լ� �ȿ�) (��ư Ŭ�� �Ǹ� > â�� �ݱ� , â�� ���� , ���� ����)
//3. Java API : �̺�Ʈ Interface  > �Լ� 


//
class WindowHandler implements WindowListener{
   //����� �߻��ϸ� �Ʒ� �Լ��߿� �ϳ��� �ڵ� ����
	
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
		//Frame x â�� Closing �Ҷ�
		System.out.println("windowClosing");
		e.getWindow().setVisible(false);
		e.getWindow().dispose(); //�޸� ����
		
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
		f.addWindowListener(new WindowListener() { //1ȸ�� (�������̽� ���� ����)
			
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
				e.getWindow().dispose(); //�޸� ����
				
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
