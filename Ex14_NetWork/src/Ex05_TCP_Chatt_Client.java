import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex05_TCP_Chatt_Client {
	
	public static void main(String[] args) {
		Ex05_TCP_Chatt_Client client = new Ex05_TCP_Chatt_Client();

	}
	
	Socket socket;
	Ex05_TCP_Chatt_Client() {
		try{
			socket = new Socket("192.168.0.102", 9999);
			System.out.println("Chatt ������ ���� �Ǿ����ϴ�");
			new ClientSend().start();
			new ClientReceive().start();
		}catch (Exception e) {
			
		}
	}
	
	//Inner Class �۾�
	class ClientSend extends Thread{
			@Override
			public void run(){
				BufferedReader br = null;
				PrintWriter pw = null;
				try{
					 br = new BufferedReader(new InputStreamReader(System.in));
					 pw = new PrintWriter(socket.getOutputStream(),true); //true(auto flush)
					
					while(true){
						String data = br.readLine(); //sc.nextLine()
						if(data.equals("exit"))break;
						pw.println(data); //������ Client �޽��� write �ϱ�
					}
					System.out.println("Client Send �۾� ����");
					
					
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
	
	//Inner Class �۾�
	class ClientReceive extends Thread{
			
		@Override
		public void run(){
			BufferedReader br = null;
			try{
				//InputStreamReader �� ���ؼ� InputStream > reader ��ȯ
				br = new BufferedReader(new InputStreamReader(
						                                socket.getInputStream()));
				String data = null;
				while((data = br.readLine()) != null){
					System.out.println("Server ���� �޽��� :[" + data + "]");
				}
				System.out.println("ClientReceive �۾�����");
			}catch(Exception e){
				
			}finally{
				try {br.close();}catch(IOException e){}
			}
		}
		
	}

	
	
	
	

}
