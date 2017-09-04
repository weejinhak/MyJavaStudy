import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame{
	MyFrame(String title){
		super(title);
	}
}
class BtnClickHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�� Ŭ�� ^^");
		
	}
	
}


public class Ex14_Awt_Frame {
	public static void main(String[] args){
		MyFrame my = new MyFrame("Login");
		my.setSize(350, 300);
		my.setVisible(true);
		my.setLayout(new FlowLayout());
		
		Button btn = new Button("�� ��ư");
		Button btn2 = new Button("Two Button");
		Button btn3 = new Button("Three Button");
		
		//��ư���� �̺�Ʈ ������ ���̱� 
		//�̺�Ʈ �ڵ鷯 ���� ��ü : ����
		/*btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�������̽� ���� ����");
				
			}
		});*/
		BtnClickHandler handler = new BtnClickHandler();
		btn.addActionListener(handler);
		
		btn2.addActionListener(handler);
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Three Click");
				
			}
		});
		
		
		btn.setSize(60,80);
		//btn2.setSize(60,80);
		my.add(btn);
		my.add(btn2);
		my.add(btn3);
	}
}
