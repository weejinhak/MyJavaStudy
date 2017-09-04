class Pbase{
	
}
class Cbase extends Pbase{}
class Dbase extends Pbase{}

public class Ex12_inherit_poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		Pbase p = c;
		System.out.println(c==p);
		
		Dbase d = new Dbase();
		p = d;
		
		System.out.println(c==p);
		System.out.println(d==p);
		
		//부모타입의 참조변수는 자식타입의 주소값을
		//가질수 있다
		//단 부모것만 볼수 있다
		

	}

}
