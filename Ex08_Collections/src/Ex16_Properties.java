import java.util.Map;
import java.util.Properties;

//Map 일종
//특수한 Map <String, String> 
//Properties 속성
//APP 공통속성 (환경변수) 저장 관리
//별도로 Properties 확장자를 가진 파일을 만들어서 관리
//다국어 처리 
//Spring 에서 ...

//관리자 이메일 주소 , 버전정보 , 물리적인 저장경로 
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "korea@master.com");
		prop.setProperty("version", "1.1.0");
		prop.setProperty("defaultpath", "C:\\temp\\images");
		System.out.println("웹 사이트 : " + prop.getProperty("master"));
		System.out.println("버전 : " + prop.getProperty("version"));
		System.out.println("특정경로 : " + prop.getProperty("defaultpath"));
	
		
	}

}
