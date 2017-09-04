import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * I/O ����� 
 * 
 * Stream (������� , �������� ) => ����
 * Stream (������ ũ�� ���� : Byte ���� ����ó ó��) > byte[] 
 * 
 * JAVA API
 * �߻�Ŭ���� (inputstream(read) , outputstream(write))
 * ����ϴ� Ŭ���� (���)
 * File : FileinputStream , FileoutputStream
 * Memory : ByteArrayinputStream , ByteArrayoutputStream
 * 
 * �߰� : ���μ��� ,...
 * 
 * ���� ��Ʈ�� 
 * (Buffer)
 * File (read ,write) (I/O ���� ���) ������ ���
 * 
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//Memory ������� ...
		//byte (-128 ~0~ 127)
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//[0] => 0
		//[9] => 9
		//length =>10
		byte[] outSrc = null; //�迭�� ��ü(null �ʱ�ȭ)
		
		ByteArrayInputStream input = null; //read
		ByteArrayOutputStream output = null; //write
		
		input = new ByteArrayInputStream(inSrc); //�����ڿ��� read ��� 
		output = new ByteArrayOutputStream(); //���ؼ� write 
		System.out.println("outSrc Before : " + Arrays.toString(outSrc));
		
		//���İ��� ����
		int data = 0;
		while((data = input.read()) != -1){ //�� �̻� read() �� ���� ������ -1
			//�� Byte read > data ������
			System.out.println(data);
			
			//input.read() > ���������� next 
			//System.out.println("read �� �� ��� : " + input.read());
			output.write(data);
			//write ����� :ByteArrayOutputStream �� data ���� write �Ѵ�
		}
		
		//System.out.println(output.toByteArray());
		outSrc = output.toByteArray();
		System.out.println("outSrc After : " + Arrays.toString(outSrc));
	}

}








