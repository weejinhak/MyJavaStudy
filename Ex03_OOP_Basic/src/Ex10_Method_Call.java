
class Data{
	int i;
}

public class Ex10_Method_Call {
	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		System.out.println("d.i : " + d.i);
		call(d); //call by references
		System.out.println("d.i : " + d.i);

		Vcall(d.i); //�� : 5555 //call by value
	}
    
	static void call(Data d){ //�ּҰ� ����
		System.out.println("�Լ� : " + d.i);
		d.i = 5555;
	}
	static void Vcall(int x){
		x = 8888;
		System.out.println("x param : " + x);
	}
	
	
	
}
