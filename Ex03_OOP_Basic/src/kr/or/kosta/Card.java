package kr.or.kosta;

//요구사항
//카드 53장을 만들어 주세요
//각 카드는 숫자 , 모양 서로 다르고 
//h , w 모든 카드가 같은 값을 가지며
//요청에 변경될 수 있어야 합니다
public class Card {
	public int number;
	public String kind;
	
	public static int h = 10;
	public static int w = 20;
	
	//카드 정보 출력
	public void cardInfor(){
		System.out.printf("번호:%d,모양:%s,h:%d,w:%d\n",
				         number,kind,h,w);
		
	}
}
