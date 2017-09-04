import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex04_TCP_EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.102", 9999);
		System.out.println("������ ���� �Ǿ����ϴ�");
		
		//server read
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		//server write
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("������ ������ �޽��� �Է�:");
			String msg = s.nextLine();
			
			//����
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit"))break;
			
			String servermsg = dis.readUTF();
			System.out.println("Echo �޽��� : " + servermsg);
		}
		System.out.println("Ŭ���̾�Ʈ ����");
		dis.close();
		dos.close();
		socket.close();
		
		

	}

}
