import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP 통신
//Server(실행프로그램) - Client(실행프로그램)
//port : 9999
//IP: 192.168.0.102
public class Ex03_TCP_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999); //1번
		System.out.println("접속 대기중");
		
		Socket socket = serversocket.accept(); //클라이언트 응답이 오면 //2번
		//연결완료
		System.out.println("연결완료");
		
		//서버와 클라이언트 (read ,write)
		//socket 과 socket 연결
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out); //8가지 타입지원
		dos.writeUTF("문자데이터와 Byte 데이터 통신");
		////////////////////////////////////////////////////////
		System.out.println("서버 종료");
		
		dos.close();
		out.close();
		socket.close();
		serversocket.close();
		
		

	}

}
