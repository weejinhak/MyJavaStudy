import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.kosta.UserInfo;

public class Ex17_ObjectOutputStream {

	public static void main(String[] args) {
		
		String filename = "UserData.txt";
		try{
			FileOutputStream fos = new FileOutputStream(filename);//���� ����
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//��ü ��� (����ȭ �ؼ� write) : ��ü������ write
			ObjectOutputStream out = new ObjectOutputStream(bos);
			UserInfo u1 = new UserInfo("superman", "super", 1000);
			UserInfo u2 = new UserInfo("scott", "tiger", 50);
			
			out.writeObject(u1); //����ȭ �۾�
			out.writeObject(u2); 
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("���ϻ��� > ����ȭ > ��ü write()");
			
		}catch (Exception e) {
			
		}finally {
			
		}

	}

}
