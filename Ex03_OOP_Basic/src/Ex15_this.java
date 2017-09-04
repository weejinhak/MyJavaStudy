//this 용법
//객체자신을 가르키는 this
//(앞으로 생성될 객체의 주소를 담을 곳을 가정해서 ...)
//생성자를 호출하는 this

class Test6 extends Object{
	int i;
	int j;
	
	Test6(){}
	//Test6(int num , int num2){
	//	i = num;
	//	j = num2;
	//}
	Test6(int i , int j){ 
		//parameter 변수명 instance variable 이름 같이 하면
		//가독성
		//i = i;
		//j = j;
		this.i = i;
		this.j = j;
	}
}

class Scar{
	String color;
	String gearType;
	int door;
	
	Scar(){
		this.color = "red";
		this.gearType = "Auto";
		this.door = 4;
	}
	Scar(String color , String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void print(){
		System.out.println(this.color +"/" + this.gearType +"/"
				          + this.door );
	}
}


public class Ex15_this {

	public static void main(String[] args) {
		Test6 t = new Test6(100,500);
		System.out.println(t.i);
		
		Scar s = new Scar();
		s.print();
		
		Scar s2 = new Scar("gold", "Auto", 2);
		s2.print();
		
		
		
		

	}

}
