import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

//���� ä��
//���� 1�� 
//�������� Ŭ���̾�Ʈ
public class Ex06_TCP_Multi_Server {
	ServerSocket serversocket = null;
	Socket socket = null;
	//key point
	HashMap<String, DataOutputStream> ClientMap;
	
	//������
	Ex06_TCP_Multi_Server(){
		//�� Ŭ���̾�Ʈ (Socket ��°�ü�� ����)
		ClientMap = new HashMap<String,DataOutputStream>();
	}
	
	
	
	//1. ���� ���� �ʱ�ȭ
	public void init(){
		try{
			serversocket = new ServerSocket(9999);
			System.out.println("[������ ���� �Ǿ����ϴ�]");
			
			while(true){
				socket = serversocket.accept();
				System.out.println("[" + socket.getInetAddress() + "/"+
				                  socket.getPort() + "]");
				
				//�ڵ� �۾�
				//Ŭ���̾�Ʈ ���ӽ� ���� ...
				Thread client = new MultiServerRev(socket);
				client.start();
				
			}
			
		}catch(Exception e){
			
			System.out.println("Init() : " + e.getMessage());
		}
	}
	
	//2. ���ӵ� ��� Ŭ���̾�Ʈ���� (Socket) �޽����� �����ϴ� ��� �Լ�
	//(key,value)
	//key => ����� ID(������ ��) ex) kglim , hong , kim , lee
	//ClientMap<"ȫ�浿",������ socket��ü���� �� DataOutPutStream��ü>
	//ClientMap<"������",������ socket��ü���� �� DataOutPutStream��ü>
	void SendAllMsg(String msg){
		Iterator<String> ClientKeySet = ClientMap.keySet().iterator();
		while(ClientKeySet.hasNext()){
			try{
				 DataOutputStream clientout = ClientMap.get(ClientKeySet.next());
				 //������ Ŭ���̾�Ʈ���� �޽��� ���
				 clientout.writeUTF(msg);
			}catch(Exception e){
				System.out.println("Send Allmsg : " + e.getMessage());
			}
		}
	}

	//3. ���ӵ� ���� ����Ʈ �����ϱ�
	String showUserList(String name){
		StringBuilder output = new StringBuilder("<<������ ���>>\r\n");
		Iterator<String> users = ClientMap.keySet().iterator();
		while(users.hasNext()){
			try{
				String key = users.next(); //ȫ�浿 , ������ (������ ID)
				if(key.equals(name)){ //����� ��û�� ����ڶ��
					key +="(*)";
				}
				output.append(key+"\r\n");
			}catch(Exception e){
				System.out.println("ShowUserList ���� : " + e.getMessage());
			}
		}
		output.append("<<" + ClientMap.size() + ">>" + "�� ������ ...\r\n");
		return output.toString();
	}
	
	//4.�ӼӸ� ���
	void SendToMsg(String fromname , String toname , String toMsg){
		try {
				ClientMap.get(toname).writeUTF("�ӼӸ� from (" + fromname + ")=>" + toMsg);
				ClientMap.get(fromname).writeUTF("�ӼӸ� to(" + toname + ")=>" + toMsg);
		} catch (IOException e) {
				System.out.println("SentToMsg : " + e.getMessage());
		}	
	}
	
	//Thread ���  (inner class)
	class MultiServerRev extends Thread{
		Socket socket = null;
		DataInputStream in;
		DataOutputStream out;
		
		MultiServerRev(Socket socket) {
			this.socket = socket;
			
			try{
				in = new DataInputStream(this.socket.getInputStream());
				out = new DataOutputStream(this.socket.getOutputStream());
			}catch(Exception e){
				System.out.println("MultiServerRev :" + e.getMessage());
			}
		}
		
		@Override
		public void run(){
			//�⺻ Ŭ���̾�Ʈ : in.readUTF() , out.WriteUTF()
			String name=""; //Ŭ���̾�Ʈ �̸�(key) ����
			try{
				//����� socket�� ���ؼ� Client �޽��� ����
				out.writeUTF("�̸��� �Է��ϼ���");
				name = in.readUTF();
				out.writeUTF("���� ä�ù濡 �����Ͽ����ϴ�");
				
				//������ ���ӵ� ��� ����ڿ��� (Socket) �Էµ� ���� ����
				SendAllMsg(name + "�� �����Ͽ����ϴ�");
				
				//key point ^^
				ClientMap.put(name, out); //Map(�̸�, ���� socket output)
				System.out.println("���� ����͸� : ���� �����ڴ�" + ClientMap.size() + "��");
				
				//�߰���� (��ȭ���)
				while(in != null){
					String msg = in.readUTF();
					
					//ä��â��> /������
					
					if(msg.startsWith("/")){
						if(msg.trim().equals("/������")){
							out.writeUTF(showUserList(name)); //������ ��� ���
						}else if(msg.startsWith("/�ӼӸ�")){
							String[] msgArr = msg.split(" ",3); //[/�ӼӸ�] [ȫ�浿] [�氡�氡]
							if(msgArr == null || msgArr.length < 3){
								out.writeUTF("HELP: �ӼӸ� ����:\r\n /�ӼӸ� [�����̸�] [�����޽���]");
								//> /�ӼӸ� ȫ�浿 �氡�氡
							}else{
								//[/�ӼӸ�] [ȫ�浿] [�氡�氡]
								String toName = msgArr[1];//ȫ�浿
								String toMsg = msgArr[2]; //�氡�氡
								if(ClientMap.containsKey(toName)){
									//�޽��� ������
									//Ư�� ��뿡�Ը� �޽���
									SendToMsg(name, toName, toMsg);
								}else{
									out.writeUTF("�Է��Ͻ� ����ڰ� �����ϴ�");
								}
							}
						}else{
							out.writeUTF("�߸��� ��ɾ� �Դϴ�");
						}
					}else{
						//��ü ����ڿ��� write
						SendAllMsg("["+ name  + "]" + msg);
					}
				} //while end
				
				
			}catch(Exception e){
				System.out.println("Thred run ���ܹ߻� " + e.getMessage());
			}finally {
				//Client ���� (����)
				ClientMap.remove(name);
				SendAllMsg(name + "�� �����ϼ̽��ϴ�");
				System.out.println("���� ����͸� : ���� �����ڴ� " + ClientMap.size() + "��");
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		Ex06_TCP_Multi_Server server = new Ex06_TCP_Multi_Server();
		server.init();

	}

}
