//생성자를 호출하는 this
//생성자 원칙 (객체 생성시 생성자함수 1개만)
//그런데 this 를 활용하면 여러개의 생성자 함수
//를 호출가능

class Test7{
	int i;
	Test7(){}
	Test7(int i){
		this.i = i;
	}
	
}


//현재 이 코드는 문제를 갖고 있다 

class Zcar{
	String color;
	String gearType;
	int door;
	
	Zcar(){
		/*
		this.color = "red";
		this.gearType = "Auto";
		this.door = 4;
		기본값을 설정하고 싶어요 red , Auto , 4
		생성자를 호출하는 this > [중복 코드(할당) 제거](********)
		*/
		this("red","Auto",4);
		System.out.println("default 생성자");
	}
	Zcar(String color , String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("parameter 3개 호출");
	}
	void print(){
		System.out.println(this.color +"/" + this.gearType +"/"
				          + this.door );
	}
}

class Zcar2{
	String color;
	String gearType;
	int door;
	
	Zcar2(){
		this("red",4);
		System.out.println("default");
	}

	Zcar2(String color , int door){
		this(color,door,"Auto");
		System.out.println("parameter 2개");
	}
	Zcar2(String color , int door, String gearType){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("parameter 3개 호출");
	}
	void print(){
		System.out.println(this.color +"/" + this.gearType +"/"
				          + this.door );
	}
}


class Person{
	String name;
	int age;
	
	Person(){
		this("홍길동",100); //Person p = new Person("홍길동",100)
	}
	Person(String name){
		this.name = name;
		}
	Person(int age){
		this.age = age;
		}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class Ex16_this {

	public static void main(String[] args) {
		//Test7 t = new Test7(100);
		//Person p = new Person();
		////////////////////////////
		//Zcar z = new Zcar();
		//z.print();
		
		////////////////////////////
		Zcar2 z2 = new Zcar2("gold",1,"Auto");
		z2.print();
	}

}
