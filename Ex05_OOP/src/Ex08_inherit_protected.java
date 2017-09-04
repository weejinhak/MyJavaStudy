import kr.or.kosta.Emp;

//상속관계에서 접근자(protected)

class Dclass{
	private int i;
	public int j;
	protected int k;
	int p; //default
}

class child2 extends Emp{
	void method(){
		//this.j;
		//this.k;  (상속관계에서 public)
		
		//다른 폴더(package) 안에 protected 접근자
		//사용하기 위해서  상속을 이용 
		//객체 입장에서 (private) 상속관계 (public)
	    System.out.println(this.k);
	}
}


public class Ex08_inherit_protected {

	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.i (X)
		//d.j; (0)
		//d.k; (0)
		//d.p; (0)
	
		//e.j; (0)
		//e.k; (x) protected 다른 package
		           //성격 : private 
		child2 c = new child2();
		c.method();
	}

}
