
/*
 * �߻� Ŭ���� �� �������̽� ������ 
 * 1.������ ��ü ������ �Ұ��� (new x)
 * 2.��Ӱ� ������ ���ؼ��� ��밡���ϴ�
 * 3.�����Ǹ� ���ؼ� ���������� ����
 * 
 * �߻� Ŭ���� �� �������̽� �ٸ���
 * 1.�߻�Ŭ���� (���ϻ��)
 * 2.�������̽��� ���� ������ ����(���߻��)
 * 3.�߻�Ŭ���� �Ϻ� �ϼ��� �ڵ带 ���� �� �ִ�
 * 4.�������̽��� ��� ������ �̿ϼ��ڿ��� ������
 * 
 * 
 * ����)
 * 1. �������̽������� ��� (0) extends ����
 *    interface IA extends IB ,IC, ID { }
 * 2. �ϳ��� Ŭ������ �������� �������̽� ���� ����
 *    class Test implements IA, IB , IC
 * 
 * 
 * ****������ ���� ****
 * 1. �������̽��� �������� ���忡�� ����
 * 2. ���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ��� ����
 * 3. �������̽� �ڿ� (~able ǥ��) �����ִ� , �����Ҽ� �ִ�
 * 4. ��ü���� ����� 
 **/

//����

interface Irepairable{}


class Unit2{
	int hitpoint;
	final int MAX_HP; //�ʱ�ȭ
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//���� (��������)
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}
//���� (��������)
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

//GroundUnit > Tank
class Tank2 extends GroundUnit implements Irepairable{ //repair ���
	Tank2(){
		super(50); 
		this.hitpoint = this.MAX_HP;
		//MAX_HP == hitpoint 
	}
	@Override
	public String toString(){
		return "Tank2";
	}
}
class Marine2 extends GroundUnit{  //repair ��� �ƴ�
	Marine2(){
		super(30);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Marine2";
	}
}

class CommandCenter  implements Irepairable{ //repair ��� 
	
}


class Scv extends GroundUnit implements Irepairable{  //repair ���
	Scv(){
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Scv";
	}
	
	//��üȭ , Ư��ȭ
	//�ٸ� ���ֿ� ���ؼ� hp�������
	/*void repair(Tank2 tank){
		if(tank.hitpoint != tank.MAX_HP){
			tank.hitpoint++; //����
		}
	}
	void repair(Scv scv){
		if(scv.hitpoint != scv.MAX_HP){
			scv.hitpoint++; //����
		}
	}*/
	
	//�������� : ����θ� ... : �������̽� 
	void repair(Irepairable repairunit){
		//Tank2 , Scv
		//repairunit.MaxHp ����  repairunit ���� �� �����
		
		//repairunit Ÿ���� Tank �θ�Ÿ��
		//�ڽ��� �θ𿡰� ���Ǿ��� / �θ�� �ڽĿ��� ����(Ÿ��)
		//Tank2 t = (Tank2)repairunit; //down casting
		//t.hitpoint = t.MAX_HP; //����
		
		//Scv s = (Scv)repairunit;
		//s.hitpoint = s.MAX_HP;
		
		//�� �ڵ�� ������ repair ����� Unit �ƴҼ� �ִ�
		//CommandCenter > Unit �ƴϴ�
		
		//�� unit �̳� (����)
		
		//Tank2 > GroundUnit > Unit2
		//Scv   > GroundUnit > Unit2
		//������ : Unit2
		
		if(repairunit instanceof Unit2){ //���� �θ� Unit2
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP;
			}
		}else{
			System.out.println("Unit2 �ƴմϴ�");
		}
		//POINT
		//implements Irepairable
		//���� �������� ���� Ŭ������ ���� �� �ִ� �ٰ�
		//���� �θ� ������ �����νἭ ...
	}
	
}


public class Ex04_abstract_interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint -= 10;
		System.out.println("��ũ����:" + tank.hitpoint);
		System.out.println("�� �λ���߾� �������� scv");
		scv.repair(tank);
		System.out.println("��ũ�����Ϸ�:" + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
