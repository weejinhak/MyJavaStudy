import java.io.File;

//파일 또는 폴더(directory) 다루는 클래스
//MS(c#) > File , Directory
//java   > File 하나가 2가지 역활

//File 클래스
//파일 생성, 삭제 , 수정
//폴더 생성 , 삭제 

//경로
//절대경로 : C:\ , D:\  C:\\Temp\\a.txt
//상대경로 : 현재 위치

//File 클래스 (정보 표현) get...
public class Ex09_File {
	public static void main(String[] args) {
	  String path = "C:\\Temp\\file.txt";
	  File f = new File(path); //file.txt 정보 추출
	  
	  String filename = f.getName();
	  System.out.println("파일명 : " + filename);
	  
	  //파일 삭제
	  //f.delete(); return true , false
	  //filename (파일명, 확장자)
	  //두가지 찿아보세요
	  
	  System.out.println("전체 경로 : " + f.getPath());
	  System.out.println("절대 경로 : " + f.getAbsolutePath());
	  System.out.println("너 폴더니 : " + f.isDirectory());
	  System.out.println("너 파일이니 : " + f.isFile());
	  System.out.println("파일의 크기 : " + f.length() + "byte");
	  System.out.println("부모경로 : " + f.getParent());
	  System.out.println("파일 존재 여부 : " + f.exists());

	}

}
