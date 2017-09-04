import java.net.InetAddress;

//Java API 제공하는 클래스 
//네트워크 작업 (클래스)

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
