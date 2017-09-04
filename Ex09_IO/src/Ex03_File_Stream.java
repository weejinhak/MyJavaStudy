import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

//대상 File
//File 대상 (read , write)
//FileInputStream
//FileOutputStream


//대상파일  C:\\Temp\\a.txt
public class Ex03_File_Stream {
	public static void main(String[] args) {
		//1단계
		//Point : 여기서 IO 자원은 가비지 컬렉터의 관리를 받지 못해요
		//명시적인 자원해제 작업을 해야 한다
		/*try {
			//fs 참조변수 scope try { } 블럭으로
			FileInputStream fs = new FileInputStream("C:\\Temp\\file.txt");
			int data =0;
			while((data = fs.read()) != -1){
				System.out.println("정수(숫자) : " + data);
				//정수 > char  변환
				char c = (char)data;
				System.out.println(c);
			} 
		
			fs.close(); //자원 해제 안될 수 도 있어요
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//fs.close(); 사용 fs scope
		}*/
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path ="C:\\Temp\\file.txt";
		
		try {
			//fs 참조변수 scope try { } 블럭으로
			fs = new FileInputStream(path);
			fos = new FileOutputStream("c:\\Temp\\new.txt");
			//현재 Temp 아네 new.txt 없어요
			//FileOutputStream 파일이 존재하지 않으면 생성기능 .... 
			//그리고 그 파일에 write 
			
			int data =0;
			while((data = fs.read()) != -1){
				fos.write(data);
			} 
			//질문 (변경사항)
			//1. fos = new FileOutputStream("c:\\Temp\\new.txt",true);
			//   두번째 인자 : true > data append
			//2. fos = new FileOutputStream("c:\\Temp\\new.txt"); //default (false)
			//   두번째 인자 : false > data overwrite
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//습관적으로 적용
			//정상실행 , 비정상 실행 되던 강제적으로 실행 되는 블럭
			
			//자원해제 작업 ...
			try{fs.close();}catch(Exception e){} //사용 fs scope
			try{fos.close();}catch(Exception e){} //사용 fos scope
		}
	}

}
