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
	
		this.setLayout(new FlowLayout()); //순서대로 (add())
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pwd);
		this.add(txt_pwd);
		
		this.add(btn_ok);
		
		//최종코드 (이벤트 처리)
		btn_ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText();
				String pwd = txt_pwd.getText();
				
				if(id.equals("hong")){
					System.out.println("방가 : " + "/" + pwd);
				}else{
					System.out.println("졸고있는 당신은 누구 ?");
				}
				
			}
		});
		
		//인터페이스 구현 단점 (이벤트) 사용하지도 않는 핸들러를 가지고 있다
		//코드 개선 : WindowAdapter 필요한 것만 재정의
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
		LoginForm3 login = new LoginForm3("로그인3");

	}

}
