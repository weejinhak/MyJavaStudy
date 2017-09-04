import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//���� read , write
//���� Ŭ���� �ܵ� ��� 
//������� (BufferedInputStream , BufferedOutputStream ) ���� ��Ʈ��
//������Ʈ���� �ֽ�Ʈ���� ���� �ִ� ��Ȱ
// 1. File I/O ���� ���� �� �ִ� 
// 2. Line ������ ������ ó�� ����
// ȥ�� ���� �ȵǿ� : 	BufferedInputStream bs = new BufferedInputStream(inputStream s)

public class Ex05_Stream_buffered_File {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			//C:\Kosta151\JavaBasic\Labs\Ex09_IO\ ����
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i = '1' ; i <= '9' ; i++){
				bos.write(i); //buffer �� ���ؼ� data.txt ���Ͽ� write
			}
			
			//���� Buffer Ư¡
			//Buffer ũ�� (8kbyte) => (8192Byte)
			//1. ���۴� ������ 8k ���� ��������
			//2. bos.close() > �ȿ� flush()
			//bos.flush(); //���۸� ����� 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //flush ����
		}
		
	}

}







