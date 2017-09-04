import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex04_TCP_EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.102", 9999);
		System.out.println("서버와 연결 되었습니다");
		
		//server read
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		//server write
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("서버에 전송할 메시지 입력:");
			String msg = s.nextLine();
			
			//전송
			dos.writeUTF(msg);
			dos.flush();
			
			if(msg.equals("exit"))break;
			
			String servermsg = dis.readUTF();
			System.out.println("Echo 메시지 : " + servermsg);
		}
		System.out.println("클라이언트 종료");
		dis.close();
		dos.close();
		socket.close();
		
		

	}

}
