
/*
 * 추상 클래스 와 인터페이스 공통점 
 * 1.스스로 객체 생성이 불가능 (new x)
 * 2.상속과 구현을 통해서만 사용가능하다
 * 3.재정의를 통해서 강제구현이 목적
 * 
 * 추상 클래스 와 인터페이스 다른점
 * 1.추상클래스 (단일상속)
 * 2.인터페이스는 다중 구현이 가능(다중상속)
 * 3.추상클래스 일부 완성된 코드를 가질 수 있다
 * 4.인터페이스는 상수 제외한 미완성자원만 가진다
 * 
 * 
 * 예외)
 * 1. 인터페이스끼리는 상속 (0) extends 가능
 *    interface IA extends IB ,IC, ID { }
 * 2. 하나의 클래스가 여러개의 인터페이스 구현 가능
 *    class Test implements IA, IB , IC
 * 
 * 
 * ****개발자 입장 ****
 * 1. 인터페이스를 다형성의 입장에서 보자
 * 2. 서로 연관성이 없는 클래스에 대해서 하나로 묶는 기반 제공
 * 3. 인터페이스 자원 (~able 표현) 날수있는 , 수리할수 있는
 * 4. 객체간의 연결고리 
 **/

//게임

interface Irepairable{}


class Unit2{
	int hitpoint;
	final int MAX_HP; //초기화
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//유닛 (지상유닛)
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}
//유닛 (공중유닛)
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

//GroundUnit > Tank
class Tank2 extends GroundUnit implements Irepairable{ //repair 대상
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
class Marine2 extends GroundUnit{  //repair 대상 아님
	Marine2(){
		super(30);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Marine2";
	}
}

class CommandCenter  implements Irepairable{ //repair 대상 
	
}


class Scv extends GroundUnit implements Irepairable{  //repair 대상
	Scv(){
		super(60);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString(){
		return "Scv";
	}
	
	//구체화 , 특수화
	//다른 유닛에 대해서 hp충전기능
	/*void repair(Tank2 tank){
		if(tank.hitpoint != tank.MAX_HP){
			tank.hitpoint++; //증가
		}
	}
	void repair(Scv scv){
		if(scv.hitpoint != scv.MAX_HP){
			scv.hitpoint++; //증가
		}
	}*/
	
	//여러가지 : 공통부모 ... : 인터페이스 
	void repair(Irepairable repairunit){
		//Tank2 , Scv
		//repairunit.MaxHp 증가  repairunit 보는 것 없어요
		
		//repairunit 타입은 Tank 부모타입
		//자식은 부모에게 조건없이 / 부모는 자식에게 조건(타입)
		//Tank2 t = (Tank2)repairunit; //down casting
		//t.hitpoint = t.MAX_HP; //충전
		
		//Scv s = (Scv)repairunit;
		//s.hitpoint = s.MAX_HP;
		
		//위 코드는 문제는 repair 대상이 Unit 아닐수 있다
		//CommandCenter > Unit 아니다
		
		//너 unit 이냐 (질문)
		
		//Tank2 > GroundUnit > Unit2
		//Scv   > GroundUnit > Unit2
		//공통점 : Unit2
		
		if(repairunit instanceof Unit2){ //너의 부모가 Unit2
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP){
				unit.hitpoint = unit.MAX_HP;
			}
		}else{
			System.out.println("Unit2 아닙니다");
		}
		//POINT
		//implements Irepairable
		//서로 연관성이 없는 클래스를 묶을 수 있는 근거
		//같은 부모를 가지게 함으로써서 ...
	}
	
}


public class Ex04_abstract_interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전투
		tank.hitpoint -= 10;
		System.out.println("탱크전투:" + tank.hitpoint);
		System.out.println("나 부상당했어 수리해쥐 scv");
		scv.repair(tank);
		System.out.println("탱크수리완료:" + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
