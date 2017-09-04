
/*
 * 클래스 == 설계도 == Type  
 * 생성 위치 (접근자)
 * 원칙 : 의미같은 것들을 모아 관리
 * 자바 : package 생성해서 관리
 * 사용 : package open > import (경로)
 * class 앞에 접근자를 명시하지 않으면 : default
 * default 의미 : 같은 폴더에서만
 */

class Test{  //default 생략
	int i;   //default 생략
}

public class Ex01_main {

	public static void main(String[] args) {
		
		kr.or.kosta.UTILS.kostaUtils kosta;
		Test t;

	}

}
