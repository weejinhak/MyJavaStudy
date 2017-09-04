import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

//Awt , Swing �����ϴ� component �� Ŭ�����̴�


class MyFrame extends Frame{
	MyFrame(String title) {
		super(title);
	}
}

public class Ex01_Frame_Basic {

	public static void main(String[] args) {
		 MyFrame my = new MyFrame("mylogin");
		 my.setSize(200, 300);
		 my.setVisible(true);
		 
		 my.setLayout(new FlowLayout());
		 
		 Button btn = new Button("��ư");
		 btn.setSize(60, 80);
		 
		 TextField txtid = new TextField("ID �Է�");
		 TextField txtpwd = new TextField(0);
		 txtpwd.setEchoChar('*');
		 
		 //Frame (�����̳�) : component ��ƿ�
		 //FlowLayout (���Ĺ�� , �������)
		 my.add(txtid);
		 my.add(txtpwd);
		 my.add(btn);
	}

}