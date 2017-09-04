/*
 * 요구사항 
 * 장바구니 (Cart)
 * 장바구니 (매장에 있는 모든 전자제품을 담을 수 있다)
 * 장바구니 크기가 고정되어 있다(10개)
 * 
 * 
 * 계산대 (summary()) 기능
 * 당신이 구매한 물건 : 가격 나열
 * 총누적금액 : 총구매금액
 * 
 * hint) 카트 물건 담는 행위는 (Buy())
 * hint) summary() 함수 호출되면 
 */

class Product2{
	int price;
	int bonuspoint;
	
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}
class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	@Override
	public String toString(){ //Object 재정의
		return "KtTv";
	}
}
class Audio2 extends Product2{
	Audio2(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
}
class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer2{ //구매자
	int money = 0;
	int bonuspoint=0;
	//장바구니 생성 (다형성) ***********
	Product2[] Cart = new Product2[10]; 
	int index=0;
	///////////////////////////////////
	Buyer2(){
		this(10000,0);
	}
	Buyer2(int money , int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	
	void Buy(Product2 product){
		//카트에 담는 것 (기존 코드 동일)
		if(this.money < product.price){
			System.out.println(" [ 고객님 잔액이 부족합니다 ]");
			return; //함수의 종료
		}
		if(this.index >= 10){
			System.out.println("[ 고객님 넘 많이 사셨어요 ]");
			return;
		}
		//장바구니 담기
		//예외처리 : if 통해서 배열 길이 체크
		Cart[index++] = product; //++index 차이점 (1번쨰)
		////////////////////////////////////////////////
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[구매한 물건 :" + product.toString() + "]");
		System.out.println("[현재 잔액 :" + this.money + "]");
		System.out.println("[현재 포인트 :" + this.bonuspoint + "]");
		
	}
	//계산대 (장바구니)
	//장바구니에 담긴 물건을 계산
	//물건의 총액
	//물건의 목록  출력
	
	void Summary(){
		//화면출력
				//구매한 물품의 총금액 
				//총 포인트
				//구매한 물건의 목록
				int totalprice = 0;
				int totalbonuspoint = 0;
				String productList = "";
				for(int i=0 ; i < index ;i++){
				//for(int i=0 ; i < Cart.length ;i++){
				//	if(Cart[i] == null) break;
					totalprice += Cart[i].price;
					totalbonuspoint += Cart[i].bonuspoint;
					productList += Cart[i].toString() + "  ";
				}
				System.out.println("**************************************");
				System.out.println("구매한 물건 총액 : " + totalprice);
				System.out.println("포인트 총액 : " + totalbonuspoint);
				System.out.println("구매한 물건 목록 : " + productList + "");
				System.out.println("*************************************");
	}
}	
	
public class Ex15_inherit_poly_Array {

	public static void main(String[] args) {
		NoteBook2 notebook = new NoteBook2();
		Audio2 audio = new Audio2();
		KtTv2 kttv = new KtTv2();
		
		/*
		Buyer2 buyer = new Buyer2(10000,0);
		//구매
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		
		buyer.Summary();
		*/
		Buyer2 buyer = new Buyer2(1000,0);
		//구매
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		
		buyer.Summary();
	}

}
