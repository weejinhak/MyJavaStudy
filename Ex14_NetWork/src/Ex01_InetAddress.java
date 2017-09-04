import java.net.InetAddress;

//Java API �����ϴ� Ŭ���� 
//��Ʈ��ũ �۾� (Ŭ����)

public class Ex01_InetAddress {

	public static void main(String[] args) {
		InetAddress inet = null;
		String domain = "www.naver.com";
		
		try{
			 inet = InetAddress.getByName(domain);
			 System.out.println(inet.getHostAddress());
			 
			 InetAddress[] InetAddr =  InetAddress.getAllByName(domain);
			 for(InetAddress addr : InetAddr){
				 System.out.println(addr.toString());
			 }
			 
			 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
