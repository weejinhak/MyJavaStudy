import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosta.UserInfo;

public class Ex17_ObjectOutputStream {

	public static void main(String[] args) {
		
		String filename = "UserData.txt";
		try{
			FileOutputStream fos = new FileOutputStream(filename);//파일 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//객체 통신 (직렬화 해서 write) : 객체단위로 write
			ObjectOutputStream out = new ObjectOutputStream(bos);
			UserInfo u1 = new UserInfo("superman", "super", 1000);
			UserInfo u2 = new UserInfo("scott", "tiger", 50);
			
			out.writeObject(u1); //직렬화 작업
			out.writeObject(u2); 
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("파일생성 > 직렬화 > 객체 write()");
			
		}catch (Exception e) {
			
		}finally {
			
		}

	}

}
