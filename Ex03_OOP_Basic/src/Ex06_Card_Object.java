import kr.or.kosta.Card;

public class Ex06_Card_Object {

	public static void main(String[] args) {
		
		Card.h = 80; //��ü�� �����ڿ� (53ī�尡 �����ϴ� �ڿ�)
		
		Card c = new Card();
		c.number =1;
		c.kind ="heart";
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind ="heart";
		
		c2.cardInfor();
		
		//......53���� (��ü ���� ����)
	}

}
