//�ϳ��� ���� ������ ������ü�� ������ �� �ִ�
//�� ��Ӱ��迡��
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
		c = f; //�ּҰ� �Ҵ� (�ڽ� : f , �θ� : c)
		System.out.println(c.toString());
		System.out.println(f.toString());
		
		FireCar f2 = (FireCar)c; //������� down-casting
		System.out.println(f == f2);

		
	}

}
