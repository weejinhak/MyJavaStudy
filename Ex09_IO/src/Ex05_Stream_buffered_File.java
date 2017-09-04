import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//파일 read , write
//파일 클래스 단독 사용 
//성능향상 (BufferedInputStream , BufferedOutputStream ) 보조 스트림
//보조스트림은 주스트림을 도와 주는 역활
// 1. File I/O 양을 줄일 수 있다 
// 2. Line 단위의 데이터 처리 가능
// 혼자 서는 안되요 : 	BufferedInputStream bs = new BufferedInputStream(inputStream s)

public class Ex05_Stream_buffered_File {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			//C:\Kosta151\JavaBasic\Labs\Ex09_IO\ 생성
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i = '1' ; i <= '9' ; i++){
				bos.write(i); //buffer 를 통해서 data.txt 파일에 write
			}
			
			//문제 Buffer 특징
			//Buffer 크기 (8kbyte) => (8192Byte)
			//1. 버퍼는 내용이 8k 차야 내보내요
			//2. bos.close() > 안에 flush()
			//bos.flush(); //버퍼를 비워라 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //flush 내포
		}
		
	}

}







