import java.io.FileInputStream;
import java.io.IOException;

public class Ex06_Stream_kor {

	public static void main(String[] args) {
		FileInputStream input = null;
		try{
			input = new FileInputStream("kor.txt");
			//한글 한자 : 2Byte 
			//Stream 연결통로 1Byte
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
