import kr.or.kosta.Card;

public class Ex06_Card_Object {

	public static void main(String[] args) {
		
		Card.h = 80; //객체간 공유자원 (53카드가 공유하는 자원)
		
		Card c = new Card();
		c.number =1;
		c.kind ="heart";
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind ="heart";
		
		c2.cardInfor();
		
		//......53수정 (객체 마다 수정)
	}

}
