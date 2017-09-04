import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class LoginForm3 extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	LoginForm3(String title) {
		super(title);
		lbl_id = new Label("ID:",Label.RIGHT);
		lbl_pwd = new Label("PWD:",Label.RIGHT);
		
		txt_id = new TextField(10);
		txt_pwd = new TextField(10);
		txt_pwd.setEchoChar('#');
		btn_ok = new Button("login");
	
		this.setLayout(new FlowLayout()); //������� (add())
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pwd);
		this.add(txt_pwd);
		
		this.add(btn_ok);
		
		//�����ڵ� (�̺�Ʈ ó��)
		btn_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")){
					System.out.println("�氡 : " + "/" + pwd);
				}else{
					System.out.println("�����ִ� ����� ���� ?");
				}
				
			}
		});
		
		//�������̽� ���� ���� (�̺�Ʈ) ��������� �ʴ� �ڵ鷯�� ������ �ִ�
		//�ڵ� ���� : WindowAdapter �ʿ��� �͸� ������
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
			
			
		});

	}
	
}
public class Ex18_Button_Event_Final {

	public static void main(String[] args) {
		LoginForm3 login = new LoginForm3("�α���3");

	}

}
