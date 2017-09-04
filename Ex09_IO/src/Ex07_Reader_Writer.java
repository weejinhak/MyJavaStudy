import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//���ڱ���� ������ ó�� (Char[])
//����(2Byte > �ѱ�)
//�߻�Ŭ���� (Reader , Writer)
//����ؼ� ������
//��� : FileReader , FileWriter
//�޸� : CharArrayReader , CharArrayWriter

//���� : Buffer 
public class Ex07_Reader_Writer {
	public static void main(String[] args) {
	
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Stream.txt"); //���� �������
			
			int data=0;
			while((data = fr.read()) != -1){
				System.out.println(data + ": " + (char)data);
				
			//QUIZ
			//���� , ���� , �� �̷� ���ڴ� txt ���� write �ϰ�
			//���� �ʾƿ� (Ư���� ����(char) ����)
			//  /t  , ' ' , /n  \r  	
			 if(data != '\n' && data != '\r' && data != '\t' && data != ' '){
				 fw.write(data);
			 }
			
			}
			
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
