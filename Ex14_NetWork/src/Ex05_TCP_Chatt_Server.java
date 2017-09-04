import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//���� : Ŭ���̾�Ʈ 1:1 ���
//���� : read , write
//Ŭ���̾�Ʈ : read , write
//Ex01~Ex04 ���� (������ ) ������ Ŭ���̾�Ʈ ���� ������ 
//���ÿ� read / write �۾��� �̷��������
//Thread ���ؼ� 
//���� read(Thread) , write(Thread)
//Ŭ���̾�Ʈ read(Thread), write(Thread)

public class Ex05_TCP_Chatt_Server {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9999);
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			Socket socket = serversocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ...");
			
			new ServerSend(socket).start();
			new ServerReceive(socket).start();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
		

	}

}
class ServerSend extends Thread{
//Console �� �Է��� ���� read �ؼ�
//OutputStream ����ؼ� writer 
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
			//Scanner ���
			//Scanner sc = new Scanner(System.in)
			//line ���� read
			 br = new BufferedReader(new InputStreamReader(System.in));
		
			//���
			 pw = new PrintWriter(socket.getOutputStream(),true); //true(auto flush)
			
			while(true){
				String data = br.readLine(); //sc.nextLine()
				if(data.equals("exit"))break;
				pw.println(data); //������ Client �޽��� write �ϱ�
			}
			System.out.println("Server Send �۾� ����");
			
			
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
			//InputStreamReader �� ���ؼ� InputStream > reader ��ȯ
			br = new BufferedReader(new InputStreamReader(
					                                socket.getInputStream()));
			String data = null;
			while((data = br.readLine()) != null){
				System.out.println("Client ���� �޽��� :[" + data + "]");
			}
			System.out.println("ServerReceive �۾�����");
		}catch(Exception e){
			
		}finally{
			try {br.close();}catch(IOException e){}
		}
	}
	
}






