import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문자기반의 데이터 처리 (Char[])
//문자(2Byte > 한글)
//추상클래스 (Reader , Writer)
//상속해서 재정의
//대상 : FileReader , FileWriter
//메모리 : CharArrayReader , CharArrayWriter

//보조 : Buffer 
public class Ex07_Reader_Writer {
	public static void main(String[] args) {
	
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Stream.txt"); //파일 생성기능
			
			int data=0;
			while((data = fr.read()) != -1){
				System.out.println(data + ": " + (char)data);
				
			//QUIZ
			//엔터 , 공백 , 탭 이런 문자는 txt 파일 write 하고
			//싶지 않아요 (특정한 문자(char) 배제)
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
