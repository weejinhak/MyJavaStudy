//this ���
//��ü�ڽ��� ����Ű�� this
//(������ ������ ��ü�� �ּҸ� ���� ���� �����ؼ� ...)
//�����ڸ� ȣ���ϴ� this

class Test6 extends Object{
	int i;
	int j;
	
	Test6(){}
	//Test6(int num , int num2){
	//	i = num;
	//	j = num2;
	//}
	Test6(int i , int j){ 
		//parameter ������ instance variable �̸� ���� �ϸ�
		//������
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
