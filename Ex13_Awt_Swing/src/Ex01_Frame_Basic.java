import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

//Awt , Swing 제공하는 component 는 클래스이다


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
		 
		 Button btn = new Button("버튼");
		 btn.setSize(60, 80);
		 
		 TextField txtid = new TextField("ID 입력");
		 TextField txtpwd = new TextField(0);
		 txtpwd.setEchoChar('*');
		 
		 //Frame (컨테이너) : component 담아요
		 //FlowLayout (정렬방식 , 순서대로)
		 my.add(txtid);
		 my.add(txtpwd);
		 my.add(btn);
	}

}
