import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Btn_Handler implements ActionListener{

	//actionPerformed 버튼 클릭시 자동호출되는 함수
	//버튼 클릭시 id, pwd 가지고 와서 검증
	private TextField txtid;
	private TextField txtpwd;
	
	Btn_Handler(TextField txtid , TextField txtpwd) {
		this.txtid = txtid;
		this.txtpwd = txtpwd;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getSource());
		//System.out.println("Click");
		if(txtid.getText().equals("hong")){
			System.out.println("방가 : " + "/" + txtpwd.getText());
		}else{
			System.out.println("졸고있는 당신은 누구 ?");
		}
		
	}
	
}



class LoginForm extends Frame{
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	LoginForm(String title) {
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
		btn_ok.addActionListener(new Btn_Handler(txt_id,txt_pwd));
		//txt_id.getText()
	}
}


public class Ex16_Button_Event {

	public static void main(String[] args) {
		LoginForm login = new LoginForm("로그인");

	}

}
