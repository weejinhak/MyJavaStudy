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
import java.net.UnknownHostException;
 
class CSend extends Thread implements ActionListener {
    Socket sk;
    TextField tf;
    Frame f;
    TextArea ta;
    PrintWriter pw;
 
    public CSend(Socket sk, TextField tf, Frame f, TextArea ta) {
        this.sk = sk;
        this.tf = tf;
        this.f = f;
        this.ta = ta;
    }
 
    public void run() {
        try {
            tf.addActionListener(this);
            pw = new PrintWriter(sk.getOutputStream(), true);
 
        } catch (IOException e1) {
            e1.printStackTrace();
        }
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
        ta.append("Ŭ���̾�Ʈ : " + tf.getText() + "\n");
        pw.println(tf.getText());
        tf.setText("");
    }
}
 
class CReceive extends Thread {
 
    Socket sk;
    TextArea ta;
 
    public CReceive(Socket sk, TextArea ta) {
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
                ta.append("���� : " + data+ "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
 
 
public class Client {
 
    public static void main(String[] args) throws Exception{
 
        Socket sk = new Socket("192.168.0.102",9000);
        System.out.println("������ ����Ǿ����ϴ�." + sk.getInetAddress());
 
        // ������ ����Ǹ� â ����
        Frame f = new Frame("Client Kosta talk");
        f.setSize(500, 700);
        f.setLayout(new FlowLayout());
 
        TextArea ta = new TextArea();
        ta.setEditable(false);
        f.add(ta);
    
        TextField tf = new TextField(50);
        Label la = new Label("�Է� : ");
        f.add(la);
        f.add(tf);
 
        f.setVisible(true);
        CReceive re = new CReceive(sk,ta);
        re.start();
        CSend send = new CSend(sk, tf, f, ta);
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
 