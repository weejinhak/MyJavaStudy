package kr.or.kosta;

public class Bird {
	public void fly(){
		System.out.println("I am flying");
	}
	//����� ������ �� �־����� ���ڴµ�
	protected void moveFast(){
		fly();
	}
}
