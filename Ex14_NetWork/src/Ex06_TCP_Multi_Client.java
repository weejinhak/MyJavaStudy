import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_TCP_Multi_Client extends JFrame implements ActionListener , Runnable{
	JTextArea ta;//���â
	JTextField txtinput;//�Է�â
	DataInputStream in;
	DataOutputStream out;
	
	Ex06_TCP_Multi_Client() {
		//UI ����
		this.setTitle("Multi ä��");
		ta  = new JTextArea();
		txtinput = new JTextField();
		JScrollPane sp = new JScrollPane(ta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				                        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setAutoscrolls(true);
		ta.setBackground(Color.yellow);
		ta.setLineWrap(true); //�ؽ�Ʈ �ڵ� �ٹٲ�
		ta.setEditable(false); //���� �ȵǿ�
		
		txtinput.setText("���Ⱑ ��ȭ �Է�â");
		
		this.add(sp,"Center");
		this.add(txtinput, "South");
		this.setSize(400,500);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtinput.requestFocus();
		txtinput.selectAll();
		
		//�̺�Ʈ ó��
		txtinput.addActionListener(this);
		
		//���� �����ϱ�
		try{
			Socket socket = new Socket("192.168.0.102", 9999);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			//������ ����
			ta.append("������ ���ӵǾ����ϴ� \r\n");
			
			//Thread �����ϱ�
			Thread client = new Thread(this);
			client.start();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
		//Runnable
		@Override
		public void run() {
			try{
				String msg = in.readUTF();
				ta.append(msg + "\r\n");
				while(in != null){
					msg = in.readUTF();
					ta.append(msg + "\r\n");
				}
			}catch(Exception e){
				System.out.println("������ ������ ���� ����");
				return;
			}
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			//TextField �Է��ϰ� Enter ó���ϸ�
			//txtinput.addActionListener(this);
			//ActionEvent (�̺�Ʈ �߻��� )
			if(e.getSource().equals(txtinput)){
				String msg = txtinput.getText();
				try{
					out.writeUTF(msg); //������ ���
					txtinput.setText("");
				}catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			}
			
		}
	public static void main(String[] args) {
		Ex06_TCP_Multi_Client client = new Ex06_TCP_Multi_Client();

	}

	

}
