//��Ÿũ����Ʈ
//����(unit)


//������ (�̵���ǥ , �̵� , �����)
abstract class Unit{
	int x,y;
	void stop(){
		System.out.println("stop");
	}
	abstract void move(int x , int y); //���� ���� ����
}
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		//���� ����
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵� : " + this.x +"," + this.y);
	}
	
	//Tank Ư��ȭ(��üȭ)
	void ChangeMode(){
		System.out.println("��ũ ��ȯ ���");
	}
	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("���� �̵� : " + this.x +"," + this.y);
		
	}
	//Ư��ȭ ��üȭ
	void stimpack(){
		System.out.println("�����ѱ��");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("�����̵� " + this.x +"," + this.y);
		
	}
	//Ư��ȭ , ��üȭ
	void load(){
		System.out.println("Unit load");
	}
	void unload(){
		System.out.println("Unit unload");
	}
	
}


public class Ex02_abstract {
	public static void main(String[] args) {
		/*Tank t = new Tank();
		t.move(100, 200);
		t.stop();
		t.ChangeMode();
		
		Marine m = new Marine();
		m.move(200, 300);
		m.stop();
		m.stimpack();*/
		
		//��ũ 3�븦 ����� ���� ��ǥ�� �̵� �ϼ��� (��ü�迭)
		Tank[] tankArray = {new Tank(),new Tank(),new Tank()};
		/*for(int i = 0 ; i < tankArray.length ; i++){
			tankArray[i].move(250, 300);
		}*/
		
		for(Tank tank : tankArray){
			tank.move(555, 444);
		}
		//����
		//�������� Unit ������ �ִ�(Tank , Marine , DropShip)
		//3���� Unit ���� ��ǥ�� �̵� ��Ű���� 
		//hint) Unit �� Tank �θ�Ÿ�� , Marine �θ�Ÿ��, ..)
		//������ ...^^
		
		Unit[] unitarray = {new Tank(), 
				            new Marine() , 
				            new DropShip()};
		for(Unit unit : unitarray){
			unit.move(55, 88);
		} //������ + override ����
		
	}

}
