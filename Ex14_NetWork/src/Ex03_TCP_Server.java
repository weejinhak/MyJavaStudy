import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP ���
//Server(�������α׷�) - Client(�������α׷�)
//port : 9999
//IP: 192.168.0.102
public class Ex03_TCP_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999); //1��
		System.out.println("���� �����");
		
		Socket socket = serversocket.accept(); //Ŭ���̾�Ʈ ������ ���� //2��
		//����Ϸ�
		System.out.println("����Ϸ�");
		
		//������ Ŭ���̾�Ʈ (read ,write)
		//socket �� socket ����
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out); //8���� Ÿ������
		dos.writeUTF("���ڵ����Ϳ� Byte ������ ���");
		////////////////////////////////////////////////////////
		System.out.println("���� ����");
		
		dos.close();
		out.close();
		socket.close();
		serversocket.close();
		
		

	}

}
