import kr.or.kosta.Test;

public class Ex04_Exception_throws {

	public static void main(String[] args) {
		
		try{
			Test t = new Test();
			t.call();
		}catch(Exception e){
			System.out.println("���� : "+ e.getMessage());
		}
		
		System.out.println("main  �Լ�");
	}

}
