//하나의 참조 변수가 여러객체를 참조할 수 있다
//단 상속관계에서
class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive car");
	}
	void stop(){
		System.out.println("stop car");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("water car");
	}
}
public class Ex13_inherit_poly {
	public static void main(String[] args) {
		FireCar f = new FireCar();
		f.drive();
		f.stop();
		f.water();
		
		Car c = null;
		c = f; //주소값 할당 (자식 : f , 부모 : c)
		System.out.println(c.toString());
		System.out.println(f.toString());
		
		FireCar f2 = (FireCar)c; //명시적인 down-casting
		System.out.println(f == f2);

		
	}

}
