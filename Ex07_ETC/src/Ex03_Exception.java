import java.io.IOException;

//게임 CD 설치
//임시폴더 (CD copy)
//인스톨
//임시폴더 삭제

//인스톨 도중에 오류 > 임시폴더 삭제
//인스톨 정상        > 임시폴더 삭제

//try{} catch(Exception e) {} finally{ 강제 실행 블럭}
public class Ex03_Exception {
	
	static void StartInstall(){
		System.out.println("install");
	}
	static void CopyFiles(){
		System.out.println("copy file");
	}
	static void DeleteFiles(){
		System.out.println("delete file");
	}
	
	public static void main(String[] args) {
		try{
			StartInstall();
			CopyFiles();
			
			//사용자 예외 던지기 (예외 객체를 내가 만들어서)
			IOException e = new IOException("Copy 오류");
			throw e; //강제 예외 던지기 (사용자)
			
		}catch(Exception e){
			System.out.println("예외 던지기 : " + e.getMessage());
		}finally{
			//강제 실행  (return .. ) 
			DeleteFiles();
		}
		
	}

}
