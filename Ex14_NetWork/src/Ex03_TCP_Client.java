import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//Client
//서버 : IP , PORT
public class Ex03_TCP_Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.120", 9999);
		System.out.println("서버와 연결되었습니다");
		
		//서버에서 보낸 메시지 받기
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String servermsg = dis.readUTF();
		System.out.println("서버에서 보낸 메시지 : " + servermsg);
		
		dis.close();
		in.close();
		socket.close();

	}

}
