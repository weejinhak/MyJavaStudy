import kr.or.kosta.Car;

public class Ex04_Class_Modifier {
	public static void main(String[] args) {
		Car c = new Car();
		c.writeWindow(10);
		int data =c.readWindow();
		System.out.println(data);
		
		c.color = "red";
		System.out.println(c.color);
		
		
		c.setSpeed(10);
		int speed = c.getSpeed();
		System.out.println(speed);
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("현재속도 : " + c.getSpeed());
		c.speedDown();
		c.speedDown();
		System.out.println("현재속도 : " + c.getSpeed());
	} 

}




