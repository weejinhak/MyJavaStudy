package Chatt_UI;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


 
class Send extends Thread implements ActionListener {
    Socket sk;
    TextField tf;
    Frame f;
    TextArea ta;
    PrintWriter pw;
 
    public Send(Socket sk, TextField tf, Frame f, TextArea ta) {
        this.sk = sk;
        this.tf = tf;
        this.f = f;
        this.ta = ta;
    }
    @Override
    public void run() {
        try {
            tf.addActionListener(this); //�׼�, ���͸� �Է¹ޱ����� ����
            pw = new PrintWriter(sk.getOutputStream(), true);
 
        } catch (IOException e1) {
            e1.printStackTrace();
        }
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) { 
        
        ta.append("���� : " + tf.getText() + "\n");
        pw.println(tf.getText());//���� �Է��ϰ� ���͸� ġ�� �� ������ TextArea�� �Ѹ���
        tf.setText("");//�Է��ߴ� ������ �����
    }
}
 
//�޼����� �޴� Ŭ����
class Receive extends Thread {
 
    Socket sk;
    TextArea ta;
 
    public Receive(Socket sk, TextArea ta) {
        this.sk = sk;
        this.ta = ta;
    }
 
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    sk.getInputStream()));
            String data = null;
            while (!(data = br.readLine()).equals("exit")) {
                ta.append("Ŭ���̾�Ʈ : " + data +"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
 
public class Server {
 
    public static void main(String[] args) throws Exception {
 
        ServerSocket ssk = new ServerSocket(9000);
        System.out.println("������ ���۵Ǿ����ϴ�.");
        Socket sk = ssk.accept();
        System.out.println("����Ǿ����ϴ�." + sk.getInetAddress());
 
        // Ŭ���̾�Ʈ�� ����Ǹ� â ����
        //���� �Է��ϴ� TextField �� ���� �����ִ� TextArea ����
        Frame f = new Frame("Server Kosta talk");
        f.setSize(500, 700);
        f.setLayout(new FlowLayout());
 
        TextArea ta = new TextArea();
        ta.setEditable(false);      //TextArea�� �Է��� �ȵǵ����Ѵ�
        f.add(ta);
    
        TextField tf = new TextField(50);
        Label la = new Label("�Է� : "); 
        f.add(la);
        f.add(tf);
 
        f.setVisible(true);
        Receive re = new Receive(sk,ta);
        re.start();
        Send send = new Send(sk, tf, f, ta);
        send.start();
        
        f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
        	
		});
    }
}
 
