import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//JAVA API
//URL 클래스 (URL 인터넷상에 주소를 다루는 클래스)
//URLConnection 클래스 (연결된 URL 주소를 통해 작업)
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
		
		System.out.println("파일 크기 : " + filesize);
		System.out.println("파일 형식 : " + uc.getContentType());
		
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
