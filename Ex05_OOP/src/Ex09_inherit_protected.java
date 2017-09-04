import kr.or.kosta.Bird;

class Ostrich extends Bird{
	void run(){
		System.out.println("달린다");
	}
	//타조는 날수 있기 때문에 빠른것이 아니다

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
