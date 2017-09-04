import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_EchoServer {

	public static void main(String[] args) throws IOException {
		//서버코드
		ServerSocket serversocket = new ServerSocket(9999);
		System.out.println("클라이언트 접속 대기중 .....");
		Socket socket = serversocket.accept(); 
		System.out.println("클라이언트 연결");
		
		//read , write
		//Client 보낸 메시지 read
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		//Client 메시지 보내기 write
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		while(true){
			//read
			System.out.println("GOGO");
			String clientmsg = dis.readUTF(); //...
			System.out.println("Client Msg : " + clientmsg);
			
			if(clientmsg.equals("exit"))break;
			
			//메아리 기능
			dos.writeUTF(clientmsg);
			dos.flush();
		}
		System.out.println("클라이언트 exit 문자 :  서버종료");
		dis.close();
		dos.close();
		socket.close();
		serversocket.close();
	}

}
