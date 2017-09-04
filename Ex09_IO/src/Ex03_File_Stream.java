import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

//��� File
//File ��� (read , write)
//FileInputStream
//FileOutputStream


//�������  C:\\Temp\\a.txt
public class Ex03_File_Stream {
	public static void main(String[] args) {
		//1�ܰ�
		//Point : ���⼭ IO �ڿ��� ������ �÷����� ������ ���� ���ؿ�
		//������� �ڿ����� �۾��� �ؾ� �Ѵ�
		/*try {
			//fs �������� scope try { } ������
			FileInputStream fs = new FileInputStream("C:\\Temp\\file.txt");
			int data =0;
			while((data = fs.read()) != -1){
				System.out.println("����(����) : " + data);
				//���� > char  ��ȯ
				char c = (char)data;
				System.out.println(c);
			} 
		
			fs.close(); //�ڿ� ���� �ȵ� �� �� �־��
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//fs.close(); ��� fs scope
		}*/
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path ="C:\\Temp\\file.txt";
		
		try {
			//fs �������� scope try { } ������
			fs = new FileInputStream(path);
			fos = new FileOutputStream("c:\\Temp\\new.txt");
			//���� Temp �Ƴ� new.txt �����
			//FileOutputStream ������ �������� ������ ������� .... 
			//�׸��� �� ���Ͽ� write 
			
			int data =0;
			while((data = fs.read()) != -1){
				fos.write(data);
			} 
			//���� (�������)
			//1. fos = new FileOutputStream("c:\\Temp\\new.txt",true);
			//   �ι�° ���� : true > data append
			//2. fos = new FileOutputStream("c:\\Temp\\new.txt"); //default (false)
			//   �ι�° ���� : false > data overwrite
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//���������� ����
			//������� , ������ ���� �Ǵ� ���������� ���� �Ǵ� ��
			
			//�ڿ����� �۾� ...
			try{fs.close();}catch(Exception e){} //��� fs scope
			try{fos.close();}catch(Exception e){} //��� fos scope
		}
	}

}
