//�����ڸ� ȣ���ϴ� this
//������ ��Ģ (��ü ������ �������Լ� 1����)
//�׷��� this �� Ȱ���ϸ� �������� ������ �Լ�
//�� ȣ�Ⱑ��

class Test7{
	int i;
	Test7(){}
	Test7(int i){
		this.i = i;
	}
	
}


//���� �� �ڵ�� ������ ���� �ִ� 

class Zcar{
	String color;
	String gearType;
	int door;
	
	Zcar(){
		/*
		this.color = "red";
		this.gearType = "Auto";
		this.door = 4;
		�⺻���� �����ϰ� �;�� red , Auto , 4
		�����ڸ� ȣ���ϴ� this > [�ߺ� �ڵ�(�Ҵ�) ����](********)
		*/
		this("red","Auto",4);
		System.out.println("default ������");
	}
	Zcar(String color , String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("parameter 3�� ȣ��");
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
		System.out.println("parameter 2��");
	}
	Zcar2(String color , int door, String gearType){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("parameter 3�� ȣ��");
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
		this("ȫ�浿",100); //Person p = new Person("ȫ�浿",100)
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
