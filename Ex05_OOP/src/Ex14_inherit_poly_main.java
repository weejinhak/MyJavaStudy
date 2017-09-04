/*
시나리오
저희는 가전제품 매장 솔루션 개발 사업팀 입니다
A라는 가전제품 매장이 오픈되면 ..
클라이언트  요구사항
가전제품의 공통사항은 제품의 가격정보 , 제품의 포인트 정보를 가진다
각 가전 제품은 제품별 특징을 가지고 있다 
각 상품은 이름을 가진다(ex :  Tv , Audio , Computer)
각 제품은 제품마다 다른 가격을 가진다(Tv : 5000 , Audio : 6000)
제품의 포인트는 가격의 10%를 가진다 

시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
구매자는 제품을 구매할수 있다 구매행위를 하게 되면 금액은 감속하고
포인트는 올라간다
구매자는 처음 기본 금액을 가진다
 
*/
class Product{
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString(){ //Object 재정의
		return "KtTv";
	}
}
class Audio extends Product{
	Audio(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer{ //구매자
	int money = 1000;
	int bonuspoint=0;
	
	//구매행위
	//구매행위 (물건의 가격정보 > 잔액 , 포인트 갱신)
	//매장 제품객체 함수parameter 
	
	
	//1차
	//매장이 장사가 잘되서 100개의 다른 제품을 추가 (POS 등록)
	//추석 맞이 세일 > 항의 청소기 , 핸드폰 구매 안되요
	//하와이 서버접속 > 100개의 신규 제품에 구매할수 있는 함수
	//를 만들어 주어야 합니다
	/*void KtTvBuy(KtTv n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}
	void AudioBuy(Audio n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}
	void NoteBookBuy(NoteBook n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}*/
	
	
	//2차 개선 
	//100개의 물건이 100개의 물건을 구매하는 함수이름이 다 다르다
	//함수의 이름을 동일하게 해주세요 
	//overloading 개념 (함수)
/*	void Buy(KtTv n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}
	void Buy(Audio n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}
	void Buy(NoteBook n){
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}*/
	
	//3차 개선
	//물건이 아무리 추가되어도 구매행위는 이루어져야 한다
	//Why : 즐거운 휴가를 위해서
	//*반복적인 코드를 제거 
	//*하나의 함수가 물건 구매 처리
	//전제조건 : 모든 제품은 Product 상속하고 있다면
	//Product 모든 객체 부모타입
    // 하나의 [참조변수]가 [여러개의 타입]을 가질 수 있다 
	//**주의사항 : 부모타입으로 접근 하더라도 자식 재정의 된 자원이 
	//있다면 재정의 자원을 호출 (super)
	
	//** 
	void Buy(Product n){ //다형성
		if(this.money < n.price){
			System.out.println("고객님 잔액이 부족합니다");
			return; //함수의 exit 
		}
		//실구매 행위
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("구매한 물건:" + n.toString());
	}
	
}

public class Ex14_inherit_poly_main {

	public static void main(String[] args) {
		
		NoteBook notebook = new NoteBook();
		Audio audio = new Audio();
		KtTv kttv = new KtTv();
		
		/*
		1차 TEST
		Buyer buyer = new Buyer();
		buyer.NoteBookBuy(notebook);//노트북 구매
		buyer.KtTvBuy(kttv);
		buyer.KtTvBuy(kttv);
		*/
		Buyer buyer = new Buyer();
		buyer.Buy(notebook);//노트북 구매
		buyer.Buy(kttv);
		buyer.Buy(kttv);
	}

}
