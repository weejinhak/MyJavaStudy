import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//JAVA API
//URL Ŭ���� (URL ���ͳݻ� �ּҸ� �ٷ�� Ŭ����)
//URLConnection Ŭ���� (����� URL �ּҸ� ���� �۾�)
public class Ex02_URL_URLConnection {

	public static void main(String[] args) throws Exception {
		//String urlStr = "http://www.kangcom.com/company/history.asp";
		String urlStr = "http://image3.kangcom.com/2017/03/b_pic/201702231587.jpg";
		URL url = new URL(urlStr);
		
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		byte[] buffer = new byte[2048];
		int n = 0;
		int count = 0;
		
		URLConnection uc = url.openConnection();
		int filesize = uc.getContentLength();
		
		System.out.println("���� ũ�� : " + filesize);
		System.out.println("���� ���� : " + uc.getContentType());
		
		while((n = bis.read(buffer)) != -1){
			fos.write(buffer,0,buffer.length);
			fos.flush();
			System.out.println("n : " + n);
			count+=1;
		}
		
		System.out.println("count : " + count);
		fos.close();
		bis.close();

	}

}
