import kr.or.kosta.Emp;

//��Ӱ��迡�� ������(protected)

class Dclass{
	private int i;
	public int j;
	protected int k;
	int p; //default
}

class child2 extends Emp{
	void method(){
		//this.j;
		//this.k;  (��Ӱ��迡�� public)
		
		//�ٸ� ����(package) �ȿ� protected ������
		//����ϱ� ���ؼ�  ����� �̿� 
		//��ü ���忡�� (private) ��Ӱ��� (public)
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
		//e.k; (x) protected �ٸ� package
		           //���� : private 
		child2 c = new child2();
		c.method();
	}

}
