class Tv{
	boolean power;
	int ch;
	
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}
class Vcr{ //비디오 플레이어
	boolean power;
	int counter = 0;
	
	void Power(){
		this.power = !this.power;
	}
	void Play(){System.out.println("재성");}
	void Stop(){System.out.println("정지");}
	void Rew(){}
	void Ff(){}
}
//vcr 기능을 가지는 Tv 만들고 싶다
//class Tv , class Vcr 
//모델(TvVcr) : Tv , Vcr (공통기능)

//다중상속 : TvVcr extends Tv, Vcr{} (불가)
//계층적 상속은 하지마세요

//class TvVcr { Tv t , Vcr v } //has~a
//class TvVcr extends Tv { Vcr v} //is~a , has~a

//Tv 상속 (근거 : 비중이 높은 클래스)
//TvVcr (Tv 가 나오는데 Vcr 해석)

class TvVcr extends Tv{
	//Vcr vcr = new Vcr();
	//분리
	Vcr vcr;
	
	void VConnect(Vcr vcr){
		this.vcr = vcr;
	}
}

public class Ex03_inherit_Single {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		Vcr v = new Vcr();
		t.VConnect(v);
		
		
		t.Power();
		System.out.println("전원 : " + t.power);
		t.Chup();
		System.out.println("Tv채널: " + t.ch);
		
		//비디오
		t.vcr.Power();
		System.out.println("비디오전원 : " + t.vcr.power);
		t.vcr.Play();
		t.vcr.Stop();
		t.vcr.Power(); //vcr 전원끄기
		t.Power(); //Tv 전원끄기
		
		System.out.println("TV전원 : " + t.power);
		System.out.println("비디오전원 : " + t.vcr.power);
	}

}
