import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.kosta.UserInfo;

//UserData.ser 에 직력화된 객체

//read (복원) -> 원 객체 상태로 
public class Ex18_ObjectInputStream {

	public static void main(String[] args) {
		String filename ="UserData.txt";
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try{
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis);
			
			UserInfo r1 = (UserInfo)in.readObject(); //객체 단위로 read (역직렬화)
			UserInfo r2 = (UserInfo)in.readObject();
			
			System.out.println("복원된 객체:" + r1.toString());
			System.out.println("복원된 객체:" + r2.toString());
		}catch(Exception e){
			
		}finally {
			try {
				in.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
