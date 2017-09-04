import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//Client
//���� : IP , PORT
public class Ex03_TCP_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.120", 9999);
		System.out.println("������ ����Ǿ����ϴ�");
		
		//�������� ���� �޽��� �ޱ�
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String servermsg = dis.readUTF();
		System.out.println("�������� ���� �޽��� : " + servermsg);
		
		dis.close();
		in.close();
		socket.close();

	}

}
