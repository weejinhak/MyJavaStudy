//상속관계에서 override(overriding) : 재정의(함수)
//상속관계에서 자식클래스가 부모 클래스의 메서드를 재정의
//재정의(내용 { } 안에 내용)

//문법 (override)
//1. 부모함수의 이름과 같아야 한다
//2. 부모함수의 파라메터와 같아야 한다
//3. 부모함수의 리턴타입과 같아야 한다
//4. 결국 부모함수의 {중괄호 블럭 안의 내용이 바뀌면 재정의}

//3개의 좌표값을 출력하는데
//부모가 가지는 getPosition 을 재활용 할 수 없을까
class Point2{
	int x = 3;
	int y = 5;
	String getPosition(){
		return "x :" + this.x + " y :" + this.y;
	}
}
class Point3D extends Point2 {
	//추가
	int z = 6;
	/*String get3DPosition(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}*/
	
	//내가 의도한것은 부모함수의 재정의 
	//오타 (일반함수)
	/*String getPositon(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}*/
	
	@Override //annotation (컴파일러에 미리 설정된 정보 기준 강제성)
	String getPosition(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}
}


public class Ex04_inherit_override {
	public static void main(String[] args) {
		Point3D point = new Point3D();
		//System.out.println(point.get3DPosition());
		System.out.println(point.getPosition());
		
	}

}
