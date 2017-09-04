
//1. 시스템 전체 사용되는 규칙적인 자원
//2. 순서가 있는 데이터 구조 표현
//3. 월~금 , 색상 , 계절 , 코드성 데이터
//열거형 static final -> Interface  대체 가능
//효과 : 프로그램의 가독성 

enum Season2{ SPRING, SUMMER , FALL , WINTER }

class KostaInfo{
	String classcode;
	String classname;
	Season2 kostaseason; 
	
	KostaInfo(String classcode , String classname, Season2 kostaseason){
		this.classcode = classcode;
		this.classname = classname;
		this.kostaseason = kostaseason;
	}
}

public class Ex12_Enum {

	public static void main(String[] args) {
		KostaInfo javaclass = new KostaInfo("151th", "java", Season2.WINTER);
		System.out.println("기수 : " + javaclass.classcode);
		System.out.println("이름 : " + javaclass.classname);
		System.out.println("계절 : " + javaclass.kostaseason);

	}

}
