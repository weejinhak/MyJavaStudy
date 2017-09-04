import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kr.or.kosta.UserInfo;

//UserData.ser �� ����ȭ�� ��ü

//read (����) -> �� ��ü ���·� 
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
			
			UserInfo r1 = (UserInfo)in.readObject(); //��ü ������ read (������ȭ)
			UserInfo r2 = (UserInfo)in.readObject();
			
			System.out.println("������ ��ü:" + r1.toString());
			System.out.println("������ ��ü:" + r2.toString());
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
