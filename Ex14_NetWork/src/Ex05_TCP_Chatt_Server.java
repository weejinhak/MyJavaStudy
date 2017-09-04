import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 : 클라이언트 1:1 통신
//서버 : read , write
//클라이언트 : read , write
//Ex01~Ex04 연습 (순차적 ) 서버와 클라이언트 간에 순차적 
//동시에 read / write 작업이 이루어졌으면
//Thread 통해서 
//서버 read(Thread) , write(Thread)
//클라이언트 read(Thread), write(Thread)

public class Ex05_TCP_Chatt_Server {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9999);
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serversocket.accept();
			System.out.println("클라이언트 접속 ...");
			
			new ServerSend(socket).start();
			new ServerReceive(socket).start();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
		

	}

}
class ServerSend extends Thread{
//Console 에 입력한 값을 read 해서
//OutputStream 사용해서 writer 
//Socket > input, output Stream
	Socket socket;
	ServerSend(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run(){
		BufferedReader br = null;
		PrintWriter pw = null;
		try{
			//Scanner 대신
			//Scanner sc = new Scanner(System.in)
			//line 단위 read
			 br = new BufferedReader(new InputStreamReader(System.in));
		
			//출력
			 pw = new PrintWriter(socket.getOutputStream(),true); //true(auto flush)
			
			while(true){
				String data = br.readLine(); //sc.nextLine()
				if(data.equals("exit"))break;
				pw.println(data); //접속한 Client 메시지 write 하기
			}
			System.out.println("Server Send 작업 종료");
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{
				pw.close();
				br.close();
			}catch(Exception e){}
			
		}
	}
}
class ServerReceive extends Thread{
	Socket socket;
	ServerReceive(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run(){
		BufferedReader br = null;
		try{
			//InputStreamReader 를 통해서 InputStream > reader 변환
			br = new BufferedReader(new InputStreamReader(
					                                socket.getInputStream()));
			String data = null;
			while((data = br.readLine()) != null){
				System.out.println("Client 받은 메시지 :[" + data + "]");
			}
			System.out.println("ServerReceive 작업종료");
		}catch(Exception e){
			
		}finally{
			try {br.close();}catch(IOException e){}
		}
	}
	
}






