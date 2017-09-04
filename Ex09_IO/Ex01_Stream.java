import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * I/O 입출력 
 * 
 * Stream (연결통로 , 입출력통로 ) => 빨대
 * Stream (고정된 크기 빨대 : Byte 단의 데이처 처리) > byte[] 
 * 
 * JAVA API
 * 추상클래스 (inputstream(read) , outputstream(write))
 * 상속하는 클래스 (대상)
 * File : FileinputStream , FileoutputStream
 * Memory : ByteArrayinputStream , ByteArrayoutputStream
 * 
 * 추가 : 프로세스 ,...
 * 
 * 보조 스트림 
 * (Buffer)
 * File (read ,write) (I/O 성능 향상) 보조를 사용
 * 
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//Memory 대상으로 ...
		//byte (-128 ~0~ 127)
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//[0] => 0
		//[9] => 9
		//length =>10
		byte[] outSrc = null; //배열은 객체(null 초기화)
		
		ByteArrayInputStream input = null; //read
		ByteArrayOutputStream output = null; //write
		
		input = new ByteArrayInputStream(inSrc); //생성자에서 read 대상 
		output = new ByteArrayOutputStream(); //통해서 write 
		System.out.println("outSrc Before : " + Arrays.toString(outSrc));
		
		//공식같은 로직
		int data = 0;
		while((data = input.read()) != -1){ //더 이상 read() 할 것이 없으면 -1
			//한 Byte read > data 변수에
			System.out.println(data);
			
			//input.read() > 내부적으로 next 
			//System.out.println("read 한 값 출력 : " + input.read());
			output.write(data);
			//write 대상은 :ByteArrayOutputStream 에 data 값을 write 한다
		}
		
		//System.out.println(output.toByteArray());
		outSrc = output.toByteArray();
		System.out.println("outSrc After : " + Arrays.toString(outSrc));
	}

}








