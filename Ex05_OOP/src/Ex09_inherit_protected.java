import kr.or.kosta.Bird;

class Ostrich extends Bird{
	void run(){
		System.out.println("�޸���");
	}
	//Ÿ���� ���� �ֱ� ������ �������� �ƴϴ�

	@Override
	protected void moveFast() {
		run();
	}

}
class Sparrow extends Bird{
	
}



public class Ex09_inherit_protected {

	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
		
		Sparrow s = new Sparrow();
		s.fly();

	}

}
