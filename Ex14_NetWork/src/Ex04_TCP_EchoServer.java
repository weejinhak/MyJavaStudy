import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_EchoServer {

	public static void main(String[] args) throws IOException {
		//�����ڵ�
		ServerSocket serversocket = new ServerSocket(9999);
		System.out.println("Ŭ���̾�Ʈ ���� ����� .....");
		Socket socket = serversocket.accept(); 
		System.out.println("Ŭ���̾�Ʈ ����");
		
		//read , write
		//Client ���� �޽��� read
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		//Client �޽��� ������ write
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		while(true){
			//read
			System.out.println("GOGO");
			String clientmsg = dis.readUTF(); //...
			System.out.println("Client Msg : " + clientmsg);
			
			if(clientmsg.equals("exit"))break;
			
			//�޾Ƹ� ���
			dos.writeUTF(clientmsg);
			dos.flush();
		}
		System.out.println("Ŭ���̾�Ʈ exit ���� :  ��������");
		dis.close();
		dos.close();
		socket.close();
		serversocket.close();
	}

}
