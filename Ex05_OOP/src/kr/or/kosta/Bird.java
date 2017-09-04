package kr.or.kosta;

public class Bird {
	public void fly(){
		System.out.println("I am flying");
	}
	//당신이 재정의 해 주었으면 좋겠는데
	protected void moveFast(){
		fly();
	}
}
