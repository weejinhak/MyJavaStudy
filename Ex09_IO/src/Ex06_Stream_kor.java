import java.io.FileInputStream;
import java.io.IOException;

public class Ex06_Stream_kor {

	public static void main(String[] args) {
		FileInputStream input = null;
		try{
			input = new FileInputStream("kor.txt");
			//�ѱ� ���� : 2Byte 
			//Stream ������� 1Byte
			int data=0;
			while((data = input.read()) != -1){
				System.out.println(data + " : " + (char)data);
				
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
