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
		
		//�θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҰ���
		//������ �ִ�
		//�� �θ�͸� ���� �ִ�
		

	}

}
