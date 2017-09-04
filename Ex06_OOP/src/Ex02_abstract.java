//스타크레프트
//유닛(unit)


//공통기능 (이동좌표 , 이동 , 멈춘다)
abstract class Unit{
	int x,y;
	void stop(){
		System.out.println("stop");
	}
	abstract void move(int x , int y); //각자 강제 구현
}
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		//강제 구현
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동 : " + this.x +"," + this.y);
	}
	
	//Tank 특수화(구체화)
	void ChangeMode(){
		System.out.println("탱크 변환 모드");
	}
	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("마린 이동 : " + this.x +"," + this.y);
		
	}
	//특수화 구체화
	void stimpack(){
		System.out.println("스팀팩기능");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("공중이동 " + this.x +"," + this.y);
		
	}
	//특수화 , 구체화
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
		
		//탱크 3대를 만들고 같은 좌표로 이동 하세요 (객체배열)
		Tank[] tankArray = {new Tank(),new Tank(),new Tank()};
		/*for(int i = 0 ; i < tankArray.length ; i++){
			tankArray[i].move(250, 300);
		}*/
		
		for(Tank tank : tankArray){
			tank.move(555, 444);
		}
		//문제
		//여러개의 Unit 가지고 있다(Tank , Marine , DropShip)
		//3개의 Unit 같은 좌표로 이동 시키세요 
		//hint) Unit 은 Tank 부모타입 , Marine 부모타입, ..)
		//다형성 ...^^
		
		Unit[] unitarray = {new Tank(), 
				            new Marine() , 
				            new DropShip()};
		for(Unit unit : unitarray){
			unit.move(55, 88);
		} //다형성 + override 이해
		
	}

}
