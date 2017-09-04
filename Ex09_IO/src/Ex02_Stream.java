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
		
		input = new ByteArrayInputStream(inSrc); //read 할 대상
		output = new ByteArrayOutputStream();
		
		//inSrc [read] 해서 temp 배열 [write]
		input.read(temp, 0, temp.length);
		//inSrc > temp 배열에 0번째 방부터 temp배열의 길이만클 
		System.out.println("temp after : "+ Arrays.toString(temp));
		
		
		output.write(temp,5,5);
		//write 대상 (output)
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		outSrc = output.toByteArray();
		
		System.out.println("outSrc after : " + Arrays.toString(outSrc));

		
		//추상자원 (inputstream, outputstream) read() , write() 역할 이해
	}

}
