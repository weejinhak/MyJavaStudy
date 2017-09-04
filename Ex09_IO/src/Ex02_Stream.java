import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex02_Stream {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		byte[] temp = new byte[10];
		System.out.println("temp before : "+ Arrays.toString(temp));
		
		input = new ByteArrayInputStream(inSrc); //read �� ���
		output = new ByteArrayOutputStream();
		
		//inSrc [read] �ؼ� temp �迭 [write]
		input.read(temp, 0, temp.length);
		//inSrc > temp �迭�� 0��° ����� temp�迭�� ���̸�Ŭ 
		System.out.println("temp after : "+ Arrays.toString(temp));
		
		
		output.write(temp,5,5);
		//write ��� (output)
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		outSrc = output.toByteArray();
		
		System.out.println("outSrc after : " + Arrays.toString(outSrc));

		
		//�߻��ڿ� (inputstream, outputstream) read() , write() ���� ����
	}

}
